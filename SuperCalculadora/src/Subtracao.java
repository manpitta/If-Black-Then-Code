import java.util.Scanner;

public class Subtracao {
        int num3;
        int num4;

        int subtracao;

        public Subtracao(){
            this.num3 = num3;
            this.num4 = num4;
            this.subtracao = subtracao;
        }

    public int getNum3() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número da subtração que você deseja realizar: ");
        num3 = teclado.nextInt();
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o segundo número da subtração que você deseja realizar: ");
        num4 = teclado.nextInt();
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getSubtracao() {
        subtracao = num3 - num4;
        return subtracao;
    }

    public void setSubtracao(int subtracao) {
        this.subtracao = subtracao;
    }
}
