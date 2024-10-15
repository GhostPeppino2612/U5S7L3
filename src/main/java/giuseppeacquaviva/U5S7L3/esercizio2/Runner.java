package giuseppeacquaviva.U5S7L3.esercizio2;

import org.springframework.boot.CommandLineRunner;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
       Page page1 = new Page(1, "content1");
        Page page2 = new Page(2, "content2");
        Page page3 = new Page(3, "content3");
        Page page4 = new Page(4, "content4");
        Page page5 = new Page(5, "content5");
        Page page6 = new Page(6, "content6");
        Page page7 = new Page(7, "content7");
        Page page8 = new Page(8, "content8");
        Page page9 = new Page(9, "content9");
        Page page10 = new Page(10, "content10");

        Sezione sezione1 = new Sezione("Sottosezione1", Arrays.asList(page1, page2));
        Sezione sezione2 = new Sezione("Sottosezione2", Arrays.asList(page3, page4));
        Sezione sezione3 = new Sezione("Sottosezione3", Arrays.asList(page5, page6));
        Sezione sezione4 = new Sezione("Sottosezione4", Arrays.asList(page7, page8));
        Sezione sezione5 = new Sezione("Sottosezione5", Arrays.asList(page9, page10));

        Sezione capitolo1 = new Sezione("Capitolo1", Arrays.asList(sezione1, sezione2));
        Sezione capitolo2 = new Sezione("Capitolo2", Arrays.asList(sezione3, sezione4, sezione5));

        Libro libro = new Libro("libro1", Arrays.asList(capitolo1, capitolo2), 24.5, Arrays.asList("caracter1", "caracter2", "caracter3"));
        libro.stampa();
        System.out.println("Il libro "+ libro.getTitolo() + " ha " + libro.getNumeroPagine() + " pagine");
    }
}
