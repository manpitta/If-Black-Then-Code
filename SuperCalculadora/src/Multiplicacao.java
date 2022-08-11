import java.util.Scanner;

public class Multiplicacao {
        int num7;
        int num8;
        int multiplicacao;

        public Multiplicacao(){
            this.num7 = num7;
            this.num8 = num8;
            this.multiplicacao = multiplicacao;
        }

    public int getNum7() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número da multiplicação que você deseja realizar: ");
        num7 = teclado.nextInt();
        return num7;
    }

    public void setNum7(int num7) {
        this.num7 = num7;
    }

    public int getNum8() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o segundo número da multiplicação que você deseja realizar: ");
        num8 = teclado.nextInt();
        return num8;
    }

    public void setNum8(int num8) {
        this.num8 = num8;
    }

    public int getMultiplicacao() {
        multiplicacao = num7 * num8;
        return multiplicacao;
    }

    public void setMultiplicacao(int multiplicacao) {
        this.multiplicacao = multiplicacao;
    }
}
