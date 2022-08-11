package Aula1;

import java.util.Scanner;

public class ProcessaCalculos {
    public static void main(String[] args) {
        System.out.println("Digite o valor desejado");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        System.out.println("Digite o segundo valor desejado");
        Scanner teclado2 = new Scanner(System.in);
        int valor2 = teclado2.nextInt();

        int soma = valor + valor2;

        System.out.println("A soma dos valores digitados é " + soma);

    }
}
