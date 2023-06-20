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

    // Switch statement binnen de attack methoden, omdat dit sneller is en uiteindelijk te realiseren is met de minste code.
    // Het ziet er overzichtelijk uit, wat de leesbaarheid bevordert.
    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a firelash!");
        switch (enemy.getType()) {
            // -> gebruikt voor enhanced switch. Anders overal een "break;" nodig.
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a flamethrower!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a pyroball!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing an inferno!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    List<String> getAttacks() {
        return attacks;
    }
}
