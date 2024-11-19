public class Kafe01 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat Anda mendapat diskon 30%");
        } else if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat Anda mendapat diskon 50%");
        } else {
            System.out.println("Tidak mendapat diskon");
        }

        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("Silahkan pilih menu yanga Anda inginkan.");
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON30");
    }

}