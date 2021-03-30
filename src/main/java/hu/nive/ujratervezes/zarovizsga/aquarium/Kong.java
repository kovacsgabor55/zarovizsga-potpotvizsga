package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong implements Fish {
    private final String name;
    private int weight;
    private final String color;

    public Kong(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }

    @Override
    public String status() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + hasMemoryLoss();
    }

    @Override
    public void feed() {
        weight += 2;
    }
}
