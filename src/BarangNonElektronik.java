public class BarangNonElektronik extends Barang {
    private String bahan;

    public BarangNonElektronik(String kodeBarang, String namaBarang, String bahan) {
        super(kodeBarang, namaBarang);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Bahan: " + bahan;
    }
}