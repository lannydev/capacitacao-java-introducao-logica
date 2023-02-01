import java.util.Scanner;

public class OperacaoSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeito numero");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo numero");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("O resultado da soma dos dois numeros é: " + soma);



        sc.close();
    }
}
