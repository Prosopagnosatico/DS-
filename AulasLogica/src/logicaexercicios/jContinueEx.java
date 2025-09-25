//Exercicio 10 continue
package logicaexercicios;

public class jContinueEx {
    public static void main(String[] args) {
        int num1;
        int num2 = 3;

        for(num1 = 1; num1 < 20; num1++){
            if(num1 % num2 == 0){
                System.out.println("Pulado.");
                continue;
            }
            System.out.println("O numero é " + num1 + ". Os numeros multiplos de 3 foram todos pulados.");
        }

    }
}
