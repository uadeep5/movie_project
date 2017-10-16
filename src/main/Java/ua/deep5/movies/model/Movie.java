package ua.deep5.movies.model;

import ua.deep5.movies.Enum.Country;
import ua.deep5.movies.Enum.Genre;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie extends AbstractModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String trailer;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private String duration;

    @Column(nullable = false, length = 1000)
    private String desription;

    @Column(nullable = true)
    private String kinopoisk;

    @Column(nullable = true)
    private String imdb;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "actor_film",
            joinColumns = {@JoinColumn(name = "movie_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "actor_id", referencedColumnName = "id")})
    private Set<Actor> actors = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "img_id")
    private Image image;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Genre> genres = new HashSet<>();

    @Column(nullable = false)
    private Country country;

    @ManyToOne()
    @JoinColumn(name = "producer_id")
    private Producer producer;


    public Movie() {
    }

    public Movie(String name, int year, String duration, String desription, String kinopoisk, String trailer,
                 String imdb, Image image, Set<Actor> actors, Producer producer, Set<Genre> genres, Country country) {
        this.name = name;
        this.year = year;
        this.duration = duration;
        this.desription = desription;
        this.kinopoisk = kinopoisk;
        this.imdb = imdb;
        this.image = image;
        this.actors = actors;
        this.producer = producer;
        this.genres = genres;
        this.country = country;
        this.trailer = trailer;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public String getKinopoisk() {
        return kinopoisk;
    }

    public void setKinopoisk(String kinopoisk) {
        this.kinopoisk = kinopoisk;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
