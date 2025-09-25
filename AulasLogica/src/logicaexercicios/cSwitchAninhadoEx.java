//Exercicio 3 switch aninhado
package logicaexercicios;

import java.util.Scanner;

public class cSwitchAninhadoEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o que quer consumir. 1-Bebidas, 2-Salgados, 3-Doces");
        int categoria = sc.nextInt();

        switch (categoria){
            case 1->{
                System.out.println("Bebidas. 1-Refris, 2-Sucos, 3-Chás");
                int opcao = sc.nextInt();

                switch (opcao){
                    case 1->{
                        System.out.println("Refri adicionado");
                    }
                    case 2->{
                        System.out.println("Suco adicionado");
                    }
                    case 3->{
                        System.out.println("Chá adicionado");
                    }
                }
            }

            case 2->{
                System.out.println("Salgados, 1-Coxinha, 2-Kibe, 3-Risole");
                int opcao = sc.nextInt();

                switch (opcao){
                    case 1->{
                        System.out.println("Coxinha adicionada");
                    }

                    case 2->{
                        System.out.println("Kibe adicionado");
                    }

                    case 3->{
                        System.out.println("Risole adicionado");
                    }
                }
            }

            case 3->{
                System.out.println("Doces. 1-Brigadeiro, 2-Morango do amor, 3-Beijinho");
                int opcao = sc.nextInt();

                switch (opcao){
                    case 1->{
                        System.out.println("Brigadeiro adicionado");
                    }

                    case 2->{
                        System.out.println("Morango do amor adicionado");
                    }

                    case 3->{
                        System.out.println("Beijinho adicionado");
                    }
                }
            }
        }
    }
}
