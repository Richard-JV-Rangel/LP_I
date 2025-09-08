public class Notificacao {
    private String tipo;
    private int numero;
    private String icone;

    public Notificacao(String tipo, int numero, String icone) {
        this.tipo = tipo;
        this.numero = numero;
        this.icone = icone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public void exibirContador() {
        System.out.println("Exibindo contador de notificação: " + numero);
    }

    public void piscar() {
        System.out.println("O ícone da notificação está piscando.");
    }

    public void sumir() {
        System.out.println("A notificação sumiu da tela.");
    }
}