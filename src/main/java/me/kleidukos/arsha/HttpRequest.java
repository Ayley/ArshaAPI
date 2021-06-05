package me.kleidukos.arsha;

import me.kleidukos.arsha.http.HttpLinkBuilder;
import me.kleidukos.arsha.http.IHttpRequest;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.stream.Collectors;

 final class HttpRequest implements IHttpRequest {

    public String request(String link) {
        try (CloseableHttpClient client = HttpClients.createDefault()){
            HttpGet get = new HttpGet(link);
            try (CloseableHttpResponse response = client.execute(get)){
                HttpEntity entity = response.getEntity();

                String result = new BufferedReader(new InputStreamReader(entity.getContent())).lines().collect(Collectors.joining("\n"));

                EntityUtils.consume(entity);

                return result;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            throw new URISyntaxException(link, "Wrong Url!");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String request(HttpLinkBuilder builder) {
        String link = builder.build();

        try (CloseableHttpClient client = HttpClients.createDefault()){
            HttpGet get = new HttpGet(link);
            try (CloseableHttpResponse response = client.execute(get)){
                HttpEntity entity = response.getEntity();

                String result = new BufferedReader(new InputStreamReader(entity.getContent())).lines().collect(Collectors.joining("\n"));

                EntityUtils.consume(entity);

                return result;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            throw new URISyntaxException(link, "Wrong Url!");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

}
