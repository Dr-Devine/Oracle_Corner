package com.example.oracle.models;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tarotCards")
public class Tarot implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private int value;

    @Column(name = "meaning")
    private String meaning;

    @Column(name = "suit")
    private String suit;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String URLImage;

    @JsonIgnoreProperties({"tarots"})
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Tarot(String name, int value, String meaning, String suit, String description, String URLImage) {

        this.name = name;
        this.value = value;
        this.meaning = meaning;
        this.suit = suit;
        this.description = description;
        this.URLImage = URLImage;
    }
    public Tarot(){

    }

    public String getURLImage() {
        return URLImage;
    }

    public void setURLImage(String URLImage) {
        this.URLImage = URLImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}