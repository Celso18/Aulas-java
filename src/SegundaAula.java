import java.util.Scanner;

public class SegundaAula {
    public static void main(String[] argus) {
        Scanner scanner = new (System.in);
        int  value = scanner.nextInt();


        if (value < 10);
        System.out.println("Menor do que 10");

      } else if (value == 10) {
          System.out.println("Maior do que 10");

        switch (value){
            case 1:
                System.out.println("Escolheu 1");
                break;
            default;
                System.out.println("não escolheu uma das opções")
                 break;
        }

    }
}

