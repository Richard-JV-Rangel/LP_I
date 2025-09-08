public class Video {
    private String titulo;
    private float duracao;
    private String resolucao;

    public Video(String titulo, float duracao, String resolucao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.resolucao = resolucao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public void reproduzir() {
        System.out.println("O vídeo '" + titulo + "' está sendo reproduzido.");
    }

    public void pausar() {
        System.out.println("O vídeo '" + titulo + "' foi pausado.");
    }

    public void avancar() {
        System.out.println("O vídeo '" + titulo + "' está avançando.");
    }
}