public class LayananEkspedisi {

    // atribut untuk menyimpan paket, menggunakan protected agar bisa di warisi oleh subclass
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    // konstruk, buat isi niali atribut
    public LayananEkspedisi(String nomorResi, double beratAktualKg,
                            double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // untuk hitung berat yang dipake buat ongkir, rumusnya panjang x lebar x tinggi / 6000, trus dipilih nilai terbesar antara berat asli dan berat volumetrik, karena yang dipake buat ongkir itu yang paling berat
    public double hitungBeratEfektif() {
        double beratVolumetrik = (panjang * lebar * tinggi) / 6000;
        return Math.max(beratAktualKg, beratVolumetrik);
    }

    // buat cetak resi, buat nampilin nomor resi dan berat efektifnya, ini method yang sama untuk semua jenis layanan ekspedisi, jadi kita buat di kelas induk aja
    public void cetakResi() {
        System.out.println("Nomor Resi : " + nomorResi);
        System.out.println("Berat Efektif : " + hitungBeratEfektif() + " Kg");
    }

    // Method polymorphism. Nanti dioverride di subclass karena tiap layanan punya tarif berbeda.
    public double hitungOngkir() {
        return 0.0;
    }
}