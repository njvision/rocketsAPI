package com.api.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="flickr_images")
public class FlickrImagesJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rocket_id")
    private RocketJpa rocket;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "url_id")
    private ImageUrlJpa url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RocketJpa getRocket() {
        return rocket;
    }

    public void setRocket(RocketJpa rocket) {
        this.rocket = rocket;
    }

    public ImageUrlJpa getUrl() {
        return url;
    }

    public void setUrl(ImageUrlJpa url) {
        this.url = url;
    }
}
