package model;

import model.Despesa;

public class Conta {
    private int numero;
    private String cliente;
    private double saldo;
    private double limite;
    private double saldoPoupanca;

    public Conta(int numero, String cliente, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
        this.saldoPoupanca = 0.0;
    }

    public boolean poupar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            this.saldoPoupanca += valor;
            System.out.println("R$ " + valor + " guardados na poupança com sucesso!");
            return true;
        } else if (valor <= 0) {
            System.out.println("Erro: O valor para poupar deve ser maior que zero.");
            return false;
        } else {
            System.out.println("Erro: Saldo insuficiente para poupar R$ " + valor);
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("DEPÓSITO R$ " + valor + " realizado com sucesso na conta de " + cliente);
        }
    }

    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Erro: Saldo e limite insuficientes para o saque de R$ " + valor);
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
    
}
