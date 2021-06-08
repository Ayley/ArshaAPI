package me.kleidukos.arsha.http;

import me.kleidukos.arsha.util.Api;
import me.kleidukos.arsha.util.Language;
import me.kleidukos.arsha.util.Region;
import me.kleidukos.arsha.util.RequestType;

public class GetHttpLinkBuilder {

    private String link;
    private int id = -1;
    private int sid = -1;
    private int mainCategory = -1;
    private int subCategory = -1;
    private Language language;

    public GetHttpLinkBuilder(Api version, Region region, RequestType type){
        link = createBaseLink(version, region, type);
    }

    public GetHttpLinkBuilder(Api version, RequestType type){
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

    public GetHttpLinkBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public GetHttpLinkBuilder setSid(int sid) {
        this.sid = sid;
        return this;
    }

    public GetHttpLinkBuilder setMainCategory(int mainCategory) {
        this.mainCategory = mainCategory;
        return this;
    }

    public GetHttpLinkBuilder setSubCategory(int subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    public GetHttpLinkBuilder setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public String build(){
        if(link.contains("GetWorldMarketHotList")){
            return link;
        }

        if(language != null){
            link += addValue(language.name().toLowerCase(), "lang");
        }

        if(id > -1){
            link += addValue(String.valueOf(id), "id");
        }

        if(sid > -1){
            link += addValue(String.valueOf(sid), "sid");
        }

        if(mainCategory > -1){
            link += addValue(String.valueOf(mainCategory), "mainCategory");
        }

        if(subCategory > -1){
            link += addValue(String.valueOf(subCategory), "subCategory");
        }

        return link;
    }

    private String addValue(String value, String prefix){
        if(value == null){
            return null;
        }

        if(!link.contains("?")){
            return "?" + prefix + "=" + value;
        }

        return "&" + prefix + "=" + value;
    }
}
