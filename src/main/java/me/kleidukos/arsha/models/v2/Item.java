package me.kleidukos.arsha.models.v2;

public class Item {

    private String name;
    private String icon;
    private int id;
    private int sid;
    private String minEnhance;
    private String maxEnhance;
    private long basePrice;
    private int currentStock;
    private long totalTrades;
    private long priceMin;
    private long priceMax;
    private long lastSoldPrice;
    private long lastSoldTime;

    public Item(String name, String icon, int id, int sid, String minEnhance, String maxEnhance, long basePrice, int currentStock, long totalTrades, long priceMin, long priceMax, long lastSoldPrice, long lastSoldTime) {
        this.name = name;
        this.icon = icon;
        this.id = id;
        this.sid = sid;
        this.minEnhance = minEnhance;
        this.maxEnhance = maxEnhance;
        this.basePrice = basePrice;
        this.currentStock = currentStock;
        this.totalTrades = totalTrades;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
        this.lastSoldPrice = lastSoldPrice;
        this.lastSoldTime = lastSoldTime;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public int getId() {
        return id;
    }

    public int getSid() {
        return sid;
    }

    public String getMinEnhance() {
        return minEnhance;
    }

    public String getMaxEnhance() {
        return maxEnhance;
    }

    public long getBasePrice() {
        return basePrice;
    }

    public long getCurrentStock() {
        return currentStock;
    }

    public long getTotalTrades() {
        return totalTrades;
    }

    public long getPriceMin() {
        return priceMin;
    }

    public long getPriceMax() {
        return priceMax;
    }

    public long getLastSoldPrice() {
        return lastSoldPrice;
    }

    public long getLastSoldTime() {
        return lastSoldTime;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", id=" + id +
                ", sid=" + sid +
                ", minEnhance='" + minEnhance + '\'' +
                ", maxEnhance='" + maxEnhance + '\'' +
                ", basePrice=" + basePrice +
                ", currentStock=" + currentStock +
                ", totalTrades=" + totalTrades +
                ", priceMin=" + priceMin +
                ", priceMax=" + priceMax +
                ", lastSoldPrice=" + lastSoldPrice +
                ", lastSoldTime=" + lastSoldTime +
                '}';
    }
}
