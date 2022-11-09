/*Crie uma classe que aceite a digitação de dois números e faça a divisão entre eles
exibindo seu resultado. Sua classe deve tratar as seguintes exceções:
 ArithmeticException quando ocorrer uma divisão por zero;
 InputMismatchException quando o valor informado não é numérico.*/


/**
 * Exercicio1
 */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();
        
    }
}