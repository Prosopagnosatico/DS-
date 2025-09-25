//Exercicio 6 do while
package logicaexercicios;

import java.util.Scanner;

public class fDoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2 = 0;

        do{
            System.out.println("O numero agora é " + num2  + " Digite um numero (-1 para sair)");
            num = sc.nextInt();
            num2++;
        } while (num != -1);
        sc.close();
        }

    }

