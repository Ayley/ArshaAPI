package me.kleidukos.arsha.http;

public interface IHttpRequest{

    String request(String link);

    String request(HttpLinkBuilder builder);
}
