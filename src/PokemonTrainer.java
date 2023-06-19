import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String name;
    private String town;
    private List<Pokemon> pokemons = new ArrayList<>();

    public PokemonTrainer(String name) {
        super();
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
