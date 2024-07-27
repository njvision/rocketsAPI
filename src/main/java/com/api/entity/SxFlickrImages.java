package com.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class SxFlickrImages {

    private List<SxImageUrl> urlList;

    public List<SxImageUrl> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<SxImageUrl> urlList) {
        this.urlList = urlList;
    }
}
