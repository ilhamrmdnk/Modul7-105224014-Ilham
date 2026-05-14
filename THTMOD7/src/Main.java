import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Upcasting, semua layanan ekspedisi disimpan dalam list yang sama, walaupun jenisnya beda-beda, karena semua turunan dari LayananEkspedisi
        ArrayList<LayananEkspedisi> daftar = new ArrayList<>();

        // buat data paket untuk masing-masing layanan ekspedisi, nanti kita looping buat cetak resi dan hitung ongkirnya
        daftar.add(new LayananReguler(
                "REG-11",
                2,
                50,
                50,
                50));

        daftar.add(new LayananExpress(
                "EXP-22",
                5,
                10,
                10,
                10));

        daftar.add(new LayananInternasional(
                "INT-33",
                3,
                20,
                20,
                20,
                "Korea",
                100));

        double totalPendapatanPerusahaan = 0.0;

        // melakukan iterasi untuk setiap layanan ekspedisi dalam daftar, cetak resi, hitung ongkir dasar, dan jika ada fitur khusus, kita panggil methodnya sesuai jenis layanan
        for (LayananEkspedisi layanan : daftar) {

            layanan.cetakResi();

            double ongkirDasar = layanan.hitungOngkir();

            System.out.println("Ongkir Dasar : Rp" + ongkirDasar);

            totalPendapatanPerusahaan += ongkirDasar;

            // cek jenis layanan dengan instanceof, lalu panggil method khususnya sesuai jenis layanan, ini contoh penggunaan polymorphism dengan downcasting
            if (layanan instanceof LayananReguler) {

                LayananReguler reg =
                        (LayananReguler) layanan;

                double totalPromo =
                        reg.hitungOngkir(true, 25);

                System.out.println(
                        "Ongkir Setelah Promo + Jarak : Rp"
                                + totalPromo);
            }

            else if (layanan instanceof LayananExpress) {

                LayananExpress exp =
                        (LayananExpress) layanan;

                exp.klaimAsuransi(1500000);
            }

            else if (layanan instanceof LayananInternasional) {

                LayananInternasional intl =
                        (LayananInternasional) layanan;

                intl.cetakManifest();
            }

            System.out.println("--------------------------");
        }

        System.out.println(
                "Total Pendapatan Perusahaan : Rp"
                        + totalPendapatanPerusahaan);
    }
}