package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Movie;

public class FilmIndustry {
    private Movie movie;

    public FilmIndustry(Movie movie) {
        this.movie = movie;
        System.out.println("Assigning Movie instance ");
    }

    public void direction() {
        if (this.movie != null) {
            this.movie.shooting();
            System.out.println("Running direction in ");
        } else {
            System.out.println("Null");
        }
    }
}