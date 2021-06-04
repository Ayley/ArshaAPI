package me.kleidukos.arsha.models.v2;

class Order {

    private long price;
    private int buyers;
    private int sellers;

    public Order(long price, int buyers, int sellers) {
        this.price = price;
        this.buyers = buyers;
        this.sellers = sellers;
    }

    public long getPrice() {
        return price;
    }

    public int getBuyers() {
        return buyers;
    }

    public int getSellers() {
        return sellers;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", buyers=" + buyers +
                ", sellers=" + sellers +
                '}';
    }
}
