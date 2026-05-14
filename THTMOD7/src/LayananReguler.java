public class LayananReguler extends LayananEkspedisi {
// warisin semua atribut dan method dari kelas induk LayananEkspedisi
    public LayananReguler(String nomorResi, double beratAktualKg,
                          double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // hitung ongkir untuk layanan reguler, tarifnya Rp15.000 per kg berat efektif
    @Override
    public double hitungOngkir() {
        return hitungBeratEfektif() * 15000;
    }

    // Method khusus untuk layanan reguler, hitung ongkir dengan promo member dan biaya jarak
    public double hitungOngkir(boolean isMember, int jarakKm) {

        double total = hitungOngkir();

        // jika member, dikon 10% dari total ongkir
        if (isMember) {
            total = total - (0.10 * total);
        }

        // Tambahan biaya 500 per km 
        total = total + (500 * jarakKm);

        return total;
    }
}