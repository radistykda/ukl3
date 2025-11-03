import java.util.Scanner;

public class faktorialukl {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
          System.out.print("masukkan bilangan: ");
        int angka = input.nextInt();

        if (angka < 0) {
            System.out.println("angka negatif tidak dapat dihitung.");
        } else {
            int faktorial = 1; 

            for (int i = 1; i <= angka; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);
        }
         input.close();
    }
}