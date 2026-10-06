public class Barang {
    private String kodeBarang;
    private String namaBarang;

    public Barang(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getInfo() {
        return "Kode: " + kodeBarang + ", Nama: " + namaBarang;
    }
}