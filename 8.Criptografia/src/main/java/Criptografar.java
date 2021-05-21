import java.util.Scanner;


public class Criptografar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = sc.next();

        char[] converter = texto.toCharArray();

        for (int i = 0; i < converter.length; i++) {
            converter[i] += 3;
        }

        System.out.println(converter);

        for (int i = 0; i < converter.length; i++) {
            converter[i] -= 3;
        }

        System.out.println(converter);

    }
}
