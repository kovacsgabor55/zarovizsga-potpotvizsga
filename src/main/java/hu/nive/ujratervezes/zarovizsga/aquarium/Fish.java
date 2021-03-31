package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {
    private final String name;
    private int weight;
    private final String color;
    private final boolean shortThereMemory;

    public Fish(String name, int weight, String color, boolean shortThereMemory) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.shortThereMemory = shortThereMemory;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void increaseWeight(int amount) {
        weight += amount;
    }

    public boolean hasMemoryLoss() {
        return shortThereMemory;
    }

    public String status() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + hasMemoryLoss();
    }

    public abstract void feed();
}
