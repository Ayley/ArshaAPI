package me.kleidukos.arsha.models.v2;

import java.util.HashMap;

public record HistoryItem(int id, int sid, HashMap<Long, Long> history) {}
