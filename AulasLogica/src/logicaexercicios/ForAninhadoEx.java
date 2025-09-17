//Exercicio 7 for aninhado
package logicaexercicios;

public class ForAninhadoEx {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3 = 0;

        for(num = 1; num < 6; num++){
            for(num2 = 1; num2 < 6; num2++){
                num3 = num + num2;
                System.out.printf( " | " + num3 );
            }
            System.out.println();
        }
    }
}
