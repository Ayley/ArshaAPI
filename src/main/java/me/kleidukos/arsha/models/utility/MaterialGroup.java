package me.kleidukos.arsha.models.utility;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Map;

@JsonSerialize
public record MaterialGroup(int id, Map<String, MaterialGroupComponent> mg) {
}
