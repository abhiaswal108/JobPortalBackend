package com.aa.jobportal.entity;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection="JobPost")
public class Post {
    private String profile;
    private String description;
    private int exp;
    private String tech[];
    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", description='" + description + '\'' +
                ", exp=" + exp +
                ", tech=" + Arrays.toString(tech) +
                '}';
    }

    public Post() {
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setTech(String [] tech) {
        this.tech = tech;
    }



    public String getProfile() {
        return profile;
    }

    public String getDescription() {
        return description;
    }

    public int getExp() {
        return exp;
    }

    public String [] getTech() {
        return tech;
    }
}
