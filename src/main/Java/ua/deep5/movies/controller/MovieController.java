package ua.deep5.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.deep5.movies.Enum.Country;
import ua.deep5.movies.Enum.Genre;
import ua.deep5.movies.model.*;
import ua.deep5.movies.service.ActorService;
import ua.deep5.movies.service.MovieService;
import ua.deep5.movies.service.ProducerService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private ActorService actorService;

    @Autowired
    private ProducerService producerService;


    @RequestMapping("/")
    public String index(Model model){
        List<Movie> allMovie = movieService.getAll();
        model.addAttribute("all", allMovie);
        return "index";
    }

    @RequestMapping("/movie/{id}")
    public String toMovie(@PathVariable(value = "id") long id, Model model){
        model.addAttribute("movie", movieService.get(id));
        model.addAttribute("all", movieService.getAll());
        return "movie_page";
    }

    @RequestMapping("/add_movie")
    public String addMoviePage(Model model){
        model.addAttribute("actors", actorService.getAll());
        model.addAttribute("producers", producerService.getAll());
        model.addAttribute("genres", Genre.values());
        model.addAttribute("counrys", Country.values());
        return "add_movie";
    }

    @RequestMapping(value = "/movie/add", method = RequestMethod.POST)
    public String addMovie(@RequestParam String name, @RequestParam int year,
                           @RequestParam String duration, @RequestParam String description,
                           @RequestParam String kinopoisk, @RequestParam String imdb,
                           @RequestParam String[] actorList, @RequestParam String[] genreList,
                           @RequestParam String producer, @RequestParam String country,
                           @RequestParam String trailer, @RequestParam MultipartFile image){
        try {
            Image img = new Image(image.getBytes());
            Set<Actor> actors = new HashSet<>();
            Set<Genre> genres = new HashSet<>();
            for (int i=0; i<actorList.length; i++) actors.add(actorService.get(Long.valueOf(actorList[i])));
            for (int i=0; i<genreList.length; i++) genres.add(Genre.valueOf(genreList[i]));

            Country c = Country.valueOf(country);
            Producer prod = producerService.get(Long.valueOf(producer));
            trailer = trailer.substring(trailer.indexOf('=')+1);

            Movie movie = new Movie(name, year, duration, description, kinopoisk, trailer, imdb, img, actors, prod, genres, c);
            movieService.addMovie(movie);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
