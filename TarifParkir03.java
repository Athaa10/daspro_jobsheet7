import java.util.Scanner;
public class TarifParkir03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan, durasi, total = 0;

        System.out.println("Jenis kendaraan");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan jenis kendaraan: ");
        jenisKendaraan = sc.nextInt();

        do {
            System.out.print("Masukkan durasi parkir (ketik '0' untuk selesai): ");
            durasi = sc.nextInt();
            if ((jenisKendaraan == 1) || (jenisKendaraan == 2)) {
                if (durasi > 5) {
                    total += 12500;
                } else if (jenisKendaraan == 1) {
                    total += durasi * 3000;
                } else if (jenisKendaraan == 2) {
                    total += durasi * 2000;
                }
                if (durasi==0) {
                    System.out.println("Transaksi selesai");
                    break;
                }
            }
        } while (jenisKendaraan != 0);
        System.out.println("Total biaya parkir: Rp "+ total);
        
    }
}