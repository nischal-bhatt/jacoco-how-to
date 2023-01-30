package com.dailycodebuffer;

public class PlayingAroundWithJacoco {
    //to test jacoco
    //create a class and a method
    //create a test
    //from the maven, run both clean and test and build it
    // the report will appear under target , site, jacoco and index.html

    public boolean testString(String x)
    {
        if (x.equals("nischal"))
        {
            return true;
        }else{
            return false;
        }
    }
}
