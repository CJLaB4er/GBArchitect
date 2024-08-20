package main.java.ru.geekbrains.architect.lesson4.task3;


/**
 * Ядро приложения
 */
public class Core {

    private final CustumerProvider custumerProvider;
    private final TicketProvider ticketProvider;
    private final PaymentProvider paymentProvider;
    private final Database database;

    public CustumerProvider getCustumerProvider() {
        return custumerProvider;
    }

    public TicketProvider getTicketProvider() {
        return ticketProvider;
    }

    public Core() {
        database = new Database();
        custumerProvider = new CustumerProvider(database);
        paymentProvider = new PaymentProvider();
        ticketProvider = new TicketProvider(paymentProvider, database);


    }
}
