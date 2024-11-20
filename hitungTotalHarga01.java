import java.util.*;

public class hitungTotalHarga01 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        double hargaTotal;

        if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat Anda mendapat diskon 30%");
            hargaTotal = (hargaItems[pilihanMenu - 1] * banyakItem) * 0.7;
        } else if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat Anda mendapat diskon 50%");
            hargaTotal = (hargaItems[pilihanMenu - 1] * banyakItem) * 0.5;
        } else {
            System.out.println("Anda tidak mendapat diskon");
            hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        }

        return (int) hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalHarga=0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            sc.nextLine();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();

            System.out.print("\nMasukkan kode promo: ");
            String kodePromo = sc.nextLine();

            int Harga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalHarga += Harga;

            System.out.println("Subtotal pesanan saat ini: Rp" + totalHarga);

            System.out.println("Apakah anda ingin menambah pesanan lagi? (y/n)");
            String jawaban = sc.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                break;   
            }
        }
        
        
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
