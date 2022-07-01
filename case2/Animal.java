package case2;

public class Animal {
    private String name;
    private int weight;

    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
}

class Lion {
    private Animal lion;
    private int food;

    public Lion(String name, int weight, int food){
        this.lion = new Animal(name, weight);
        this.food = food;
    }
}

class Snake {
    private Animal snake;
    private int length;

    public Snake(String name, int weight, int length){
        this.snake = new Animal(name, weight);
        this.length = length;
    }
}

class Monkey {
    private Animal monkey;
    private String favourite;

    public Monkey(String name, int weight, String favourite){
        this.monkey = new Animal(name, weight);
        this.favourite = favourite;
    }
}