package Model.TVshows;

public class TVseries extends TVshow {
    private int season;
    private int episode;

    public TVseries(String name, String description, float duration, int season, int episode) {
        super(name, description, duration);
        this.season = season;
        this.episode = episode;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = IsNegativeIntNumber(episode);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = IsNegativeIntNumber(season);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Season: %s\nEpisode: %sm\n", season, episode);
    }
}
