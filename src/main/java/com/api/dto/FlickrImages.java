package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class FlickrImages {

    private List<ImageUrl> urlList;

    public List<ImageUrl> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<ImageUrl> urlList) {
        this.urlList = urlList;
    }
}
