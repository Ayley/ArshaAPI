package me.kleidukos.arsha;

import me.kleidukos.arsha.http.GetHttpLinkBuilder;
import me.kleidukos.arsha.http.IHttpRequest;
import me.kleidukos.arsha.http.PostHttpLink;
import me.kleidukos.arsha.http.PostHttpLinkBuilder;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

final class HttpRequest implements IHttpRequest {

    @Override
    public String getRequest(String link) {
        try (CloseableHttpClient client = HttpClients.createDefault()){
            HttpGet get = new HttpGet(link);
            try (CloseableHttpResponse response = client.execute(get)){
                HttpEntity entity = response.getEntity();

                String result = EntityUtils.toString(entity, "UTF-8");

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

    @Override
    public String getRequest(GetHttpLinkBuilder builder) {
        String link = builder.build();

        try (CloseableHttpClient client = HttpClients.createDefault()){
            HttpGet get = new HttpGet(link);
            try (CloseableHttpResponse response = client.execute(get)){
                HttpEntity entity = response.getEntity();

                String result = EntityUtils.toString(entity, "UTF-8");

                EntityUtils.consume(entity);

                return URLDecoder.decode(result, StandardCharsets.UTF_8);
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

    @Override
    public String postRequest(PostHttpLinkBuilder builder) {
        PostHttpLink post = builder.build();

        try (CloseableHttpClient client = HttpClients.createDefault()){
            HttpPost httpPost = new HttpPost(post.link());

            if(post.id()[0] >= 0){
                StringBuilder ids = new StringBuilder(String.valueOf(post.id()[0]));
                for (int i : post.id()){
                    if(i >= 0 && !ids.toString().contains(String.valueOf(i))){
                        ids.append(",").append(i);
                    }
                }
                httpPost.addHeader("id", ids.toString());
            }

            if(post.sid() >= 0){
                httpPost.addHeader("sid", String.valueOf(post.sid()));
            }

            if(post.mainCategory() >= 0){
                httpPost.addHeader("mainCategory", String.valueOf(post.mainCategory()));
            }

            if(post.subCategory() >= 0){
                httpPost.addHeader("subCategory", String.valueOf(post.subCategory()));
            }

            httpPost.addHeader("lang", post.language().name().toLowerCase());

            try (CloseableHttpResponse response = client.execute(httpPost)){
                HttpEntity entity = response.getEntity();

                String result = EntityUtils.toString(entity, "UTF-8");

                EntityUtils.consume(entity);

                return URLDecoder.decode(result, StandardCharsets.UTF_8);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            throw new URISyntaxException(post.link(), "Wrong Url!");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String postRequest(PostHttpLink post) {
        try (CloseableHttpClient client = HttpClients.createDefault()){
            HttpPost httpPost = new HttpPost(post.link());

            if(post.id()[0] >= 0){
                StringBuilder ids = new StringBuilder(String.valueOf(post.id()[0]));
                for (int i : post.id()){
                    if(i >= 0 && !ids.toString().contains(String.valueOf(i))){
                        ids.append(",").append(i);
                    }
                }
                httpPost.addHeader("id", ids.toString());
            }

            if(post.sid() >= 0){
                httpPost.addHeader("sid", String.valueOf(post.sid()));
            }

            if(post.mainCategory() >= 0){
                httpPost.addHeader("mainCategory", String.valueOf(post.mainCategory()));
            }

            if(post.subCategory() >= 0){
                httpPost.addHeader("subCategory", String.valueOf(post.subCategory()));
            }

            httpPost.addHeader("lang", post.language().name().toLowerCase());

            try (CloseableHttpResponse response = client.execute(httpPost)){
                HttpEntity entity = response.getEntity();

                String result = EntityUtils.toString(entity, "UTF-8");

                EntityUtils.consume(entity);

                return URLDecoder.decode(result, StandardCharsets.UTF_8);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            throw new URISyntaxException(post.link(), "Wrong Url!");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

}
