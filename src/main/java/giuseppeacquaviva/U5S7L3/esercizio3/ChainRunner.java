package giuseppeacquaviva.U5S7L3.esercizio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Generale generale = new Generale();
        Colonnello colonnello = new Colonnello();
        Tenente tenente = new Tenente();
        Maggiore maggiore = new Maggiore();
        Capitano capitano = new Capitano();

        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        capitano.doCheck(500);
    }
}
