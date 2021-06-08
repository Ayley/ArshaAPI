package me.kleidukos.arsha.http;

import me.kleidukos.arsha.util.Language;

public record PostHttpLink(String link, Language language, int[] id, int sid, int mainCategory, int subCategory) {
}
