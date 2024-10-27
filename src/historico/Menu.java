package historico;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1; // Inicializa com um valor que não está no menu

        while (opcao != 0) {
            System.out.println("1. Adicionar Quarto");
            System.out.println("2. Fazer Reserva");
            System.out.println("3. Check-in");
            System.out.println("4. Check-out");
            System.out.println("5. Relatório de Ocupação");
            System.out.println("6. Relatório de Histórico");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Número do Quarto: ");
                    String numero = scanner.nextLine();
                    
                    System.out.print("Tipo de Quarto: ");
                    String tipo = scanner.nextLine();
                    
                    System.out.print("Preço Diário: ");
                    double precoDiario = scanner.nextDouble();
                    
                    hotel.adicionarQuarto(numero, tipo, precoDiario);
                    break;
                    
                case 2:
                    System.out.print("Nome do Hóspede: ");
                    String nomeHospede = scanner.nextLine();
                    System.out.print("Data de Check-in: ");
                    String dataCheckIn = scanner.nextLine();
                    System.out.print("Data de Check-out: ");
                    String dataCheckOut = scanner.nextLine();
                    System.out.print("Número de Quartos: ");
                    int numeroQuartos = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Tipo de Quarto: ");
                    String tipoQuarto = scanner.nextLine();
                    hotel.fazerReserva(nomeHospede, dataCheckIn, dataCheckOut, numeroQuartos, tipoQuarto);
                    break;

                case 3:
                    System.out.print("Nome do Hóspede: ");
                    String nomeCheckIn = scanner.nextLine();
                    hotel.checkIn(nomeCheckIn);
                    break;

                case 4:
                    System.out.print("Nome do Hóspede: ");
                    String nomeCheckOut = scanner.nextLine();
                    hotel.checkOut(nomeCheckOut);
                    break;

                case 5:
                    hotel.relatorioOcupacao();
                    break;

                case 6:
                    hotel.relatorioHistorico();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
