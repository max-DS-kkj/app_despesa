//Gabriel Batista
package model;

public class Meta {

    private String objetivo;
    private double valorAlvo;
    private double valorPoupado;

    public Meta() {
    }


    public Meta(String objetivo, double valorAlvo) {
        this.objetivo = objetivo;
        this.valorAlvo = valorAlvo;
        this.valorPoupado = 0.0;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
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
