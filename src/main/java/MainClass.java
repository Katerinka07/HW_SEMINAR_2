public class MainClass {
    public static void main(String[] args) {

        Cat kitty = new Cat("Барсик", 30);

        Plate plate = new Plate(100);

        kitty.eat(plate);
        plate.info();
        kitty.eat(plate);
        System.out.println("-".repeat(15));

        Cat[]cats = {
            new Cat("Пушок", 25),
            new Cat("Мишель", 10),
            new Cat("Машка", 15),
            new Cat("Маркиз", 20),
            new Cat("Уля", 17),
            new Cat("Черныш", 25),
            new Cat("Бася", 20)
        };

        for (Cat cat: cats) {
            cat.eat(plate);
        }
        plate.info();
        System.out.println("-".repeat(15));
        plate.addFood(70);
        plate.info();

        for (Cat cat: cats) {
            cat.eat(plate);
        }
        plate.info();

    }
}
