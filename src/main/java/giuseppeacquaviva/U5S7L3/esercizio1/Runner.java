package giuseppeacquaviva.U5S7L3.esercizio1;

import org.springframework.boot.CommandLineRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataDiNascita = sdf.parse("22/12/2003");

        // Creazione dell'oggetto Info
        Info info = new Info("Gianni", "Morandi", dataDiNascita);
        Adapter adapter = new Adapter(info);
        UserData userData = new UserData();
        userData.setData(adapter);
        System.out.println(userData);

    }
}
