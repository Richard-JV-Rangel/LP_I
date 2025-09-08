public class CorpoDeAgua {
    private String tipo;
    private String cor;
    private float temperatura;

    public CorpoDeAgua(String tipo, String cor, float temperatura) {
        this.tipo = tipo;
        this.cor = cor;
        this.temperatura = temperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void movimentar() {
        System.out.println("O " + tipo + " está se movimentando.");
    }
}