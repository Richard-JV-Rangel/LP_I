public class Piano {
    private String cor;
    private int teclas;
    private String local;

    public Piano(String cor, int teclas, String local) {
        this.cor = cor;
        this.teclas = teclas;
        this.local = local;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTeclas() {
        return teclas;
    }

    public void setTeclas(int teclas) {
        this.teclas = teclas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void emitirSom() {
        System.out.println("O piano está emitindo som.");
    }

    public void abrirTampa() {
        System.out.println("A tampa do piano foi aberta.");
    }

    public void suportarPeso() {
        System.out.println("O piano suporta um certo peso.");
    }
}