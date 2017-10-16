package ua.deep5.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.deep5.movies.Enum.Country;
import ua.deep5.movies.model.Actor;
import ua.deep5.movies.model.Image;
import ua.deep5.movies.model.Movie;
import ua.deep5.movies.service.ActorService;
import ua.deep5.movies.service.MovieService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ActorController {
    @Autowired
    private ActorService actorService;

    @RequestMapping("/actor/{id}")
    public String toMovie(@PathVariable(value = "id") long id, Model model){
        model.addAttribute("actor", actorService.get(id));
        return "actor_page";
    }

    @RequestMapping("/add_actor")
    public String addActorPage(Model model){
        model.addAttribute("counrys", Country.values());
        return "add_actor";
    }

    @RequestMapping(value = "/actor/add", method = RequestMethod.POST)
    public String addActor(@RequestParam MultipartFile image, @RequestParam String name,
                           @ModelAttribute Date birthdayDate, @RequestParam String country){
        try {
            Image img = new Image(image.getBytes());
            Country c = Country.valueOf(country);
            Actor actor = new Actor(name, birthdayDate, img, c);
            actorService.addActor(actor);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
