package me.kleidukos.arsha;

import com.google.gson.Gson;
import me.kleidukos.arsha.http.IHttpRequest;
import me.kleidukos.arsha.util.IJsonParser;

public class ArshaIO {

    private HttpRequest api;

    private JsonParser parser;

    public ArshaIO(){
        this.api = new HttpRequest();
        this.parser = new JsonParser(new Gson());
    }

    public IHttpRequest getApi() {
        return api;
    }

    public IJsonParser getParser() {
        return parser;
    }
}
