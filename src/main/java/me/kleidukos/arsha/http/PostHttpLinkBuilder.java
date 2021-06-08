package me.kleidukos.arsha.http;

import me.kleidukos.arsha.util.Api;
import me.kleidukos.arsha.util.Language;
import me.kleidukos.arsha.util.Region;
import me.kleidukos.arsha.util.RequestType;

public class PostHttpLinkBuilder {

    private String link;
    private int[] id = {-1};
    private int sid = -1;
    private int mainCategory = -1;
    private int subCategory = -1;
    private Language language = Language.DE;

    public PostHttpLinkBuilder(Api version, Region region, RequestType type){
        link = createBaseLink(version, region, type);
    }

    public PostHttpLinkBuilder(Api version, RequestType type){
        link = createBaseLink(version, type);
    }

    private String createBaseLink(Api version, Region region, RequestType type){
        String v = version.name().toLowerCase();
        String rg = region.name().toLowerCase();
        String t = type.getParameterName();

        return "https://api.arsha.io/" + v + "/" + rg + "/" + t;
    }

    private String createBaseLink(Api version, RequestType type){
        String v = version.name().toLowerCase();
        String t = type.getParameterName();

        return "https://api.arsha.io/" + v + "/" + t;
    }

    public PostHttpLinkBuilder setId(int... id) {
        this.id = id;
        return this;
    }

    public PostHttpLinkBuilder setSid(int sid) {
        this.sid = sid;
        return this;
    }

    public PostHttpLinkBuilder setMainCategory(int mainCategory) {
        this.mainCategory = mainCategory;
        return this;
    }

    public PostHttpLinkBuilder setSubCategory(int subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    public PostHttpLinkBuilder setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public PostHttpLink build(){
        return new PostHttpLink(link, language, id, sid, mainCategory, subCategory);
    }
}
