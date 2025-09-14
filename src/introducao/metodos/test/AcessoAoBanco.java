package introducao.metodos.test;

import java.util.Scanner;

import introducao.metodos.domain.ContaBancaria;
import introducao.metodos.domain.FuncoesBancarias;

public class AcessoAoBanco {
    public static void main(String[] args) {
        String dividaOuNao;
        int finall = 0;
        int continuar = 1;
        int function;
        String algo;
        double Msaldo;
        double saldoSemDivida = 1;
        ContaBancaria acesso = new ContaBancaria();
        Scanner entrada = new Scanner(System.in);
        FuncoesBancarias funcao = new FuncoesBancarias();

        do {
            System.out.println("--------------------");
            System.out.println("Digite seu nome: ");
            acesso.nome = entrada.nextLine();

            System.out.println("Digite seu saldo: ");
            acesso.saldo = entrada.nextDouble();
            entrada.nextLine();

            System.out.println("Você tem alguma divida? (S/N)");
            dividaOuNao = entrada.nextLine();
            if (!dividaOuNao.equalsIgnoreCase("s") && !dividaOuNao.equalsIgnoreCase("n")) {
                System.out.println("Você digitou um valor inválido! Tnte novamente.");
                finall = 1;
                break;
            } else if (dividaOuNao.equalsIgnoreCase("s")) {
                System.out.println("Digite o valor da sua dívida: ");
                acesso.divida = entrada.nextDouble();
                entrada.nextLine();
            }
            System.out.println("Gostaria de arrumar alguma informação? (S/N)");
            String fim = entrada.nextLine();
            if (!fim.equalsIgnoreCase("s") && !fim.equalsIgnoreCase("n")) {
                System.out.println("Você digitou um valor inválido! Tente novamente.");
                finall = 1;
            } else if (fim.equalsIgnoreCase("s")) {
                finall = 1;
            } else {
                finall = 0;
            }
        } while (finall == 1);
        System.out.println("------------------------------");
        System.out.println("Fim do cadastro!!");
        System.out.println("------------------------------");
        if (finall == 1) {
            for (int i = 1; i <= 2; i++) {
                break;
            }
        } else {
            do {
                System.out.println("MENU DE FUNÇÕES: ");
                System.out.println("1. Aumentar/diminuir saldo.");
                System.out.println("2. Aumentar/diminuir divída.");
                System.out.println("3. Consultar saldo com abate das divídas.");
                System.out.println("4. Consultar saldo.");
                System.out.println("5. Consultar dívidas.");
                function = entrada.nextInt();
                entrada.nextLine();

                switch (function) {
                    case 1: {
                        //primeira função:
                        System.out.println("-------------------------------------");
                        System.out.println("Você deseja aumentar ou diminuir o saldo?");
                        acesso.aumentaDiminui = entrada.nextLine();
                        if (acesso.aumentaDiminui.equalsIgnoreCase("aumentar")) {
                            System.out.println("-------------------------------------");
                            System.out.println("Digite o valor que deseja aumentar: ");
                            acesso.saldoA = entrada.nextDouble();
                            entrada.nextLine();
                            acesso.saldo = funcao.AumentarSaldo(acesso);
                            System.out.println("Saldo alterado!");
                        } else if (acesso.aumentaDiminui.equalsIgnoreCase("diminuir")) {
                            System.out.println("-------------------------------------");
                            System.out.println("Digite o valor que deseja diminuir: ");
                            acesso.saldoA = entrada.nextDouble();
                            entrada.nextLine();
                            acesso.saldo = funcao.DiminuiSaldo(acesso);
                            System.out.println("Saldo alterado!");
                        } else {
                            System.out.println("-------------------------------------");
                            System.out.println("Você digitou um valor inválido!");
                        }
                        System.out.println("Deseja continuar? (s/n)");
                        algo = entrada.nextLine();
                        if (algo.equalsIgnoreCase("s")) {
                            continuar = 0;
                        } else if (algo.equalsIgnoreCase("n")) {
                            continuar = 1;
                        } else {
                            System.out.println("Valor inválido!");
                            System.out.println("---------------------");
                            continuar = 0;
                        }
                        break;
                    }
                    case 2: {
                        //segunda função:
                        System.out.println("-------------------------------------");
                        System.out.println("Você deseja aumentar ou diminuir a divída?");
                        acesso.aumentaDiminui = entrada.nextLine();
                        if (acesso.aumentaDiminui.equalsIgnoreCase("aumentar")) {
                            System.out.println("-------------------------------------");
                            System.out.println("Digite o valor que deseja aumentar: ");
                            acesso.dividaA = entrada.nextDouble();
                            entrada.nextLine();
                            acesso.divida = funcao.AumentarDivida(acesso);
                            System.out.println("Divída alterada!");
                        } else if (acesso.aumentaDiminui.equalsIgnoreCase("diminuir")) {
                            System.out.println("-------------------------------------");
                            System.out.println("Digite o valor que deseja diminuir: ");
                            acesso.dividaA = entrada.nextDouble();
                            entrada.nextLine();
                            acesso.divida = funcao.DiminuiDivida(acesso);
                            System.out.println("Divída alterada!");
                        } else {
                            System.out.println("-------------------------------------");
                            System.out.println("Você digitou um valor inválido!");
                        }
                        System.out.println("Deseja continuar? (s/n)");
                        algo = entrada.nextLine();
                        if (algo.equalsIgnoreCase("s")) {
                            continuar = 0;
                        } else if (algo.equalsIgnoreCase("n")) {
                            continuar = 1;
                        } else {
                            System.out.println("Valor inválido!");
                            System.out.println("---------------------");
                            continuar = 0;
                        }
                        break;
                    }
                    case 3: {
                        //terceira função:
                        System.out.println("-------------------------------------");
                        saldoSemDivida = funcao.saldoMenosDivida(acesso);
                        System.out.println("Seu saldo descontando as divídas é de: " + acesso.saldoSemDivida + " reais.");
                        System.out.println("Deseja continuar? (s/n)");
                        algo = entrada.nextLine();
                        if (algo.equalsIgnoreCase("s")) {
                            continuar = 0;
                        } else if (algo.equalsIgnoreCase("n")) {
                            continuar = 1;
                        } else {
                            System.out.println("Valor inválido!");
                            System.out.println("---------------------");
                            continuar = 0;
                        }
                        break;
                    }
                    case 4: {
                        //quarta função:
                        System.out.println("-------------------------------------");
                        System.out.println("Seu saldo é de: " + acesso.saldo + " reais.");
                        System.out.println("Deseja continuar? (s/n)");
                        algo = entrada.nextLine();
                        if (algo.equalsIgnoreCase("s")) {
                            continuar = 0;
                        } else if (algo.equalsIgnoreCase("n")) {
                            continuar = 1;
                        } else {
                            System.out.println("Valor inválido!");
                            System.out.println("---------------------");
                            continuar = 0;
                        }
                        break;
                    }

                    case 5: {
                        //quinta função:
                        System.out.println("-------------------------------------");
                        System.out.println("Suas divídas estão no valor de: " + acesso.divida + " reais");
                        System.out.println("Deseja continuar? (s/n)");
                        algo = entrada.nextLine();
                        if (algo.equalsIgnoreCase("s")) {
                            continuar = 0;
                        } else if (algo.equalsIgnoreCase("n")) {
                            continuar = 1;
                        } else {
                            System.out.println("Valor inválido!");
                            System.out.println("---------------------");
                            continuar = 0;
                        }
                        break;
                    }
                    default: {
                        //função default:
                        System.out.println("-------------------------------------");
                        System.out.println("Você digitou um valor inválido! Tente novamente.");
                        continuar = 0;
                    }
                }
            } while (continuar == 0);


        }
    }
}

