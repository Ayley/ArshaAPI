package me.kleidukos.arsha.models.utility;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record Item(int id, String name, int grade, String icon) {
}
