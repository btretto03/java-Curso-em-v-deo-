**Aula de Referência:** Curso POO Teoria #10a - Herança (Parte 1)

## 1. Introdução ao Segundo Pilar da POO
Na arquitetura da Programação Orientada a Objetos, os sistemas são sustentados por três pilares fundamentais (EHP: Encapsulamento, Herança e Polimorfismo). Após dominar o isolamento e a proteção (Encapsulamento), o foco agora é a **Herança**, o pilar estrutural responsável por otimizar a criação de classes e evitar a repetição desenfreada de código. Vale ressaltar que é perfeitamente possível aplicar herança sem encapsulamento (e vice-versa), mas a união de ambos é o que gera um software robusto e profissional.

## 2. O Conceito de Herança
A herança na programação segue a mesma lógica da genética ou da evolução de produtos no mundo real.
* **Definição Técnica:** Herança é o mecanismo que permite basear uma nova classe na definição de uma outra classe previamente existente.
* **Justificativa de Uso:** Em vez de programar uma classe inteira do zero, copiando e colando atributos e métodos que já existem em outro lugar do sistema, nós criamos uma classe base e fazemos com que as novas classes "herdem" essas características e comportamentos.
* **A Analogia da Mãe e Filha:** Assim como uma filha herda características (cor dos olhos) e comportamentos (jeito de falar) de sua mãe, na POO, a classe recém-criada (filha) puxará automaticamente todos os atributos e métodos da classe base (mãe), podendo ainda adicionar suas próprias inovações.

## 3. O Exercício Prático: O Sistema de Pessoas
Para ilustrar o reaproveitamento de código, a aula constrói um diagrama de classes para pessoas de um colégio.
* **O Problema da Repetição:** Se fôssemos criar as classes `Aluno`, `Professor` e `Funcionario` de forma isolada, todas elas teriam que repetir a digitação e a lógica dos atributos comuns (`nome`, `idade`, `sexo`), além do método `fazerAniversario()`. 
* **A Solução via Abstração:** Extraímos tudo o que é comum entre essas três entidades e criamos uma classe genérica, posicionada no topo, chamada `Pessoa`.
* **A Extensão (`extends`):** Ao programar, informamos ao sistema que a classe `Aluno` "estende" (amplia) a classe `Pessoa`. Com esse simples comando, o aluno ganha instantaneamente o nome, a idade e o sexo, restando ao programador escrever apenas o que é **exclusivo** do aluno (como os atributos `matricula` e `curso`, e o método `cancelarMatricula()`).

## 4. Terminologia Técnica e Nomenclatura
Na literatura da Orientação a Objetos, a árvore hierárquica e as ligações da herança recebem nomes padronizados no mercado:
* **Superclasse (ou Classe Mãe / Progenitora):** É a classe base, genérica, que fornece as características essenciais para as outras classes abaixo dela. No exemplo, é a classe `Pessoa`.
* **Subclasse (ou Classe Filha):** É a classe derivada, mais específica, que recebe a herança e a expande com suas próprias particularidades. No exemplo, são as classes `Aluno`, `Professor` e `Funcionario`. Uma subclasse não precisa declarar novamente o que herdou, pois o interpretador faz a ligação em tempo real.

## 5. Regras de Direção e Limitações da Herança
A herança flui exclusivamente de cima para baixo na hierarquia, o que impõe regras lógicas estritas durante a manipulação dos objetos (instâncias):
* **O que a Subclasse pode acessar:** Um objeto instanciado a partir de `Aluno` pode acessar métodos exclusivos dele (ex: `cancelarMatricula()`) e também possui passe livre para usar os métodos herdados da Superclasse (ex: `setNome()` ou `fazerAniversario()`).
* **O que a Superclasse NÃO pode acessar:** Um objeto puro instanciado a partir de `Pessoa` **não** pode chamar o método `receberAumento()`. O aumento é uma regra de negócio exclusiva do `Professor`. A mãe não herda características da filha.
* **Limitação entre "Irmãs":** Um `Aluno` não pode acionar a rotina de `mudarTrabalho()`, pois essa função pertence unicamente ao `Funcionario`. Classes que estão no mesmo nível hierárquico não compartilham seus métodos e atributos específicos entre si.

## 6. Conclusão Metodológica
O pilar da Herança é a ferramenta definitiva para a manutenibilidade do software. Ao concentrar as características comuns em uma única Superclasse, qualquer alteração estrutural futura (como adicionar o atributo `CPF` a todos os indivíduos do sistema) precisa ser codificada em apenas um único lugar. A alteração refletirá em cascata de forma automática em todas as subclasses, eliminando o risco de inconsistências e tornando o código imensamente mais limpo.