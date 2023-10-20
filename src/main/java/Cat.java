public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; // сытость кота
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public boolean isSatiety() {
        return satiety;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate plate) {
        if (appetite <= plate.getFood() && ! satiety) {
            satiety = true;
            plate.setFood(plate.getFood() - appetite);
            System.out.printf("Котик %s поел и довольный лег спать\n", name);
        } else if (appetite > plate.getFood() && ! satiety){
            System.out.printf("Котику %s мало еды в тарелке, он остался голодным\n", name);
        } else {
            System.out.printf("Котик %s не голодный\n", name);
        }
    }
}
