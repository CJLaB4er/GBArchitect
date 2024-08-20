package main.java.ru.geekbrains.architect.lesson4.task3;

/**
 * Автобусная станция
 */
public class BusStation {

    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider) {
        this.ticketProvider = ticketProvider;
    }

    public boolean checkTicket(String qrcode) {
        return ticketProvider.checkTicket(qrcode);
    }

}
