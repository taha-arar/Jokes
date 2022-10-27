package springframework.jokes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springframework.jokes.Repositiry.JokeRepository;
import springframework.jokes.entity.Joke;

@Service
public class JokeServiceImpl implements JokeService {

    private final JokeRepository jokeRepository;

    public JokeServiceImpl(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @Override
    public Joke getJokeById(Long id) {
        return jokeRepository.getJokeByID(id);
    }

    @Override
    public Joke saveJoke(Joke joke) {
        return jokeRepository.save(joke);
    }
}
