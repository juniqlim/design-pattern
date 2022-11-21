package Maze.abstractfactory.onlycomposition;

import java.util.Arrays;

class MazeGame {
    Maze createMaze(String type) {
        if ("CommonMaze".equals(type)) {
            return new Maze(Arrays.asList(
                new CommonRoom(new Wall(), new CommonDoor(1, 2), new Wall(), new Wall()),
                new CommonRoom(new Wall(), new Wall(), new Wall(), new CommonDoor(1, 2))));
        }
        if ("EnchantedMaze".equals(type)) {
            return new Maze(Arrays.asList(
                new EnchantedRoom(new Wall(), new DoorNeedingSpell(1, 2), new Wall(), new Wall(), new Spell()),
                new EnchantedRoom(new Wall(), new Wall(), new Wall(), new DoorNeedingSpell(1, 2), new Spell())));
        }
        throw new IllegalArgumentException("Unknown type: " + type);
    }

    public static void main(String[] args) {
        MazeGame game = new MazeGame();
        Maze maze = game.createMaze("EnchantedMaze");
    }
}
