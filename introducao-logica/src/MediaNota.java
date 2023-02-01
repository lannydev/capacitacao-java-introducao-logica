import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota");
        double nota2 = sc.nextDouble();

        System.out.println("Informe a terceira nota");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);

        if (media >= 7.0){
            System.out.println("Parabéns vc está aprovado, sua média é: " + media);
        }else {
            System.out.println("Você está reprovado, para ser aprovado é necessário " +
                    "ter média igual ou maior que 7,0 e sua nota é: " + media);
        }

        sc.close();

    }
}
