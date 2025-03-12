package exercicio04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

    }

    private static void pesquisar() {

    }

    private static void listar() {

    }

}
