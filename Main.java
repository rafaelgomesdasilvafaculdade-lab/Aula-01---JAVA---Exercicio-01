/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Deug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos dois números é: " + soma);

        scanner.close();
    }
}
