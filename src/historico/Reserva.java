package historico;

public class Reserva {
    String nomeHospede;
    String dataCheckIn;
    String dataCheckOut;
    int numeroQuartos;
    String tipoQuarto;

    public Reserva(String nomeHospede, String dataCheckIn, String dataCheckOut, int numeroQuartos, String tipoQuarto) {
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.numeroQuartos = numeroQuartos;
        this.tipoQuarto = tipoQuarto;
    }
}
