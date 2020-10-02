public class Sheep implements Animal {

    private String name;

    public Sheep(String name) {
        this.name = name;
        System.out.println(name + " is made.");
    }

    public Animal makeCopy() {
        System.out.println(name + " is cloned.");
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    public String toString() {
        return this.name + " is my hero.";
    }
}
