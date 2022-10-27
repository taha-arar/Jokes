package springframework.jokes.service;

import springframework.jokes.entity.Joke;

public interface JokeService {

    Joke getJokeById (Long id);
    Joke saveJoke(Joke joke);
}
