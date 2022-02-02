package course1.lesson7;

public class Cat extends Animal {


    final int maxRun = 200; //максимальная дистанция бега
    final int maxSwim = 0; //максимальная дистанция плавания (кот плавать не умеет)
    boolean satiety; //сытость котика

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean getRefill(EatPlate plate, int sizeEatPortion) {
        boolean refillResult;
        refillResult = plate.refill(sizeEatPortion);
        return refillResult;
    }


    public Cat(String name,boolean satiety) {
        this.name = name;
        this.satiety=satiety;
    }
}
