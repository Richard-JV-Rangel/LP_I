public class Maleta {
    private String cor;
    private String material;
    private String tamanho;

    public Maleta(String cor, String material, String tamanho) {
        this.cor = cor;
        this.material = material;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void armazenarItens() {
        System.out.println("A maleta está armazenando itens.");
    }
}