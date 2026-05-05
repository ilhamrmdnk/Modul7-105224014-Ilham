import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Upcasting
        ArrayList<MetodePembayaran> daftar = new ArrayList<>();

        daftar.add(new EWallet());
        daftar.add(new KartuKredit());

        // Looping
        for (MetodePembayaran m : daftar) {

            // Runtime Polymorphism
            m.bayar(100000);

            // instanceof + Downcasting
            if (m instanceof EWallet) {
                EWallet e = (EWallet) m;
                e.bayar(100000, "08123456789"); // Overloading
            } 
            
            else if (m instanceof KartuKredit) {
                KartuKredit k = (KartuKredit) m;
                k.verifikasiPIN(); // method khusus
            }
        }
    }
}