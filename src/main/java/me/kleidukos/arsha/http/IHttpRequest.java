package me.kleidukos.arsha.http;

public interface IHttpRequest{

    public String request(String link);

    public String request(HttpLinkBuilder builder);
}
