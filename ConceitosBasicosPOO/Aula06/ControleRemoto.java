package ConceitosBasicosPOO.Aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void abrirMenu() {
        System.out.println("-------MENU-------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("[]");
        }
        System.out.println("");
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    public void fecharMenu() {
        
    }

    public void ligar() {
        this.setLigado(true);
    }

    public void ligarMudo() {
        if (this.getLigado()) {
            this.setVolume(0);  
        }
    }

    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }

    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

}
