package model;

public class Despesa {
    private String descricao;
    private double valor;
    private String status;

    public Despesa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = "Pendente"; // Ou o valor padrão que desejar
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

