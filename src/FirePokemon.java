import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final List<String> attacks = Arrays.asList("FireLash", "FlameThrower", "PyroBall", "Inferno");
    private static final String type = "fire";

//    Uitleg:
//    Adding the "static" keyword to the attacks and type variables in the FirePokemon class resolves the error,
//    because it makes them class-level variables instead of instance-level variables.
//    The error occurred because the super constructor call in FirePokemon was trying to pass the type variable
//    to the Pokemon constructor before the superclass constructor had a chance to initialize it.
//    By making attacks and type static, they are associated with the class itself rather than individual instances of the class.
//    As static variables are initialized when the class is loaded, they can be accessed before any constructor is called.
//    Therefore, using the static keyword ensures that the values of attacks and type are available
//    when the super constructor is invoked, resolving the error.

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
