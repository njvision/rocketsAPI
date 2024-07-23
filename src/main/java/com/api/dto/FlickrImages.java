package com.api.dto;

import com.api.entity.SxImageUrl;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FlickrImages {

    private List<ImageUrl> url;
}
