package com.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== 🏦 SISTEMA BANCÁRIO =====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver extrato");
            System.out.println("5 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do titular: ");
                    String nome = scanner.nextLine();
                    System.out.print("Saldo inicial: R$ ");
                    double saldoInicial = scanner.nextDouble();
                    banco.criarConta(nome, saldoInicial);
                    break;

                case 2:
                    System.out.print("Nome do titular: ");
                    String nomeDep = scanner.nextLine();
                    Conta contaDep = banco.buscarConta(nomeDep);
                    if (contaDep != null) {
                        System.out.print("Valor para depositar: R$ ");
                        double valorDep = scanner.nextDouble();
                        contaDep.depositar(valorDep);
                    }
                    break;

                case 3:
                    System.out.print("Nome do titular: ");
                    String nomeSaq = scanner.nextLine();
                    Conta contaSaq = banco.buscarConta(nomeSaq);
                    if (contaSaq != null) {
                        System.out.print("Valor para sacar: R$ ");
                        double valorSaq = scanner.nextDouble();
                        contaSaq.sacar(valorSaq);
                    }
                    break;

                case 4:
                    System.out.print("Nome do titular: ");
                    String nomeExt = scanner.nextLine();
                    Conta contaExt = banco.buscarConta(nomeExt);
                    if (contaExt != null) {
                        contaExt.verExtrato();
                    }
                    break;

                case 5:
                    banco.listarContas();
                    break;

                case 0:
                    System.out.println("👋 Até logo!");
                    break;

                default:
                    System.out.println("⚠️ Opção inválida!");
            }
        }
        scanner.close();
    }
}
