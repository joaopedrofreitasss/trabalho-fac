package historico;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Quarto> quartos;
    ArrayList<Reserva> reservas;

    public Hotel() {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarQuarto(String numero, String tipo, double precoDiario) {
        quartos.add(new Quarto(numero, tipo, precoDiario));
    }

    public void fazerReserva(String nomeHospede, String dataCheckIn, String dataCheckOut, int numeroQuartos, String tipoQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.tipo.equals(tipoQuarto) && quarto.disponivel && numeroQuartos > 0) {
                quarto.disponivel = false;
                reservas.add(new Reserva(nomeHospede, dataCheckIn, dataCheckOut, numeroQuartos, tipoQuarto));
                System.out.println("Reserva feita com sucesso!");
                return;
            }
        }
        System.out.println("Quartos não disponíveis.");
    }

    public void checkIn(String nomeHospede) {
        for (Reserva reserva : reservas) {
            if (reserva.nomeHospede.equals(nomeHospede)) {
                System.out.println("Check-in realizado para: " + nomeHospede);
                return;
            }
        }
        System.out.println("Reserva não encontrada para " + nomeHospede);
    }

    public void checkOut(String nomeHospede) {
        for (Reserva reserva : reservas) {
            if (reserva.nomeHospede.equals(nomeHospede)) {
                for (Quarto quarto : quartos) {
                    if (!quarto.disponivel && reserva.tipoQuarto.equals(quarto.tipo)) {
                        quarto.disponivel = true;
                        System.out.println("Check-out realizado para: " + nomeHospede);
                        return;
                    }
                }
            }
        }
        System.out.println("Reserva não encontrada ou já disponível.");
    }

    public void relatorioOcupacao() {
        int quartosOcupados = 0;
        for (Quarto quarto : quartos) {
            if (!quarto.disponivel) {
                quartosOcupados++;
            }
        }
        System.out.println("Número de quartos ocupados: " + quartosOcupados);
    }

    public void relatorioHistorico() {
        for (Reserva reserva : reservas) {
            System.out.println("Hospede: " + reserva.nomeHospede + ", Check-in: " + reserva.dataCheckIn + ", Check-out: " + reserva.dataCheckOut + ", Quartos: " + reserva.numeroQuartos + ", Tipo: " + reserva.tipoQuarto);
        }
    }
}
