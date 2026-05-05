public class AcPintar extends PerangkatPintar {
//Nmr 1
    @Override
    public void aktifkan() {
        System.out.println("AC menyala dan mulai mendinginkan ruangan.");
    }

    public void aturSuhu(int suhu) {
        System.out.println("Suhu AC diatur ke " + suhu + " derajat.");
    }
}