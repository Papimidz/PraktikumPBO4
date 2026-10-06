public class PencatatanInventaris {
    private Barang barang;
    private Lokasi lokasi;
    private String tanggalPencatatan;

    public PencatatanInventaris(
            Barang barang,
            Lokasi lokasi,
            String tanggalPencatatan) {

        this.barang = barang;
        this.lokasi = lokasi;
        this.tanggalPencatatan = tanggalPencatatan;
    }

    public Barang getBarang() {
        return barang;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public String getTanggalPencatatan() {
        return tanggalPencatatan;
    }
}