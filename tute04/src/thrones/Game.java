package thrones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Character> characters = new ArrayList<Character>();
    private static CharacterFactory factory = new CharacterFactory();

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        for (Character character : characters) {
            System.out.print("Move " + character + " to: ");
            String[] line = scanner.nextLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            MoveResult result = character.makeMove(x, y, characters);

            if (result.equals(MoveResult.SUCCESS)) {
                System.out.println("Success! Character is now " + character);
            } else if (result.equals(MoveResult.INVALID)) {
                System.out.println("Invalid move.");
            } else if (result.equals(MoveResult.ATTACK)) {
                System.out.println("Attacked another character.");
            }
        }

        scanner.close();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public static void main(String[] args) {
        // Replace constructors below with factory pattern
        Game game = new Game();
        game.addCharacter(factory.createKing());
        game.addCharacter(factory.createDragon());
        game.addCharacter(factory.createQueen());
        game.play();
    }
}
