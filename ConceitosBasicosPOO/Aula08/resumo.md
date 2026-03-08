**Aula de Referência:** Curso POO teoria #08a - Relacionamento de Agregação

## 1. Introdução ao Relacionamento de Agregação
Na aula anterior, preparamos o terreno construindo a classe `Lutador` de forma completamente isolada e encapsulada. Agora, o sistema evolui para fazer com que diferentes classes interajam entre si para gerar ações.
* **Definição Técnica:** A Agregação é um tipo específico de relacionamento estrutural entre classes, intimamente conhecido no mundo da programação como a relação "tem um" (ou "tem vários").
* **Justificativa de Uso:** Em vez de criar um código gigantesco em um único lugar, criamos classes especializadas e independentes que se unem para realizar uma tarefa maior. No nosso exemplo, a nova classe `Luta` não existe sem os lutadores; ela precisa "agregar" objetos da classe `Lutador` para que o combate do torneio possa efetivamente acontecer.

## 2. Tipos Abstratos de Dados
Esta é uma das grandes "mágicas" da Programação Orientada a Objetos quando lidamos com sistemas mais elaborados.
* **A Mudança de Paradigma:** Normalmente, costumamos declarar atributos usando tipos primitivos da linguagem, como `int` (para a quantidade de rounds) ou `boolean` (para saber se a luta está aprovada). Porém, nós podemos transformar as classes que nós mesmos criamos em Tipos de Dados.
* **Aplicações na Classe `Luta`:** Os atributos `desafiado` e `desafiante` dentro da classe `Luta` não são variáveis de texto (`String`) guardando os nomes dos atletas. Eles são declarados como sendo do tipo `Lutador`. Ou seja, esses atributos vão guardar **instâncias inteiras** (objetos completos) da classe `Lutador`. Isso permite que a própria Luta consiga puxar o peso, o nome e o cartel de vitórias diretamente daquele objeto.

## 3. A UML e a Multiplicidade
A modelagem visual através do Diagrama de Classes evolui para ilustrar essa dependência.
* **A Representação Visual:** No diagrama, o relacionamento de agregação é desenhado através de uma linha sólida conectando as duas classes, com a obrigatoriedade de ter um **losango branco** na ponta da classe que funciona como "recipiente" (neste caso, a classe `Luta` possui o losango, pois é ela quem agrega os lutadores).
* **Multiplicidade:** Trata-se da regra de quantidade matemática dessa relação. O modelo determina que:
    * Um `Lutador` pode participar de nenhuma (0) ou de várias (*) lutas ao longo da sua carreira (o que é representado no diagrama por `0..*`).
    * Uma `Luta` não pode acontecer sozinha; ela obrigatoriamente tem que agregar mais de um lutador para ser disputada (representado pelo símbolo `*`).

## 4. A Inteligência dos Métodos (Regras de Negócio da Luta)
A classe `Luta` atua como a entidade controladora (o "juiz" do campeonato).
* **O Método `marcarLuta()`:** Ele recebe dois objetos inteiros (`Lutador l1` e `Lutador l2`) como parâmetros. Sua função é validar as regras de negócio: a luta só muda o atributo `aprovada` para verdadeiro se os dois lutadores forem da **mesma categoria** (checando via *getter* da classe Lutador) e se forem lutadores **diferentes** (impossibilitando o mesmo objeto de lutar contra si mesmo).
* **O Método `lutar()`:** É a execução principal. Ele primeiramente checa se a luta está aprovada. Se sim, invoca os métodos de `apresentar()` de cada objeto lutador e então gera um resultado aleatório (randômico) na memória: 0 para empate, 1 para vitória do desafiado e 2 para vitória do desafiante. Através da estrutura de escolha (`switch/case`), o método acessa diretamente os lutadores agregados e dispara as rotinas `ganharLuta()`, `perderLuta()` ou `empatarLuta()`, atualizando a contagem do cartel deles de forma orgânica.

## 5. Conclusão Metodológica
A Orientação a Objetos prova seu valor na etapa de montagem do programa principal. Construir a infraestrutura (Classes, Encapsulamento, Métodos e Agregação) exige bastante tempo de codificação — o professor faz a analogia com o árduo trabalho de criar um modelo de personagem 3D para um filme de animação. Todavia, uma vez que a base está sólida, o programador principal consegue instanciar vários lutadores e dezenas de lutas chamando apenas duas ou três linhas de código muito limpas. O sistema passa a funcionar sozinho, validando regras de negócio e calculando resultados sem risco de quebra.