public class EWallet extends MetodePembayaran {

    // Overriding
    @Override
    public void bayar(double nominal) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + "...");
    }

    // Overloading
    public void bayar(double nominal, String nomorHp) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + " dari nomor " + nomorHp + "...");
    }
}