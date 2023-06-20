import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final List<String> attacks = Arrays.asList(":LeafStorm", "SolarBeam", "LeachSeed", "LeaveBlade");
    private static final String type = "Grass";

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a leafstorm!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a solarbeam!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a leech-seed!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " is attacking " + enemy.getName() + " by performing a leaveblade!");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30hp!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20hp!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40hp!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10hp!");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    List<String> getAttacks() {
        return attacks;
    }
}
