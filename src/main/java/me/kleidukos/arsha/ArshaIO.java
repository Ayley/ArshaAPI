package me.kleidukos.arsha;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.kleidukos.arsha.http.IHttpRequest;
import me.kleidukos.arsha.util.IJsonParser;

public class ArshaIO {

    private final HttpRequest api;

    private final JsonParser parser;

    public ArshaIO(){
        this.api = new HttpRequest();
        this.parser = new JsonParser(new ObjectMapper());
    }

    public IHttpRequest getApi() {
        return api;
    }

    public IJsonParser getParser() {
        return parser;
    }
}
