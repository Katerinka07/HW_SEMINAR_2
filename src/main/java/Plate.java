public class Plate {
    private int food;
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public Plate(int food) {
        this.food = food;
    }
    public void addFood (int food) {
        this.food += food;
        System.out.printf("В тарелку положли %d вкусняшек\n", food);
    }
    public void info() {
        System.out.println("В тарелке стало: " + food + " вкусняшек");
    }
}
