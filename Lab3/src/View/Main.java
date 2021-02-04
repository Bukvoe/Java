package View;

import Controller.TVshowsController;
import Model.TVshows.Movie;
import Model.TVshows.TVshow;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try
        {
            TVshowsController tvShows = new TVshowsController();
            tvShows.getShows().add(new Movie("someMovie", "123", 40.0f, "13"));
            tvShows.getShows().add(new Movie("someMovie", "123", 40.0f, "13"));
            tvShows.getShows().add(new Movie("someMovie", "123", 40.0f, "13"));
            tvShows.getShows().add(new Movie("", "123", 40.0f, "13"));
            System.out.println(tvShows.toString());
        }
        catch (Exception e)
        {
            System.err.println(e);
        }

    }
}
