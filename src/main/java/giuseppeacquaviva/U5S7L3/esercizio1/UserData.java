package giuseppeacquaviva.U5S7L3.esercizio1;

import lombok.ToString;

@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void setData(DataSource data) {
        nomeCompleto = data.getNomeCompleto();
        eta = data.getEta();
    }
}
