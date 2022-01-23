package course1.lesson6;

public class Cat extends Animal {

    final int maxRun = 200; //максимальная дистанция бега
    final int maxSwim = 0; //максимальная дистанция плавания (кот плавать не умеет)

    public Cat(String name) {
        this.name = name;
    }
}
