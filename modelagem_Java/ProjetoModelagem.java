public class ProjetoModelagem {

    // Classes da modelagem da imagem de logotipo
    public static class Simbolo {
        private String nome;
        private String formato;
        private String cor;

        public Simbolo(String nome, String formato, String cor) {
            this.nome = nome;
            this.formato = formato;
            this.cor = cor;
        }

        public void animar() {
            System.out.println("O símbolo " + nome + " está animando.");
        }

        public void mudarCor() {
            System.out.println("A cor do símbolo foi alterada.");
        }

        public void representarMarca() {
            System.out.println("O símbolo " + nome + " representa a marca.");
        }
    }

    public static class Mao {
        private String cor;
        private String posicao;
        private String objeto;

        public Mao(String cor, String posicao, String objeto) {
            this.cor = cor;
            this.posicao = posicao;
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

    public static class Notificacao {
        private String tipo;
        private int numero;
        private String icone;

        public Notificacao(String tipo, int numero, String icone) {
            this.tipo = tipo;
            this.numero = numero;
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

    // Classes da modelagem da imagem de música
    public static class PessoaMusica {
        private String nome;
        private int idade;
        private String sentimento;

        public PessoaMusica(String nome, int idade, String sentimento) {
            this.nome = nome;
            this.idade = idade;
            this.sentimento = sentimento;
        }

        public void cantar() {
            System.out.println(nome + " está cantando com o sentimento de " + sentimento + ".");
        }
    }

    public static class Crime {
        private String tipo;
        private String local;
        private String arma;

        public Crime(String tipo, String local, String arma) {
            this.tipo = tipo;
            this.local = local;
            this.arma = arma;
        }

        public void cometer() {
            System.out.println("Um crime do tipo " + tipo + " foi cometido no " + local + ".");
        }
    }

    public static class InstrumentoMusical {
        private String tipo;
        private int volume;
        private String material;

        public InstrumentoMusical(String tipo, int volume, String material) {
            this.tipo = tipo;
            this.volume = volume;
            this.material = material;
        }

        public void tocar() {
            System.out.println("O instrumento do tipo " + tipo + " está sendo tocado.");
        }
    }

    // Classes da modelagem do jornal
    public static class Jornal {
        private String titulo;
        private String data;
        private String conteudo;

        public Jornal(String titulo, String data, String conteudo) {
            this.titulo = titulo;
            this.data = data;
            this.conteudo = conteudo;
        }

        public void flutuar() {
            System.out.println("O jornal '" + titulo + "' está flutuando.");
        }
    }

    public static class Cidade {
        private String nome;
        private String pais;
        private int populacao;

        public Cidade(String nome, String pais, int populacao) {
            this.nome = nome;
            this.pais = pais;
            this.populacao = populacao;
        }

        public void serTuristica() {
            System.out.println("A cidade de " + nome + " é um local turístico.");
        }
    }

    public static class CorpoDeAgua {
        private String tipo;
        private String cor;
        private float temperatura;

        public CorpoDeAgua(String tipo, String cor, float temperatura) {
            this.tipo = tipo;
            this.cor = cor;
            this.temperatura = temperatura;
        }

        public void movimentar() {
            System.out.println("O " + tipo + " está se movimentando.");
        }
    }

    // Classes da modelagem do vídeo
    public static class Pianista {
        private String nome;
        private String roupa;
        private String habilidade;

        public Pianista(String nome, String roupa, String habilidade) {
            this.nome = nome;
            this.roupa = roupa;
            this.habilidade = habilidade;
        }

        public void tocarMusica() {
            System.out.println(nome + " está tocando uma música com habilidade " + habilidade + ".");
        }

        public void improvisar() {
            System.out.println(nome + " está improvisando.");
        }

        public void virarDeCostas() {
            System.out.println(nome + " virou de costas.");
        }
    }

    public static class Piano {
        private String cor;
        private int teclas;
        private String local;

        public Piano(String cor, int teclas, String local) {
            this.cor = cor;
            this.teclas = teclas;
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

    public static class Video {
        private String titulo;
        private float duracao;
        private String resolucao;

        public Video(String titulo, float duracao, String resolucao) {
            this.titulo = titulo;
            this.duracao = duracao;
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

    // Classes da modelagem da imagem da ferrovia
    public static class Trilho {
        private String material;
        private int quantidade;
        private String posicao;

        public Trilho(String material, int quantidade, String posicao) {
            this.material = material;
            this.quantidade = quantidade;
            this.posicao = posicao;
        }

        public void conduzirTrem() {
            System.out.println("O trilho está conduzindo o trem.");
        }
    }

    public static class PessoaFerrovia {
        private String nome;
        private String roupa;
        private String posicao;

        public PessoaFerrovia(String nome, String roupa, String posicao) {
            this.nome = nome;
            this.roupa = roupa;
            this.posicao = posicao;
        }

        public void interagir() {
            System.out.println(nome + " está interagindo.");
        }
    }

    public static class Maleta {
        private String cor;
        private String material;
        private String tamanho;

        public Maleta(String cor, String material, String tamanho) {
            this.cor = cor;
            this.material = material;
            this.tamanho = tamanho;
        }

        public void armazenarItens() {
            System.out.println("A maleta está armazenando itens.");
        }
    }
    
    // Método principal para rodar todos os exemplos
    public static void main(String[] args) {
        System.out.println("--- Executando Métodos das Classes de Logotipo ---");
        Simbolo simbolo = new Simbolo("Logo Empresa", "Circular", "Azul");
        simbolo.animar();
        simbolo.mudarCor();
        simbolo.representarMarca();

        Mao mao = new Mao("Clara", "Superior", "Mouse");
        mao.clicar();
        mao.curtir();
        mao.digitar();

        Notificacao notificacao = new Notificacao("Alerta", 5, "Sino");
        notificacao.exibirContador();
        notificacao.piscar();
        notificacao.sumir();

        System.out.println("\n--- Executando Métodos das Classes de Música ---");
        PessoaMusica pessoaMusica = new PessoaMusica("Freddie Mercury", 45, "Drama");
        pessoaMusica.cantar();
        
        Crime crime = new Crime("Roubo", "Banco", "Pistola");
        crime.cometer();
        
        InstrumentoMusical instrumentoMusical = new InstrumentoMusical("Guitarra", 10, "Madeira");
        instrumentoMusical.tocar();

        System.out.println("\n--- Executando Métodos das Classes de Jornal ---");
        Jornal jornal = new Jornal("A Notícia", "2023-09-08", "Conteúdo sobre economia.");
        jornal.flutuar();

        Cidade cidade = new Cidade("Veneza", "Itália", 260000);
        cidade.serTuristica();

        CorpoDeAgua corpoDeAgua = new CorpoDeAgua("Rio", "Marrom", 15.5f);
        corpoDeAgua.movimentar();

        System.out.println("\n--- Executando Métodos das Classes de Vídeo ---");
        Pianista pianista = new Pianista("Ludovico", "Social", "Incrível");
        pianista.tocarMusica();
        pianista.improvisar();
        pianista.virarDeCostas();

        Piano piano = new Piano("Preto", 88, "Sala de Concerto");
        piano.emitirSom();
        piano.abrirTampa();
        piano.suportarPeso();

        Video video = new Video("Nuvole Bianche", 6.2f, "HD");
        video.reproduzir();
        video.pausar();
        video.avancar();

        System.out.println("\n--- Executando Métodos das Classes de Ferrovia ---");
        Trilho trilho = new Trilho("Ferro", 2, "Linha Principal");
        trilho.conduzirTrem();
        
        PessoaFerrovia pessoaFerrovia = new PessoaFerrovia("Richard", "Casual", "Próximo à trilha");
        pessoaFerrovia.interagir();

        Maleta maleta = new Maleta("Marrom", "Couro", "Média");
        maleta.armazenarItens();
    }
}