import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite uma idade");
//    int anos = scanner.nextInt();
//    int meses = anos * 12;
//    int dias = anos * 365;
//
//    System.out.println("A idade em anos é: " + anos);
//        System.out.println("A idade em meses é: " + meses);
//        System.out.println("A idade em dias é: " + dias);

//        int p1 = scanner.nextInt();
//        int antecessor = p1 - 1;
//        int sucessor = p1 + 1;
//        System.out.println("o número é: " + p1);
//        System.out.println("o antecessor do número é: " + antecessor);
//        System.out.println("o sucessor do número é: " + sucessor);

        int n1 = 8;
        int n2 = 9;
        int n3 = 7;

        int n4 = 4;
        int n5 = 5;
        int n6 = 6;

        int soma1 = n1 + n2 + n3;
        int soma2 = n4 + n5 + n6;

        float media1 = soma1 / 3;
        float media2 = soma2 / 3;

        float somamm = media1 + media2;
        float mediamedia = somamm / 2;
        System.out.println("a média de 7,8,9 é: " + media1);
        System.out.println("a média de 4,5,6 é: " + media2);
        System.out.println("a média da média é: " + mediamedia);

    }
}
