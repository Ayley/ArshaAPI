package me.kleidukos.arsha;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.kleidukos.arsha.util.IJsonParser;

import java.io.IOException;

record JsonParser(ObjectMapper mapper) implements IJsonParser {

    public final <T> T parseFromJson(String response, Class<T> type) {
        try {
            return mapper.readValue(response, type);
        } catch (IOException e) {
            return null;
        }
    }
}
