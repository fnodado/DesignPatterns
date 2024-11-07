package com.designpatterns.ocp.withoutSpecificationPattern;

public class Video {



    private Category category;

    public enum Category{
        SPORTS, ENTERTAINMENT, GAMING, EDUCATIONAL
    }

    public Category getCategory() {
        return category;
    }

}
