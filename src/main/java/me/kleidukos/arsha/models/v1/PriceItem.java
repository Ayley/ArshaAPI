package me.kleidukos.arsha.models.v1;

public class PriceItem {

    private String icon;
    private String name;
    private int id;
    private int sid;
    private long basePrice;

    public PriceItem(String icon, String name, int id, int sid, long basePrice) {
        this.icon = icon;
        this.name = name;
        this.id = id;
        this.sid = sid;
        this.basePrice = basePrice;
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSid() {
        return sid;
    }

    public long getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "PriceItem{" +
                "icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", sid=" + sid +
                ", basePrice=" + basePrice +
                '}';
    }
}
