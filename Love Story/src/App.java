import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println();
        
        System.out.println("Data Anda :");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥");
        
        System.out.print("Masukkan Nama Anda  : ");
        String namaUser = scanner.nextLine();
        System.out.print("Masukkan Umur Anda  : ");
        int umurUser = scanner.nextInt();
        
        scanner.nextLine(); // Membersihkan newline di buffer
        
        System.out.println();
        System.out.println("Data Pasangan Anda :");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        
        System.out.print("Masukkan Nama Pasangan Anda  : ");
        String namaPasangan = scanner.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda  : ");
        int umurPasangan = scanner.nextInt();
        
        System.out.println();
        System.out.println(namaUser + " [" + umurUser + "] tahun");
        printHeartSymbol();
        System.out.println();
        System.out.println(namaPasangan + " [" + umurPasangan + "] tahun");
        System.out.println();
        
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        scanner.nextLine(); // Menunggu input ENTER
        
        Random random = new Random();
        int hasil = random.nextInt(51) + 50; // Random angka antara 50 - 100
        double kecocokan = hasil / 1.1;
        
        System.out.printf("Kecocokan Anda dengan pasangan Anda adalah: %.2f%%\n", kecocokan);
        System.out.println();
        System.out.println("Terima Kasih karena Anda telah menggunakan jasa Ramalah kami... :)");

        scanner.close();
    }
    
    private static void printHeartSymbol() {
        System.out.println("   ♥♥♥   ♥♥♥");
        System.out.println(" ♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println(" ♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("   ♥♥♥♥♥♥♥♥");
        System.out.println("     ♥♥♥♥");
        System.out.println("       ♥");
    }

}
