import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gosto = 0;

        System.out.println("Você é homem? (s/n)");
        String resposta1 = scanner.nextLine();
        if (resposta1.equals("n")){
          gosto += 1;
        }else gosto -= 2;

        System.out.println("Eu te trato como amigo/a? (s/n)");
        String resposta2 = scanner.nextLine();
        if (resposta2.equals("s")){
            gosto += 1;
        }

        System.out.println("Você é o Miguel Álvares? (s/n)");
        String resposta3 = scanner.nextLine();
        if (resposta3.equals("n")){
            gosto += 1;
        }else gosto -= 13;

        System.out.println("Você é de exatas? (s/n)");
        String resposta4 = scanner.nextLine();
        if (resposta4.equals("n")){
            gosto += 1;
        }

        System.out.println("Você é de exatas mas é a Rafa? (s/n)");
        String resposta5 = scanner.nextLine();
        if (resposta5.equals("s")){
            gosto += 2;
        }

        System.out.println("Você é algum familiar meu sem ser minha mãe ou minha avó (s/n)");
        String resposta6 = scanner.nextLine();
        if (resposta6.equals("n")){
            gosto += 1;
        }

        System.out.println("Você fazueli? (s/n)");
        String resposta7 = scanner.nextLine();
        if (resposta7.equals("s")){
            gosto += 1;
        }

        System.out.println("Você joga Free Fire? (s/n)");
        String resposta8 = scanner.nextLine();
        if (resposta8.equals("n")){
            gosto += 1;
        }

        System.out.println("Você se irrita com qualquer coisa? (s/n)");
        String resposta9 = scanner.nextLine();
        if (resposta9.equals("n")){
            gosto += 1;
        }

        System.out.println("Você reclama de adolescentes sendo um? (s/n)");
        String resposta10 = scanner.nextLine();
        if (resposta10.equals("n")){
            gosto += 1;
        }
        System.out.println("Você gosta de funk? (s/n)");
        String resposta11 = scanner.nextLine();
        if (resposta11.equals("s")){
            gosto += 1;
        }

        System.out.println("Você ganha dinheiro em jogo de aposta? (s/n)");
        String resposta12 = scanner.nextLine();
        if (resposta12.equals("n")){
            gosto += 1;
        }

        System.out.println("Você concorda com o Monark? (s/n)");
        String resposta13 = scanner.nextLine();
        if (resposta13.equals("n")){
            gosto += 1;
        }

        if (gosto >= 7){
            System.out.println("te gosto (menos se vc for o Miguel) " + gosto);
        }else System.out.println("vai toma no cu "  + gosto);


    }
}
