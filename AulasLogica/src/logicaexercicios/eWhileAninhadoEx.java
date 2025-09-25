//Exercicio 5 while aninhado
package logicaexercicios;

public class eWhileAninhadoEx {
    public static void main(String[] args) {
        int x = 1;

        while(x < 10){
            int y = 1;
                while(y < 10){
                    System.out.println(x + " x " + y + " = " + x*y);
                    y++;
                }
            x++;
        }
    }
}
