import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");
    private static final String type = "Water";

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a surf!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a hydropump!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a hydrocanon!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a raindance!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    List<String> getAttacks() {
        return attacks;
    }
}
