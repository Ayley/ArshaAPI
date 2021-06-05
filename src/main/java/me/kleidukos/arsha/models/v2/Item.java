package me.kleidukos.arsha.models.v2;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record Item(String name, String icon, int id, int sid, String minEnhance, String maxEnhance, long basePrice, int currentStock, long totalTrades, long priceMin, long priceMax, long lastSoldPrice, long lastSoldTime) {
}
