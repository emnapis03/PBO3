import java.sql.Date;
import java.time.Month;
import java.time.Year;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Kasir k1 = new Kasir();

        // k1.absen();

        // Mnager m1 = new Mnager();
        // m1.absen();
        // m1.absen(12, 07, 2002);

        Karyawan kar2 = new Kasir();
        kar2.absen();
        kar2 = new Mnager();
        kar2.absen();

    }
}
