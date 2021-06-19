package me.kleidukos.arsha.models.utility;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record RecipeComponent(int id, int quantity, int materialGroup) {
}
