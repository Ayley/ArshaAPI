package me.kleidukos.arsha.models.v1;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record PriceItem(String icon, String name, int id, int sid, long basePrice) {}
