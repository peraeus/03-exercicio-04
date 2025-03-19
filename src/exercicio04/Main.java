package exercicio04;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    static Funcionario[] funcionarios = new Funcionario[5];
    static Scanner sc = new Scanner(System.in);
    static int index = 0;

    public static void main(String[] args) {


        int opcao;

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1. Cadastrar");
            System.out.println("2. Pesquisar");
            System.out.println("3. Listar");
            System.out.println("4. Finalizar");
            opcao = sc.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("opção inválida");
            }
            else {
                switch (opcao) {

                    case 1:
                        cadastrar();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        listar();
                }
            }
            System.out.println();

        } while(opcao != 4);


    }

    private static void cadastrar() {
        String nome;
        String cargo;
        double salario;
        if (index < funcionarios.length);
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Cargo: ");
        cargo = sc.next();
        System.out.print("Salário: ");
        salario = sc.nextDouble();
        funcionarios[index] = new Funcionario(nome, cargo, salario);
        index++;
    }

    private static void pesquisar() {
        System.out.println("Nome buscado: ");
        String nome;
        nome = sc.next();
        for (int i = 0; i < index; i++) {
            if (funcionarios[i].nome.equalsIgnoreCase(nome)) {
                System.out.println(nome + " encontrado");
                return;
            }

        }

        System.out.println(nome + " não encontrado");

        }

    private static void listar() {
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < index; i++) {
            System.out.println("Nome: " + funcionarios[i].nome);
            System.out.println("Cargo: " + funcionarios[i].cargo);
            System.out.println("Salário: R$" + df.format(funcionarios[i].salario));
            System.out.println();

        }
    }

}
