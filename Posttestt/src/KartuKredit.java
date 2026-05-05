public class KartuKredit extends MetodePembayaran {

    // Overriding
    @Override
    public void bayar(double nominal) {
        System.out.println("Mencetak tagihan Kartu Kredit sebesar Rp" + nominal + "...");
    }

    // Method khusus
    public void verifikasiPIN() {
        System.out.println("Memverifikasi PIN Kartu Kredit... BERHASIL!");
    }
}