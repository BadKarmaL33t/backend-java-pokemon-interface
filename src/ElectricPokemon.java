import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");
    private final String type = "electric";

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {

    }

    void electroBall(Pokemon name, Pokemon enemy) {

    }

    void thunder(Pokemon name, Pokemon enemy) {

    }

    void voltTackle(Pokemon name, Pokemon enemy) {

    }

    List<String> getAttacks() {
        return attacks;
    }
}
