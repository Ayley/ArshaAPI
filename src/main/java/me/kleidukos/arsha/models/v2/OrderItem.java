package me.kleidukos.arsha.models.v2;

import java.util.Arrays;

public class OrderItem {

    private int id;
    private int sid;
    private Order[] orders;

    public OrderItem(int id, int sid, Order[] orders) {
        this.id = id;
        this.sid = sid;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public int getSid() {
        return sid;
    }

    public Order[] getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", sid=" + sid +
                ", orders=" + Arrays.toString(orders) +
                '}';
    }
}
