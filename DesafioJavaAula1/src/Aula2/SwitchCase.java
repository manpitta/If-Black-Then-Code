package Aula2;

public class SwitchCase {
    public static void main(String[] args) {
        int opcao = 2;
        String carros[] = {"Sandero", "Fusion", "Prisma"};
        System.out.println("Escolha abaixo");
        System.out.println("Mostrar carro da marca Honda");
        System.out.println("Mostrar todos os carros");
        switch (opcao){
            case 1:
                System.out.println("Não temos carros para alocar");
                break;
            case 2:
                System.out.println(carros[0]);
                System.out.println(carros[1]);
                System.out.println(carros[2]);
            default:
                System.out.println("Opção escolhida não existe.");
        }
    }
}
