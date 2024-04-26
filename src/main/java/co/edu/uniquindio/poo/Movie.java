package co.edu.uniquindio.poo;

public class Movie {
    private String name;
    private String director;
    private float rating;

    public Movie(String name, String director, float rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public String getDirector() {
        return director;
    }
    public float getRating() {
        return rating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    
}

