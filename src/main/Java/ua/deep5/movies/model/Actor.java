package ua.deep5.movies.model;

import ua.deep5.movies.Enum.Country;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor extends AbstractModel{
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date birthdayDate;

    @ManyToMany(mappedBy = "actors", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Movie> movies = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "img_id")
    private Image image;

    @Column(nullable = false)
    private Country country;

    public Actor() {
    }

    public Actor(String name, Date birthdayDate, Image image, Country country) {
        this.name = name;
        this.birthdayDate = birthdayDate;
        this.image = image;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public boolean addMovie(Movie movie){
        if (!movies.contains(movie)){
            movies.add(movie);
            return true;
        }
        return false;
    }
}
