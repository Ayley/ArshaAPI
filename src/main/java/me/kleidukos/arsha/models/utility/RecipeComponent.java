package me.kleidukos.arsha.models.utility;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
record RecipeComponent(int id, int quantity, int materialGroup) {
}
