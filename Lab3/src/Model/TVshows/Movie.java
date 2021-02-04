package Model.TVshows;

public class Movie extends TVshow {
    private String filmStudio;
    public Movie(String name, String description, float duration, String filmStudio) {
        super(name, description, duration);
        this.filmStudio = filmStudio;
    }

    public String getFilmStudio() {
        return filmStudio;
    }

    public void setFilmStudio(String filmStudio) {
        this.filmStudio = IsCorrectString(filmStudio);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("FilmStudio: %s\n", filmStudio);
    }
}
