package Model.TVshows;

public class News extends TVshow {
    private String country;

    public News(String name, String description, float duration) {
        super(name, description, duration);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country =  IsCorrectString(country);
    }
}
