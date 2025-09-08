public class Jornal {
    private String titulo;
    private String data;
    private String conteudo;

    public Jornal(String titulo, String data, String conteudo) {
        this.titulo = titulo;
        this.data = data;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void flutuar() {
        System.out.println("O jornal '" + titulo + "' está flutuando.");
    }
}