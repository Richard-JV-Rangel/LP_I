package com.atividade.e2.model;

public class Crime {
    private int id;
    private String tipo;
    private String localCrime;
    private int penaAnos;

    public Crime() {
    }

    public Crime(String tipo, String localCrime, int penaAnos) {
        this.tipo = tipo;
        this.localCrime = localCrime;
        this.penaAnos = penaAnos;
    }

    public Crime(int id, String tipo, String localCrime, int penaAnos) {
        this.id = id;
        this.tipo = tipo;
        this.localCrime = localCrime;
        this.penaAnos = penaAnos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalCrime() {
        return localCrime;
    }

    public void setLocalCrime(String localCrime) {
        this.localCrime = localCrime;
    }

    public int getPenaAnos() {
        return penaAnos;
    }

    public void setPenaAnos(int penaAnos) {
        this.penaAnos = penaAnos;
    }

    // Método da E1
    public String cometer() {
        return "Um crime de " + this.tipo + " ocorreu em " + this.localCrime + ". A pena prevista é de " + this.penaAnos + " anos.";
    }
}