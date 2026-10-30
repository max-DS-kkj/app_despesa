//Luiz Gustavo
package model;

public class Receita {
    
    private String origem;
    private double valor;

    public Receita() {
    }
    
    public Receita(String origem, double valor) {
        
        this.origem = origem;
        this.valor = valor;
    }
    
    public String getOrigem() {
        
        return this.origem;
        
    }
    public void setOrigem(String origem) {
        
        this.origem = origem;
        
    }
    public double getValor() {
        
        return this.valor;
        
    }
    public void setValor(double valor) {
        
        this.valor = valor;
        
    }
    
}
