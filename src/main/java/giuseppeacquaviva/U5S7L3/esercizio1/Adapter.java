package giuseppeacquaviva.U5S7L3.esercizio1;

import java.time.LocalDate;
import java.time.ZoneId;

public class Adapter implements DataSource {
    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + " " + this.info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate date = this.info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return LocalDate.now().getYear() - date.getYear();
    }
}
