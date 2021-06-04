package me.kleidukos.arsha.util;

public interface IJsonParser {

    public <T> T parseFromJson(String response, Class<T> type);

}
