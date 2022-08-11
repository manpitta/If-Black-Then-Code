import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite 1 para somar:");
        System.out.println("Digite 2 para subtrair: ");
        System.out.println("Digite 3 para dividir: ");
        System.out.println("Digite 4 para multiplicar: ");
        int opcao = usuario.nextInt();

        switch (opcao){
            case 1:
                Adicao a1 = new Adicao();
                a1.getNum1();
                a1.getNum2();
                System.out.println("A soma dos números é : " + a1.getSoma());
                break;

            case 2:
                Subtracao s1 = new Subtracao();
                s1.getNum3();
                s1.getNum4();
                System.out.println("A subtração dos números é: " + s1.getSubtracao());
                break;

            case 3:
                Divisao d1 = new Divisao();
                d1.getNum5();
                d1.getNum6();
                System.out.println("A divisão dos números é: " + d1.getDivisao());
                break;

            case 4:
                Multiplicacao m1 = new Multiplicacao();
                m1.getNum7();
                m1.getNum8();
                System.out.println("A multiplicação dos números é: " + m1.getMultiplicacao());
                break;
        }
    }
}
