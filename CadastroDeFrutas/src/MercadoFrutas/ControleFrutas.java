package MercadoFrutas;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {
    public static <ListaFrutas> void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Maçã");
        frutas.add("Morango");
        frutas.add("Amora");
        frutas.add("Abacaxi");
        frutas.add("Uva");
        frutas.add("Laranja");

        System.out.println("Digite 1 para cadastrar frutas");
        System.out.println("Digite 2 para listar frutas");
        System.out.println("Digite 3 para excluir frutas");
        System.out.println("Digite 4 para listar frutas");
        System.out.println("Digite 5 para alterar uma fruta");

        Scanner cadastro = new Scanner(System.in);
        Scanner excluir = new Scanner(System.in);
        int id = cadastro.nextInt();
        int x=1;

        switch (id) {
            case 1:

                System.out.println("Digite a fruta que você deseja cadastrar");

                String nomefruta = cadastro.next();;
                frutas.add(nomefruta);

                System.out.println("Fruta cadastrada com sucesso!");
                    break;

            case 2:
                for (int i = 0; i <= frutas.size(); i++){
                    System.out.println(frutas.get(i));
                }
                break;

            case 3:
                System.out.println("Digite o número de registro da fruta que você deseja remover:");
                int remover = excluir.nextInt();
                frutas.remove(remover);
                System.out.println("Fruta removida com sucesso!");
                break;

            case 4:
                System.out.println("Qual o número de registro da fruta que você deseja selecionar?");
                int Id = cadastro.nextInt();
                System.out.println("A fruta selecionada foi: " + frutas.get(Id));
                break;

            case 5:
                System.out.println("Qual o número do registro da fruta que você deseja substituir?");
                int posicao = cadastro.nextInt();

                System.out.println("Por qual fruta você deseja substituir?");
                String substituicao = cadastro.next();

                frutas.set(posicao, substituicao);

                System.out.println("Fruta substituída com sucesso!");
                break;


        }
    }
}

