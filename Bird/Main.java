package Bird;

public class Main {
    public static void main(String[] args) {
        Movable penguin = new Penguin();
        Movable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        penguin.move();
        ostrich.move();
        sparrow.move();
        sparrow.fly();
        eagle.move();
        eagle.fly();
    }
}
