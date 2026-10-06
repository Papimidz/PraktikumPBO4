public class Main {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("STEP 20 - PENGUJIAN KASUS INVENTARIS");
        System.out.println("====================================");

        BarangElektronik barang1 =
                new BarangElektronik("B001", "Laptop", 65);

        BarangNonElektronik barang2 =
                new BarangNonElektronik("B002", "Meja Kantor", "Kayu");

        System.out.println("\n=== T4-01 CONSTRUCTOR SUBCLASS ===");
        System.out.println("Barang elektronik berhasil dibuat:");
        System.out.println(barang1.getInfo());

        System.out.println("Barang non-elektronik berhasil dibuat:");
        System.out.println(barang2.getInfo());

        System.out.println("\n=== T4-02 INHERITED METHOD ===");

        System.out.println(
                "Nama barang1 dari getNamaBarang(): "
                + barang1.getNamaBarang());

        System.out.println(
                "Kode barang2 dari getKodeBarang(): "
                + barang2.getKodeBarang());

        System.out.println("\n=== T4-03 OVERRIDE getInfo() ===");

        System.out.println(barang1.getInfo());
        System.out.println(barang2.getInfo());

        System.out.println("\n=== T4-04 super.getInfo() ===");

        System.out.println(
                "Elektronik : " + barang1.getInfo());

        System.out.println(
                "Non Elektronik : " + barang2.getInfo());

        System.out.println("\n=== T4-05 ENCAPSULATION ===");

        System.out.println(
                "Kode melalui getter  : "
                + barang1.getKodeBarang());

        System.out.println(
                "Nama melalui getter  : "
                + barang1.getNamaBarang());

        System.out.println(
                "Daya melalui getter  : "
                + barang1.getDaya());

        System.out.println(
                "Bahan melalui getter : "
                + barang2.getBahan());


        System.out.println("\n=== T4-06 DUA SUBCLASS ===");

        System.out.println("BarangElektronik:");
        System.out.println(barang1.getInfo());

        System.out.println("BarangNonElektronik:");
        System.out.println(barang2.getInfo());

        // ============================================
        // T4-07 - Regression tugas sebelumnya
        // ============================================

        Lokasi lokasi1 =
                new Lokasi("L001", "Ruang IT");

        Lokasi lokasi2 =
                new Lokasi("L002", "Ruang Administrasi");

        PencatatanInventaris pencatatan1 =
                new PencatatanInventaris(
                        barang1,
                        lokasi1,
                        "2026-09-15");

        PencatatanInventaris pencatatan2 =
                new PencatatanInventaris(
                        barang2,
                        lokasi2,
                        "2026-02-22");

        System.out.println(
                "\n=== T4-07 REGRESSION TUGAS LAMA ===");

        System.out.println(
                "Barang: "
                + pencatatan1.getBarang().getNamaBarang()
                + ", Lokasi: "
                + pencatatan1.getLokasi().getNamaLokasi()
                + ", Tanggal: "
                + pencatatan1.getTanggalPencatatan());

        System.out.println(
                "Barang: "
                + pencatatan2.getBarang().getNamaBarang()
                + ", Lokasi: "
                + pencatatan2.getLokasi().getNamaLokasi()
                + ", Tanggal: "
                + pencatatan2.getTanggalPencatatan());

        System.out.println("\n====================================");
        System.out.println("SEMUA PENGUJIAN SELESAI");
        System.out.println("====================================");
    }
}