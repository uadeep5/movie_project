package ua.deep5.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.deep5.movies.Enum.Country;
import ua.deep5.movies.model.Image;
import ua.deep5.movies.model.Producer;
import ua.deep5.movies.service.ProducerService;

import java.io.IOException;
import java.util.Date;

@Controller
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @RequestMapping("/producer/{id}")
    public String toMovie(@PathVariable(value = "id") long id, Model model){
        model.addAttribute("producer", producerService.get(id));
        return "producer_page";
    }

    @RequestMapping("/add_producer")
    public String addPage(Model model){
        model.addAttribute("counrys", Country.values());
        return "add_producer";
    }

    @RequestMapping("/producer/add")
    public String add(@RequestParam String name, @ModelAttribute Date birthdayDate,
                      @RequestParam MultipartFile image, @RequestParam String country){
        try {
            Image img = new Image(image.getBytes());
            Country c = Country.valueOf(country);
            Producer producer = new Producer(name, birthdayDate, img, c);
            producerService.add(producer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
