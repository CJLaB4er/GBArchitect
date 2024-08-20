package main.java.ru.geekbrains.architect.lesson4.task3;

import java.util.Collection;
import java.util.Date;

/**
 * Мобильное приложение
 */
public class MobileApp {

    private final Custumer custumer;

    private final TicketProvider ticketProvider;

    private final CustumerProvider custumerProvider;

    public MobileApp(CustumerProvider custumerProvider, TicketProvider ticketProvider) {
        this.custumerProvider = custumerProvider;
        this.ticketProvider = ticketProvider;
        this.custumer = custumerProvider.getCustumer("login", "password");
    }

    public Collection<Ticket> getTickets() {
        return custumer.getTickets();
    }

    public void searchTicket(Date date) {
        custumer.setTickets(ticketProvider.searchTicket(custumer.getId(), new Date()));
    }

    public boolean buyTicket(String cardNo) {
        return ticketProvider.buyTicket(custumer.getId(), cardNo);
    }
}
