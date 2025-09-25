//Exercicio 8 for each 
package logicaexercicios;

public class hForEachEx {
    public static void main(String[] args) {

        int[] vet = {5, 7, 10};
        int n2 = 0;
        int n3 = 0;
        int med = 0;

        for(int n : vet){
            if(n == 5){
            } else if(n == 7){
                n2 = n;
            }else{
                n3 = n;
            }

            med = (n + n2 + n3)/3;

            System.out.println("É isso -> " + med);

        }
    }
}
