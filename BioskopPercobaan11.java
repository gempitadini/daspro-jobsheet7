import java.util.Scanner;

public class BioskopPercobaan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket = 0, totalTiket;
        double hargaTiket = 50000, totalPenjualan = 0, diskon = 0, hargaAkhir;

        while (true) {
            System.out.println("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == -1) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silahkan coba lagi! ");
                continue;
            }
            hargaAkhir = jumlahTiket * hargaTiket;
            if (jumlahTiket > 4) {
                diskon = (1.0 - 0.10);
                hargaAkhir *= diskon;
            } else if (jumlahTiket > 10) {
                diskon = (1.0 - 0.15);
                hargaAkhir *= diskon;
            } else {
                diskon = (1.0 - 0.0);
                hargaAkhir *= diskon;
            }
            System.out.println("Harga tiket yang dibayar: " + hargaAkhir);

        } 
        System.out.println("Total tiket yang terjual: " + jumlahTiket);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);  

        sc.close();
    }
}
