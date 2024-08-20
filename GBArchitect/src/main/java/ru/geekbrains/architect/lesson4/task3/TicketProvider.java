package main.java.ru.geekbrains.architect.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TicketProvider {

    private Database database;

    private final PaymentProvider paymentProvider;

    public TicketProvider(PaymentProvider paymentProvider, Database database) {
        this.paymentProvider = paymentProvider;
        this.database = database;
    }

    public ArrayList<Ticket> searchTicket(int clientId, Date date) {

        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : database.getTickets()) {
            if (ticket.getCustumerId() == clientId && ticket.getDate().equals(date)) {
                tickets.add(ticket);
            }
        }
        return (ArrayList<Ticket>) tickets;
    }

    public boolean buyTicket(int clientId, String cardNo) {
        int orderId = database.createTicketOrder(clientId);
        double amount = database.getTicketAmount();
        return paymentProvider.buyTicket(orderId, cardNo, amount);
    }

    public boolean checkTicket(String qrcode) {
        for (Ticket ticket : database.getTickets()) {
            if (ticket.getQrcode().equals(qrcode)) {
                ticket.setEnable(false);
                // Save database
                return true;
            }
        }
        return false;
    }

}
