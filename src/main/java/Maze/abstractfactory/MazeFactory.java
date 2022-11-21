package Maze.abstractfactory;

class MazeFactory {
    Maze MakeMaze() { return new Maze(); }
    Wall MakeWall() { return new Wall(); }
    Room MakeRoom(int n) { return new Room(n); }
    Door MakeDoor(Room r1, Room r2) { return new Door(r1, r2) ; }

    Maze makeMaze() {
        return null;
    }

    Room makeRoom(int i) {
        return null;
    }

    Door makeDoor(Room r1, Room r2) {
        return null;
    }

    Object makeWall() {
        return null;
    }
}
