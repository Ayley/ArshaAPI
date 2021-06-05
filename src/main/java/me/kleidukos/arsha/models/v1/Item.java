package me.kleidukos.arsha.models.v1;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record Item(int resultCode, String resultMsg) {}
