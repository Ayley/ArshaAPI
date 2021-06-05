package me.kleidukos.arsha.util;

public interface IJsonParser {

    <T> T parseFromJson(String response, Class<T> type);

}
