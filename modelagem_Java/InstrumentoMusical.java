public class InstrumentoMusical {
    private String tipo;
    private int volume;
    private String material;

    public InstrumentoMusical(String tipo, int volume, String material) {
        this.tipo = tipo;
        this.volume = volume;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void tocar() {
        System.out.println("O instrumento do tipo " + tipo + " está sendo tocado.");
    }
}