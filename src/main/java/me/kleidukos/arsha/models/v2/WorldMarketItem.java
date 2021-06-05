package me.kleidukos.arsha.models.v2;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record WorldMarketItem(int id, int currentStock, long totalTrades, long basePrice) {}
