import java.text.DecimalFormat;
import java.util.Scanner;

public class TokoGudangOke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Stok Gudang Input Barang");
        System.out.println("##################");
        System.out.println();

        System.out.println("Selamat datang, " + name);
        System.out.print("Masukkan nama barang yang ingin ditambah: ");
        String barang = scanner.nextLine();

        System.out.print("Masukkan jumlah barang yang ingin ditambah: ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan harga beli untuk barang tersebut: ");
        double hargaBeli = scanner.nextDouble();

        System.out.print("Masukkan harga jual untuk barang tersebut: ");
        double hargaJual = scanner.nextDouble();

        System.out.println();
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("###################");
        System.out.println();

        System.out.println("Nama Barang    : " + barang);
        System.out.println("Jumlah Barang  : " + jumlah);
        System.out.println("Harga Beli     : Rp. " + decimalFormat.format(hargaBeli));
        System.out.println("Harga Jual     : Rp. " + decimalFormat.format(hargaJual));
        
        scanner.close();
    }
}
