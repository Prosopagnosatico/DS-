//Exercicio 1 if simples

package logicaexercicios;
import java.util.Scanner;

public class IfSimplesEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if(numero < 0){
            System.out.println("Esse numero é negativo");
        } else {
            System.out.println("Esse numero é positivo ou 0");
        }
    }
}
