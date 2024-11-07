package com.designpatterns.ocp.withoutSpecificationPattern.OCP;

import com.designpatterns.ocp.withoutSpecificationPattern.Video;

public class GamingEarningsCalculator implements IEarningsCalculator {
    @Override
    public double calculateEarning(Video video) {
        //some algo
        return 3.0;
    }
}