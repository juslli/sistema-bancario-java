package com.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void criarConta(String titular, double saldoInicial) {
        Conta conta = new Conta(titular, saldoInicial);
        contas.add(conta);
        System.out.println("✅ Conta criada para " + titular + "!");
    }

    public Conta buscarConta(String titular) {
        for (Conta conta : contas) {
            if (conta.getTitular().equalsIgnoreCase(titular)) {
                return conta;
            }
        }
        System.out.println("❌ Conta não encontrada!");
        return null;
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("⚠️ Nenhuma conta cadastrada.");
            return;
        }
        System.out.println("📋 Contas cadastradas:");
        for (Conta conta : contas) {
            System.out.println("  - " + conta.getTitular());
        }
    }
}