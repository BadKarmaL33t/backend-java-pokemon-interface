import java.util.Arrays;
import java.util.List;

abstract class Pokemon {

    private final int level;
    private int hp;

    private final String type;
    private final String name;
    private final String food;
    private final String sound;

    public Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }
}
