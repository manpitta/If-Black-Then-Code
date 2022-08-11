import java.util.Scanner;

public class Adicao {
        private int num1;
        private int num2;
        private int soma;


    public Adicao() {
        this.num1 = num1;
        this.num2 = num2;
        this.soma = soma;
    }

    public int getNum1() {

       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o primeiro número da soma que você deseja realizar: ");
       num1 = teclado.nextInt();
       return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o segundo número da soma que você deseja realizar: ");
        num2 = teclado.nextInt();
        return num2;

    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSoma() {
        soma = num1 + num2;
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
}
