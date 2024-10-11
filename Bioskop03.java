import java.util.Scanner;
public class Bioskop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  i = 0, jumlahTiket, jml;
        String namaPelanggan;
        double totalHarga, hargaTiket = 50000, diskon = 0, hargaSetelahDiskon;

        System.out.print("Masukkan jumlah pelanggan: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan jumlah tiket untuk pelanggan ke-" + (i + 1) + ": ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi tiket yang valid!");
                continue;
            }
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket >= 5) {
                diskon = 0.10;
            } else {  
                diskon = 0;                           
            }

            totalHarga = jumlahTiket * hargaTiket;
            hargaSetelahDiskon = totalHarga - (totalHarga * diskon);
            System.out.println("Harga total untuk pelanggan ke- " + (i+1) + " setelah diskon Rp " + hargaSetelahDiskon);
            i++;
        }

        System.out.println("Semua transaksi selesai.");

    }
}