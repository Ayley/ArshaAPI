package me.kleidukos.arsha.models.utility;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
record MaterialGroupComponent(String name, int id) {
}
