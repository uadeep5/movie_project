package ua.deep5.movies.model;


import ua.deep5.movies.Enum.Country;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "producers")
public class Producer extends AbstractModel {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date birthdayDate;

    @OneToMany(mappedBy = "producer", fetch = FetchType.EAGER)
    private Set<Movie> movies = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "img_id")
    private Image image;

    @Column(nullable = false)
    private Country country;

    public Producer() {
    }

    public Producer(String name, Date birthdayDate, Image image, Country country) {
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

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
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
}
