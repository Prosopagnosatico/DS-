import java.util.Scanner;

public class Ex2{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");

        int num = sc.nextInt();

        while(num >= 0){
            System.out.println(num);
            num--;
        }

    }
}