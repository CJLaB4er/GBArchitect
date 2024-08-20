package main.java.ru.geekbrains.architect.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;

public class Database {

    private static int counter;

    private Collection<Ticket> tickets = new ArrayList<>();

    private Collection<Custumer> custumers = new ArrayList<>();

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Custumer> getCustumers() {
        return custumers;
    }

    /**
     * Получить актуальную стоимость билета
     *
     * @return
     */
    public double getTicketAmount() {
        return 45;
    }

    public int createTicketOrder(int clieentId) {
        return ++counter;
    }

    public Database() {
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
    }

}
