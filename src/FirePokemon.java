import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("FireLash", "FlameThrower", "PyroBall", "Inferno");
    private final String type = "fire";

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void fireLash(Pokemon name, Pokemon enemy) {

    }

    void flameThrower(Pokemon name, Pokemon enemy) {

    }

    void pyroBall(Pokemon name, Pokemon enemy) {

    }

    void inferno(Pokemon name, Pokemon enemy) {

    }

    List<String> getAttacks() {
        return attacks;
    }
}
