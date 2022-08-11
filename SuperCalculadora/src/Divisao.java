import java.util.Scanner;

public class Divisao {
        int num5;
        int num6;

        int divisao;

        public Divisao(){
            this.num5 = num5;
            this.num6 = num6;
            this.divisao = divisao;
        }

    public int getNum5() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número da divisão que você deseja realizar: ");
        num5 = teclado.nextInt();
        return num5;

    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o segundo número da divisão que você deseja realizar: ");
        num6 = teclado.nextInt();
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public int getDivisao() {
        divisao = num5 / num6;
        return divisao;
    }

    public void setDivisao(int divisao) {
        this.divisao = divisao;
    }
}

