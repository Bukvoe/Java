package Controller;

import Model.TVshows.TVshow;

import java.util.ArrayList;

public class TVshowsController {
    private ArrayList<TVshow> shows;

    public ArrayList<TVshow> getShows() {
        return shows;
    }

    public TVshowsController() {
        this.shows = new ArrayList<TVshow>();
    }
    public TVshowsController(ArrayList<TVshow> shows) {
        this.shows = shows;
    }

    public void setShows(ArrayList<TVshow> shows) {
        this.shows = shows;
    }
    public void Add(TVshow show)
    {
        shows.add(show);
    }
    public void Delete(int index)
    {
        if(index < shows.size() && index >= 0)
        {
            shows.remove(index);
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    @Override
    public String toString() {
        String collection = "";
        for (TVshow show : shows) {
            collection += show.toString() + "\n";
        }
        return collection;
    }
}
