package springframework.jokes.Repositiry;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import springframework.jokes.entity.Joke;

public interface JokeRepository extends CrudRepository<Joke, Long> {

    @Query("select j from Joke j where j.id = :X ")
    public Joke getJokeByID(@Param(value = "X") Long id);
}
