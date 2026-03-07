package ConceitosBasicosPOO.Aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;  

    //Métodos personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada. pois ela ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada. pois ela está em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
        if(this.status) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("Impossível depositar. Conta fechada");
        }
    }

    public void sacar(float v) {
        if(this.status) {
            if(this.getSaldo() < v) {
                System.out.println("Saldo insuficiente para saque");
            } else {
                this.setSaldo(this.getSaldo() - v);
            }
        } else {
            System.out.println("Impossível sacar. Conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.status) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso");
            } else {
                System.out.println("Saldo insuficiente para pagar mensalidade");
            }
        } else {
            System.out.println("Impossível pagar. Conta fechada");
        }
    }

    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.setDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void contabanco() {
        status = false;
        saldo = 0;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void getDono(String d) {
        this.dono = d;
    }
    public String setDono() {
        return this.dono;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setStatus(boolean st) {
        this.status = st;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setDono(String d) {
        this.dono = d;
    }

}
