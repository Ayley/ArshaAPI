package me.kleidukos.arsha.models.v2;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
record Order (long price, int buyers, int sellers){ }
