package com.atividade.e2.model;

public class InstrumentoMusical {
    private int id;
    private String tipo;
    private String marca;
    private double preco;

    public InstrumentoMusical() {}

    public InstrumentoMusical(String tipo, String marca, double preco) {
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    public InstrumentoMusical(int id, String tipo, String marca, double preco) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    // Método da E1
    public String tocar() {
        return "O instrumento " + this.tipo + " da marca " + this.marca + " está emitindo um som incrível.";
    }
}