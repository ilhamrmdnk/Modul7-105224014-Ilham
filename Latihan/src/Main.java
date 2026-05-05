import java.util.ArrayList;

//Nmr 3
public class Main {
    public static void main(String[] args) {

        ArrayList<PerangkatPintar> daftar = new ArrayList<>();
        PerangkatPintar lampu = new LampuPintar();
        PerangkatPintar ac = new AcPintar();

        daftar.add(lampu);
        daftar.add(ac);

        for (PerangkatPintar p : daftar) {
            p.aktifkan();
        }

//Nmr 4
        for (PerangkatPintar p : daftar) {
            if (p instanceof AcPintar) {
                AcPintar acObj = (AcPintar) p;
                acObj.aturSuhu(20);
            }
        }
    }
}