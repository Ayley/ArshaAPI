package me.kleidukos.arsha.models.v2;

public class WorldMarketItem {

    private int id;
    private int currentStock;
    private long totalTrades;
    private long basePrice;

    public WorldMarketItem(int id, int currentStock, long totalTrades, long basePrice) {
        this.id = id;
        this.currentStock = currentStock;
        this.totalTrades = totalTrades;
        this.basePrice = basePrice;
    }

    public int getId() {
        return id;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public long getTotalTrades() {
        return totalTrades;
    }

    public long getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "WorldMarketItem{" +
                "id=" + id +
                ", currentStock=" + currentStock +
                ", totalTrades=" + totalTrades +
                ", basePrice=" + basePrice +
                '}';
    }
}
