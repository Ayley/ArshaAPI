package me.kleidukos.arsha.models.utility;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize
public record Recipe(int id, String name, String lifeskill, String level, String exp, List<RecipeComponent> components, List<RecipeProduct> products) {
}
