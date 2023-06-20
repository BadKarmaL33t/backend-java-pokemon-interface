import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String name;
    private String town;
    private List<Pokemon> pokemons = new ArrayList<>();

    private final FirePokemon charizard = new FirePokemon("Charrizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");
    private final WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 110, "Pokeflakes", "Blaaaaasssssstooooiiiiissss");
    private final GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "Pokeleafs", "Veeeeeeeeennnnnuuuuuusaur");
    private final GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "Everything", "Dittto diiiito ");
    private final ElectricPokemon raichu = new ElectricPokemon("Raichu", 80, 160, "Pokebrocks", "Raaaaiiiiicccchhhhuuuuuuu!!!!");
    private final WaterPokemon gyarados = new WaterPokemon("Gyarados", 90, 180, "Pokeflakes", "Gyaaaaaaaaarrrraaaadoooos");


    public PokemonTrainer(String name, String town) {
        this.name = name;
        this.town = town;
    }

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }
}
