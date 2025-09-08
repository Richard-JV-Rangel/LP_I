public class Crime {
    private String tipo;
    private String local;
    private String arma;

    public Crime(String tipo, String local, String arma) {
        this.tipo = tipo;
        this.local = local;
        this.arma = arma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void cometer() {
        System.out.println("Um crime do tipo " + tipo + " foi cometido no " + local + ".");
    }
}