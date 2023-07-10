import java.util.Scanner;

public class DeretProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial\n");

            // Input banyak angka
            int banyakAngka;
            do {
                System.out.print("Masukkan banyak angka yang mau dicetak [2..10]: ");
                banyakAngka = scanner.nextInt();
            } while (banyakAngka < 2 || banyakAngka > 10);

            // Input beda
            int beda;
            do {
                System.out.print("Masukkan beda masing-masing angka [2..9]: ");
                beda = scanner.nextInt();
            } while (beda < 2 || beda > 9);

            System.out.println("\nDeret Aritmatika:");
            cetakDeretAritmatika(banyakAngka, beda);
            System.out.println("\n");

            System.out.println("Deret Geometri:");
            cetakDeretGeometri(banyakAngka, beda);
            System.out.println("\n");

            System.out.println("Faktorial:");
            int faktorial = hitungFaktorial(banyakAngka);
            cetakFaktorial(banyakAngka, faktorial);

            System.out.print("\nAnda mau ulang [y/t]: ");
            ulang = scanner.next();
            System.out.println();
        } while (ulang.equalsIgnoreCase("y"));

        scanner.close(); // Menutup Scanner setelah selesai digunakan
    }

    public static void cetakDeretAritmatika(int banyakAngka, int beda) {
        int angka = 1;
        for (int i = 0; i < banyakAngka; i++) {
            System.out.print(angka + " ");
            angka += beda;
        }
    }

    public static void cetakDeretGeometri(int banyakAngka, int beda) {
        int angka = 1;
        for (int i = 0; i < banyakAngka; i++) {
            System.out.print(angka + " ");
            angka *= beda;
        }
    }

    public static int hitungFaktorial(int n) {
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        return faktorial;
    }

    public static void cetakFaktorial(int banyakAngka, int faktorial) {
        System.out.print(banyakAngka + " * ");
        for (int i = banyakAngka - 1; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + faktorial);
    }
}
