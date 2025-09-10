//Exercicio 2 if aninhado
package logicaexercicios;
import java.util.Scanner;

public class IfAninhadoEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();
        int frequencia = sc.nextInt();

        if(nota >= 7){
            if (frequencia >= 75){
                System.out.println("Passou total");
            } else{
                System.out.println("Reprovou por frequencia");
            }
        } else {
            System.out.println("Reprovou por nota");
        }

    }
}
