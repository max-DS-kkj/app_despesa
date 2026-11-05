package model;

import model.Despesa;
import model.Meta;

public class Conta {
    private int numero;
    private String cliente;
    private double saldo;
    private double limite;

    public Conta(int numero, String cliente, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean poupar(Meta meta, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            meta.adicionarValor(valor); 
            System.out.println("R$ " + valor + " poupados com sucesso na meta: " + meta.getDescricao());
            return true;
        } else if (valor <= 0) {
            System.out.println("Erro: O valor para poupar deve ser maior que zero.");
            return false;
        } else {
            System.out.println("Erro: Saldo insuficiente para poupar R$ " + valor);
            return false;
        }
    }

    public boolean pagarDespesa(Despesa despesa) {
        if (despesa.getStatus().equalsIgnoreCase("Paga")) {
            System.out.println("A despesa " + despesa.getDescricao() + " já consta como paga.");
            return false;
        }

        if (this.saldo + this.limite >= despesa.getValor()) {
            this.saldo -= despesa.getValor();    
            despesa.setStatus("Paga");           
            System.out.println("A despesa " + despesa.getDescricao() + " foi paga com sucesso! Valor debitado: R$ " + despesa.getValor());
            return true;
        } else {
            System.out.println("Não foi possível pagar a despesa " + despesa.getDescricao() + " por falta de saldo/limite.");
            return false;
        }
    }
    
    public int getNumero() { 
        return numero; 
    }
    public String getCliente() { 
        return cliente; 
    }
    public double getSaldo() { 
        return saldo; 
    }
    public double getLimite() {
        return limite; 
    }
    
    
public void depositar(double valor) {
    this.saldo += valor; 
}

public double getSaldoPoupanca() {
    return 0.0; 
}

}
