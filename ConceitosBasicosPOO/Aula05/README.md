# 🏦 Exercício Prático POO - Conta Bancária

Este repositório contém a implementação do exercício prático proposto na **Aula 05a** do Curso de Programação Orientada a Objetos (POO) do Professor Gustavo Guanabara (Curso em Vídeo).

O objetivo deste projeto é consolidar os conceitos fundamentais de POO, como a criação de **Classes, Objetos, Instanciação, Visibilidade (Público, Privado, Protegido)** e a utilização de **Métodos Especiais (Getters, Setters e Construtor)**.

---

## 📋 Diagrama de Classe (UML)

O sistema foi modelado com base na seguinte classe `ContaBanco`:

| Visibilidade | Atributos | Tipo |
| :---: | :--- | :--- |
| `+` (Público) | `numConta` | Inteiro |
| `#` (Protegido) | `tipo` | Caractere ("CC" ou "CP") |
| `-` (Privado) | `dono` | Caractere (String) |
| `-` (Privado) | `saldo` | Real (Float/Double) |
| `-` (Privado) | `status` | Lógico (Booleano) |

| Visibilidade | Métodos Personalizados |
| :---: | :--- |
| `+` (Público) | `abrirConta(t: Caractere)` |
| `+` (Público) | `fecharConta()` |
| `+` (Público) | `depositar(v: Real)` |
| `+` (Público) | `sacar(v: Real)` |
| `+` (Público) | `pagarMensal()` |

> **Nota:** Além dos métodos acima, a classe também implementa o **Método Construtor** e os métodos **Getters e Setters** para todos os atributos.

---

## ⚙️ Regras de Negócio

Para que o sistema bancário funcione corretamente, as seguintes regras foram implementadas:

1. **Estado Inicial:** Toda conta, ao ser instanciada (Construtor), nasce com o `saldo` igual a `0` e o `status` igual a `falso` (fechada).
2. **Abertura de Conta (`abrirConta`):** - Ao abrir a conta, o `status` muda para `verdadeiro`.
   - Se for aberta uma **Conta Corrente ("CC")**, o cliente recebe um bônus inicial de **R$ 50,00**.
   - Se for aberta uma **Conta Poupança ("CP")**, o cliente recebe um bônus inicial de **R$ 150,00**.
3. **Fechamento de Conta (`fecharConta`):** Uma conta só pode ser fechada (`status = falso`) se não tiver dinheiro dentro (`saldo == 0`) e se não estiver em débito.
4. **Depósito (`depositar`):** Só é possível depositar dinheiro se a conta estiver aberta (`status == verdadeiro`).
5. **Saque (`sacar`):** Só é possível sacar se a conta estiver aberta e se o cliente tiver saldo maior ou igual ao valor do saque solicitado.
6. **Mensalidade (`pagarMensal`):** Só é cobrada se a conta estiver aberta.
   - Contas do tipo **"CC"** pagam **R$ 12,00** de mensalidade.
   - Contas do tipo **"CP"** pagam **R$ 20,00** de mensalidade.

---

## 🧪 Cenário de Teste Prático

No método principal (`Main`), o sistema deve simular a seguinte historinha de testes criada pelo professor:

* **Pessoa 1 (Jubileu):**
  * Criar uma nova conta.
  * Definir o dono como "Jubileu".
  * Definir o número da conta como `1111`.
  * Abrir uma conta do tipo **Conta Poupança ("CP")**.
  * Depositar **R$ 300,00**.

* **Pessoa 2 (Creusa):**
  * Criar uma nova conta.
  * Definir a dona como "Creusa".
  * Definir o número da conta como `2222`.
  * Abrir uma conta do tipo **Conta Corrente ("CC")**.
  * Depositar **R$ 500,00**.
  * Sacar **R$ 100,00** (para comprar um sapatinho 👠).

*Imprimir na tela o status (extrato) atual de ambas as contas para verificar se a lógica matemática e as regras de negócio foram aplicadas com sucesso!*
