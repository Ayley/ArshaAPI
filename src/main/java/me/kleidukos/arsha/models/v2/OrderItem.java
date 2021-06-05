package me.kleidukos.arsha.models.v2;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize
public record OrderItem (int id, int sid, List<Order> orders) {}
