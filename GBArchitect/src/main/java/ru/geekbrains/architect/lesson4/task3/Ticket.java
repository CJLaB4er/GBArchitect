package main.java.ru.geekbrains.architect.lesson4.task3;

import java.util.Date;

/**
 * Билет
 */
public class Ticket {

    private int id;

    private int custumerId;

    private Date date;

    private String qrcode;

    private boolean enable = true;

    public int getId() {
        return id;
    }

    public int getCustumerId() {
        return custumerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrcode() {
        return qrcode;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
