import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println("A concorrencia que nos desculpe, mas aqui, a lapada é forte");
//
//        int valor = 10;
//        byte valor2 = 127;
//        short valor3 = -31476;
//        long valor4 = 94249595L;
//        boolean valor5 = true;
//        char valor6 = 'C';
//        float valor7 = 10.4f;
//        double valor8 = 2;
//        System.out.println("variavel byte:"  + valor2);
//        System.out.println("variavel short:"  + valor3);
//        System.out.println("variavel long:"  + valor4);
//        System.out.println("variavel boolean:"  + valor5);
//        System.out.println("variavel char:"  + valor6);
//        System.out.println("variavel float:"  + valor7);
//        System.out.println("variavel double:"  + valor8);
//        System.out.println("variavel int:"  + valor);
//
//        int num1 = 10;
//        int num2 = 20;
//        int soma = num1 + num2;
//        System.out.println("a soma é " + soma);

        Scanner scanner = new Scanner(System.in);
//        int numero = scanner.nextInt();
//        int numero2 = scanner.nextInt();
//
//        int calculo = numero + numero2;
//
//        scanner.close();
//        System.out.println("Numero: " + calculo);
//
//        int n1 =  scanner.nextInt();
//        int n2 =  scanner.nextInt();
//
//        int resultado = n1 - n2;
//
//        System.out.println("A subtração da: " + resultado);
//
//        int n3 =  scanner.nextInt();
//        int n4 =  scanner.nextInt();
//
//        int mult = n3 * n4;
//
//        System.out.println("A multiplicação da: " + mult);
//
//        int n5 =  scanner.nextInt();
//        int n6 =  scanner.nextInt();
//
//        int div = n5 / n6;
//
//        System.out.println("A divisão da: " + div);

        int number = scanner.nextInt();
        int resolucao = number % 2;
        if (resolucao == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }
    }


}