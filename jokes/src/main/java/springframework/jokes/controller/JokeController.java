package springframework.jokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.jokes.entity.Joke;
import springframework.jokes.service.JokeService;
import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getRandomJoke(Model model){

        Joke joke1 = new Joke("This joke N° 1");
        Joke joke2 = new Joke("This joke N° 2");
        Joke joke3 = new Joke("This joke N° 3");

        jokeService.saveJoke(joke1);
        jokeService.saveJoke(joke2);
        jokeService.saveJoke(joke3);


        Random r = new Random();
        Long x = Long.valueOf(r.nextInt(4));
        model.addAttribute("joke",jokeService.getJokeById(x));


        return "joke";
    }
}
