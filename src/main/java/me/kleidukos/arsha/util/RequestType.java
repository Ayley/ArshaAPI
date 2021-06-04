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
    GET_MARKET_PRICE_INFO("GetMarketPriceInfo");

    private String parameterName;

    RequestType(String parameterName){
        this.parameterName = parameterName;
    }

    public String getParameterName() {
        return parameterName;
    }
}
