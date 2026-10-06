public class BarangElektronik extends Barang {
    private int daya;

    public BarangElektronik(String kodeBarang, String namaBarang, int daya) {
        super(kodeBarang, namaBarang);
        this.daya = daya;
    }

    public int getDaya() {
        return daya;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Daya: " + daya + " watt";
    }
}