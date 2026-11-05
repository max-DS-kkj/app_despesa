package model;

public class Meta {
    private String descricao;
    private double valorAlvo;
    private double valorPoupado;

    public Meta(String descricao, double valorAlvo) {
        this.descricao = descricao;
        this.valorAlvo = valorAlvo;
        this.valorPoupado = 0.0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarValor(double valor) {
        this.valorPoupado += valor;
    }

    public double getValorAlvo() {
        return valorAlvo;
    }

    public void setValorAlvo(double valorAlvo) {
        this.valorAlvo = valorAlvo;
    }

    public double getValorPoupado() {
        return valorPoupado;
    }

    public void setValorPoupado(double valorPoupado) {
        this.valorPoupado = valorPoupado;
    }
}

