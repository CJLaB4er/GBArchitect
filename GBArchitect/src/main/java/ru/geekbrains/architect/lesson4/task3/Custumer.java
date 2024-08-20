package main.java.ru.geekbrains.architect.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Покупатель
 */
public class Custumer {

    private static int counter;

    private final int id;


    {
        id = ++counter;
    }

    private Collection<Ticket> tickets;

    public int getId() {
        return id;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }


}
