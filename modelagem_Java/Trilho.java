public class Trilho {
    private String material;
    private int quantidade;
    private String posicao;

    public Trilho(String material, int quantidade, String posicao) {
        this.material = material;
        this.quantidade = quantidade;
        this.posicao = posicao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void conduzirTrem() {
        System.out.println("O trilho está conduzindo o trem.");
    }
}