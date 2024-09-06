package ex002;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int soma = 0;
        int input;

        System.out.println("Insira um numero: ");
        input = sc.nextInt();

        do  {

            soma = n1 + n2;

            if (soma == input) {

                System.out.println("Pertence à sequência");

            }

            if (soma > input) {

                System.out.println("Não pertence à sequência");

            }

            n1 = n2;
            n2 = soma;

        } while (input > soma);

        sc.close();

    }
}
