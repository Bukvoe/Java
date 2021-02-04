package Model.TVshows;

public class Animated extends TVshow {
    private enum AnimationType
    {
        TraditionalAnimation,
        CGI,
        Anime,
        StopMotion
    }
    private AnimationType type;
    public Animated(String name, String description, float duration) {
        super(name, description, duration);
    }
}
