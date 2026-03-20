package com.banco;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("❌ Valor inválido para depósito!");
            return;
        }
        saldo += valor;
        System.out.println("✅ Depósito de R$ " + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("❌ Valor inválido para saque!");
            return;
        }
        if (valor > saldo) {
            System.out.println("❌ Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        System.out.println("✅ Saque de R$ " + valor + " realizado com sucesso!");
    }

    public void verExtrato() {
        System.out.println("👤 Titular: " + titular);
        System.out.println("💰 Saldo atual: R$ " + saldo);
    }

    public String getTitular() {
        return titular;
    }
}