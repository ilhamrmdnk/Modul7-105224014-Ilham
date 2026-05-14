public class LayananInternasional extends LayananEkspedisi {

    // tambahan atribut khusus untuk layanan internasional
    private String negaraTujuan;
    private double nilaiBarangUSD;

    public LayananInternasional(String nomorResi, double beratAktualKg,
                                double panjang, double lebar, double tinggi,
                                String negaraTujuan, double nilaiBarangUSD) {

        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);

        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    // hitung ongkir internasional, tarif dasar Rp200.000 per kg berat efektif, ditambah pajak 20% jika nilai barang lebih dari $50
    @Override
    public double hitungOngkir() {

        double ongkirDasar = hitungBeratEfektif() * 200000;

        double pajak = 0;

        if (nilaiBarangUSD > 50) {
            pajak = 0.20 * ongkirDasar;
        }

        return ongkirDasar + pajak;
    }

    // tampilkan manifest internasional, berisi negara tujuan dan deklarasi nilai barang dalam USD
    public void cetakManifest() {
        System.out.println("Manifest Internasional ke "
                + negaraTujuan
                + " - Deklarasi Nilai: $"
                + nilaiBarangUSD);
    }
}