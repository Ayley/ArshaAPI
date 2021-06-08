package me.kleidukos.arsha.http;

import java.io.IOException;

public interface IHttpRequest{

    String getRequest(String link);

    String getRequest(GetHttpLinkBuilder builder);

    String postRequest(PostHttpLinkBuilder builder);

    String postRequest(PostHttpLink builder);
}
