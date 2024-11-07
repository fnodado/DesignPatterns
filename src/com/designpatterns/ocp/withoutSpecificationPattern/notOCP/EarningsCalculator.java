package com.designpatterns.ocp.withoutSpecificationPattern.notOCP;

import com.designpatterns.ocp.withoutSpecificationPattern.Video;


public class EarningsCalculator {

    public int getEarnings(Video video){
        return switch(video.getCategory()){
            case ENTERTAINMENT -> calculateEntertainment(video);
            case GAMING -> calculateGaming(video);
            case SPORTS -> calculateSports(video);
        };
    }

    private int calculateSports(Video video) {
        //some algo
        return 3;
    }

    private int calculateGaming(Video video) {
        //some algo
        return 2;
    }

    private int calculateEntertainment(Video video) {
        // some algo
        return 1;
    }


}
