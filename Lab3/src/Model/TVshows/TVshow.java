package Model.TVshows;

import Exceptions.ICustomException;

public abstract class TVshow implements ICustomException
{
    private String name;
    private String description;
    private float duration;

    public TVshow(String name, String description, float duration) {
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = IsCorrectString(name);;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = IsCorrectString(description);;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = IsNegativeFloatNumber(duration);
    }

    @Override
    public String toString() {
        return String.format("TV show: %s\nDuration: %sm\nDescription %s\n", name, duration, description);
    }
}
