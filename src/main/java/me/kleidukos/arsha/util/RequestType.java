package me.kleidukos.arsha.util;

public enum RequestType {

    ITEM("item"),
    HISTORY("history"),
    ORDERS("orders"),
    PRICE("price"),
    GET_WORLD_MARKET_HOT_LIST("GetWorldMarketHotList"),
    GET_WORLD_MARKET_LIST("GetWorldMarketList"),
    GET_WORLD_MARKET_SUB_LIST("GetWorldMarketSubList"),
    GET_WORLD_MARKET_SEARCH_LIST("GetWorldMarketSearchList"),
    GET_BIDDING_INFO_LIST("GetBiddingInfoList"),
    GET_MARKET_PRICE_INFO("GetMarketPriceInfo"),
    ITEM_DATABASE("db"),
    ITEM_DATABASE_DUMP("db/dump"),
    RECIPE_MATERIAL_GROUPS("db/recipes/matgroups"),
    RECIPE_MATERIAL_GROUPS_DUMP("db/recipes/matgroups/dump"),
    RECIPE_DATABASE("db/recipes"),
    RECIPE_DATABASE_DUMP("db/recipes/dump"),
    MRECIPE_MATERIAL_GROUPS("db/mrecipes/matgroups"),
    MRECIPE_MATERIAL_GROUPS_DUMP("db/mrecipes/matgroups/dump"),
    MRECIPE_DATABASE("db/mrecipes"),
    MRECIPE_DATABASE_DUMP("db/mrecipes/dump");




    private final String parameterName;

    RequestType(String parameterName){
        this.parameterName = parameterName;
    }

    public String getParameterName() {
        return parameterName;
    }
}
