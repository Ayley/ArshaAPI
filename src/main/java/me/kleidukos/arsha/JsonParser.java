package me.kleidukos.arsha;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.kleidukos.arsha.util.IJsonParser;

import java.io.IOException;

class JsonParser implements IJsonParser {

    private final ObjectMapper mapper;

    public JsonParser(ObjectMapper mapper){
        this.mapper = mapper;
    }

    public final <T> T parseFromJson(String response, Class<T> type){
        try {
            return mapper.readValue(response, type);
        } catch (IOException e) {
            return null;
        }
    }
}
