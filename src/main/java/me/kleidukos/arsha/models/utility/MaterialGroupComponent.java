package me.kleidukos.arsha.models.utility;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record MaterialGroupComponent(String name, int id) {
}
