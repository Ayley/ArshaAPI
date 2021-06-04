package me.kleidukos.arsha.models.v2;

import java.util.HashMap;

public class HistoryItem {

    private int id;
    private int sid;
    private HashMap<Long, Long> history;

    public HistoryItem(int id, int sid, HashMap<Long, Long> history) {
        this.id = id;
        this.sid = sid;
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public int getSid() {
        return sid;
    }

    public HashMap<Long, Long> getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return "HistoryItem{" +
                "id=" + id +
                ", sid=" + sid +
                ", history=" + history +
                '}';
    }
}
