public class Mao {
    private String cor;
    private String posicao;
    private String objeto;

    public Mao(String cor, String posicao, String objeto) {
        this.cor = cor;
        this.posicao = posicao;
        this.objeto = objeto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public void clicar() {
        System.out.println("A mão clicou no objeto " + objeto + ".");
    }

    public void curtir() {
        System.out.println("A mão curtiu o conteúdo.");
    }

    public void digitar() {
        System.out.println("A mão está digitando.");
    }
}