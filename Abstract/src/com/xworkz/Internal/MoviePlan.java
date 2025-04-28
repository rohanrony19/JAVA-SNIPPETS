package com.xworkz.Internal;

import com.xworkz.External.Movie;

public class MoviePlan extends Movie {
    public MoviePlan() {
    }

    public void plan() {
        super.plan();
        System.out.println("plan For The Day:");
    }
}
