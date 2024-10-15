package giuseppeacquaviva.U5S7L3.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Page extends ComponenteLibro{
    private int numeroDiPagina;
    @Getter
    private String contenuto;

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Numero di pagina " + this.numeroDiPagina);
        System.out.println(this.contenuto);
    }

}
