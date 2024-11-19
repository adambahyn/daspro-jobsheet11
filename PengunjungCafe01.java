public class PengunjungCafe01 {
    public static void daftarPengunjung(Object... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (Object object : namaPengunjung)
            if (object instanceof String) {
                System.out.println("nama - " + object);
            } else if (object instanceof Integer) {
                System.out.println("angka - " + object);
            }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", 2, "Budi", 3, "Citra");

    }
}
