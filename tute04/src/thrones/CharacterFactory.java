package thrones;

import java.util.Random;

public class CharacterFactory {
    private Random ran = new Random();

    public King createKing() {
        return new King(ran.nextInt(5), ran.nextInt(5));
    }
    public Queen createQueen() {
        return new Queen(ran.nextInt(5), ran.nextInt(5));
    }
    public Dragon createDragon() {
        return new Dragon(ran.nextInt(5), ran.nextInt(5));
    }
    public Knight createKnight() {
        return new Knight(ran.nextInt(5), ran.nextInt(5));
    }
}
