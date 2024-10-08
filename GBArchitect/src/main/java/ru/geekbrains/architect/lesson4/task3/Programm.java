package main.java.ru.geekbrains.architect.lesson4.task3;

import java.util.Collection;
import java.util.Date;

public class Programm {
    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик"
     *
     * 5,6,7,8,10 - необязательные, опциональные задания.
     *
     * 1. Предусловия.
     * 2. Постусловия.
     * 3. Инвариант.
     * 4. Определить абстрактные и конкретные классы.
     * 5. Определить интерфейсы.
     * 6. Реализовать наследование.
     * 7. Выявить компоненты.
     * 8. Разработать Диаграмму компонент используя нотацию UML 2.0. Общая без деталей.
     */

    public static void main(String[] args) {

        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getCustumerProvider(), core.getTicketProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());

        if (mobileApp.buyTicket("123123")) {
            mobileApp.searchTicket(new Date());
            Collection<Ticket> tickets = mobileApp.getTickets();
//            busStation.checkTicket(tickets.stream().findFirst().get().getQrcode());
            System.out.println("Клиент успешно прошел в автобус");

        }
    }
}
