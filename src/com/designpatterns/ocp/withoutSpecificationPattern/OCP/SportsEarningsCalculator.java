package com.designpatterns.ocp.withoutSpecificationPattern.OCP;

import com.designpatterns.ocp.withoutSpecificationPattern.Video;

public class SportsEarningsCalculator implements IEarningsCalculator {
    @Override
    public double calculateEarning(Video video) {
        //some algo
        return 4.0;
    }
}
