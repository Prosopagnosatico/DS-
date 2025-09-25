//Exercicio 9 com break
package logicaexercicios;

public class iBreakEx {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 10; i++){
            System.out.println("O numero atual é " + i + ". Quando chegar a 7 para.");
            if (i == 7){
                System.out.println("PAROU");
                break;
            }
        }

    }
}
