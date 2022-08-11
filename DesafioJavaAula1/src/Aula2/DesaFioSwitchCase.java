//Cadastrar 10 carros
//3 opções
//1 - Mostra todos os carros laço de repetição
//2- Abra uma pergunta para escolher o número do carro e mostre o carro correspondente
//3- Permite fechar o programa  Default

package Aula2;

import java.util.Scanner;

public class DesaFioSwitchCase {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Selecione 1 para visualizar todos os carros disponíveis, 2 " +
                "para selecionar o carro desejado ou 3 para finalizar o programa:");
        int num = usuario.nextInt();
        String carros[] = {"Onix", "Creta", "Honda", "Gol", "Corolla", "Mitsubishi", "Audi", "BMW", "T-Cross", "Linea"};

        switch (num){
            case 1:
                System.out.println("Todos os carros disponíveis são:");
                for (int i = 0; i <= carros.length; i++){
                    System.out.println(carros[i]);
                    break;
                }
            case 2:
                System.out.println("Escolha o número do carro desejado de 0 a 9:");
                Scanner decisao = new Scanner(System.in);
                int escolha = decisao.nextInt(carros.length);
                System.out.println("O carro escolhido foi: " + carros[escolha]);
                break;


            default:
                System.out.println("Você finalizou o programa!");




        }

    }
}
