
import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data pengunjung
        System.out.print("Masukkan Nama       : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Kode Hari  : ");
        int kodeHari = input.nextInt();

        System.out.print("Masukkan Umur       : ");
        int umur = input.nextInt();

        String kategori = "";
        int harga = 0;

        // Menentukan kategori hari
        if (kodeHari >= 1 && kodeHari <= 5) {
            kategori = "Hari Kerja";

            // Menentukan harga tiket hari kerja
            if (umur >= 0 && umur < 13) {
                harga = 20000;
            } else if (umur >= 13 && umur < 18) {
                harga = 30000;
            } else if (umur >= 18) {
                harga = 45000;
            }

        } else if (kodeHari == 6 || kodeHari == 7) {
            kategori = "Akhir Pekan";

            // Menentukan harga tiket akhir pekan
            if (umur >= 0 && umur < 13) {
                harga = 20000;
            } else if (umur >= 13 && umur < 18) {
                harga = 40000;
            } else if (umur >= 18) {
                harga = 60000;
            }
        }

        // Memeriksa validitas input
        if (kodeHari < 1 || kodeHari > 7) {
            System.out.println("Kode hari tidak valid.");
        } else if (umur < 0) {
            System.out.println("Umur tidak valid.");
        } else {
            // Menampilkan hasil
            System.out.println("========================");
            System.out.println("Nama     : " + nama);
            System.out.println("Kategori : " + kategori);
            System.out.println("Harga    : Rp " + harga);
        }

        input.close();
    }
}
