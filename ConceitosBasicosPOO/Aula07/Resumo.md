**Aula de Referência:** Curso POO Teoria #07a - Relacionamento entre Classes

## 1. Introdução ao Relacionamento entre Classes
Até este momento do curso, trabalhamos com a modelagem e programação de apenas uma classe por vez. No entanto, no mundo real da Programação Orientada a Objetos, sistemas complexos exigem que diferentes classes "falem umas com as outras". A partir de agora, o foco passa a ser o relacionamento entre essas entidades, que é a base estrutural para construir programas mais avançados e dinâmicos.

## 2. Tipos Personalizados e Objetos Compostos
Nas aulas iniciais, vimos que atributos geralmente armazenam tipos primitivos da linguagem (inteiros, strings, valores lógicos).
* **A Mudança de Paradigma:** Na POO avançada, uma classe que você mesmo criou pode se transformar no "tipo" de dado de um atributo dentro de uma segunda classe.
* **Objeto Composto:** Quando um objeto possui como característica (atributo) um outro objeto independente (ex: uma classe `Luta` que vai possuir atributos do tipo `Lutador`), dizemos que há a formação de um objeto composto. Entender isso é o degrau necessário para aplicar a "Agregação".

## 3. Preparando o Terreno: O Exemplo do *Ultra Emoji Combat*
Para demonstrar o relacionamento de forma lúdica e prática, é criado o torneio de lutas *Ultra Emoji Combat* (UEC). O primeiro passo dessa arquitetura (o foco principal desta aula) é construir os componentes do torneio.
* **A Classe `Lutador`:** É modelada com uma série de atributos essenciais para definir o estado de cada atleta, tais como `nome`, `nacionalidade`, `peso`, `categoria`, `vitorias`, `derrotas` e `empates`.

## 4. Revisando e Aplicando o Encapsulamento
Mesmo ao construir classes que farão parte de um objeto composto, o primeiro pilar (Encapsulamento) jamais deve ser quebrado.
* **Atributos Estritamente Privados:** Todos os atributos do `Lutador` nascem marcados com o modificador de visibilidade `private`. A regra absoluta da segurança é não deixar o mundo externo mexer diretamente nas propriedades da classe.
* **Métodos Especiais no Controle:** Para injetar e resgatar dados com segurança, utiliza-se ativamente o Método Construtor (para instanciar o objeto já recebendo seus parâmetros básicos) acompanhado dos métodos de acesso e modificação (*Getters* e *Setters*).

## 5. A Inteligência dos Métodos (Regras de Negócio)
Uma lição crucial deste módulo é que métodos não são meros repassadores de dados; eles aplicam as lógicas de negócio do mundo real.
* **A Categoria Automática:** Em vez de permitir que um usuário digite livremente a categoria do lutador, o sistema deduz isso. O método `setPeso()` recebe o novo peso na balança e contém uma estrutura de decisão interna (`if/else`) que analisa esse número (ex: abaixo de 70.3 é peso *Leve*) e atualiza a `categoria` de forma automática.
* **A Interface Pública:** Foram definidos métodos públicos que representam os comportamentos exclusivos do objeto. Temos o `apresentar()` e `status()` (que exibem relatórios formatados na tela), e as rotinas que alteram o placar do esportista: `ganharLuta()`, `perderLuta()` e `empatarLuta()`.

## 6. Conclusão Metodológica
Esta aula atua como uma preparação de infraestrutura. Para que duas ou mais classes se relacionem de forma inteligente e segura (o que ocorrerá efetivamente na próxima aula, quando os lutadores entrarem em uma `Luta`), precisamos primeiramente garantir que as "peças" do relacionamento sejam autossuficientes. Com a classe `Lutador` encapsulada, robusta e regida por métodos inteligentes, o ambiente está apto para receber relações de Agregação.