package com.shop.shop.models;

import lombok.Getter;
import org.json.simple.JSONObject;
/*
* API를 통해 검색된 결과를 가져올 때 사용하는 DTO
* 검색 결과가 String 으로 들어오기 때문에 화면에 보여주기 위해서는 DTO를 사용해야 한다
*/
@Getter
public class ItemDto {
    private String title;
    private String link;
    private String image;
    private int lprice;

    public ItemDto(JSONObject itemJson) {
        this.title = itemJson.getString("title");
        this.link = itemJson.getString("link");
        this.image = itemJson.getString("image");
        this.lprice = itemJson.getInt("lprice");
    }
}
