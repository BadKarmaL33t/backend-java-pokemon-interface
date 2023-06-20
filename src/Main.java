import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Deze 4 constanten worden gebruikt om tekst met kleur te printen in de console.
    // Hier hoef je niks mee te doen
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    // Dit zijn de Pokemons die je tot je beschikking hebt


    // Los in de main methode alle foutmeldigen op door (abstracte) klassen met variabelen en methoden te maken (en soms een import).
    // In de main methode en de Main klasse hoef je niks te veranderen.
    public static void main(String[] args) {
        Scanner speler_A = new Scanner(System.in);
        PokemonGymImpl pokemonGym = new PokemonGymImpl();
        System.out.println("First player please enter your name: ");
        String userA = speler_A.nextLine();
        PokemonTrainer player1 = new PokemonTrainer(userA);
        // instantieren van de pokemons verplaatst naar de pokemontrainer,
        // omdat zowel de gymowner als je player (ook een PokemonTrainer) hiervan gebruik moeten maken.
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(player1.getBlastoise());
        pokemons.add(player1.getDitto());
        pokemons.add(player1.getCharizard());
        pokemons.add(player1.getRaichu());
        pokemons.add(player1.getGyarados());
        pokemons.add(player1.getVenusaur());
        player1.setPokemons(pokemons);
        System.out.println("To start your game, we have given you 6 Pokemons use");
        System.out.println("these are the Pokemons you get:");
        pokemonGym.printPokemon(pokemons);
        System.out.println("Would you like to enter a gym looking for a fight?");
        System.out.println("Please enter yes or no");
        if (speler_A.nextLine().equals("yes")) {
            pokemonGym.enteredTheGym(player1);
        }
    }
}
