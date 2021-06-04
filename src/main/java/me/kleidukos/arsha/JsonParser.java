package me.kleidukos.arsha;

import com.google.gson.Gson;
import me.kleidukos.arsha.util.IJsonParser;

class JsonParser implements IJsonParser {

    private Gson gson;

    public JsonParser(Gson gson){
        this.gson = gson;
    }

    public <T> T parseFromJson(String response, Class<T> type){
        return gson.fromJson(response, type);
    }

}
