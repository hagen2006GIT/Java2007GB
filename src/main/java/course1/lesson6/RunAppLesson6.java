package course1.lesson6;

public class RunAppLesson6 {

    public static void main(String[] args) {

        Animal[] zooList = new Animal[4];

        zooList[0] = new Dog ("Sharick");
        zooList[1] = new Cat("Barsik");
        zooList[2] = new Cat("Nastya");
        zooList[3] = new Animal();
        zooList[3].name = "BorisTheAnimal";

        System.out.println();
        System.out.println("количество животных в зоопарке = " + zooList.length);
        System.out.println();
        for (Animal pet : zooList) {
            pet.printName();
        }

        System.out.println();
        System.out.println();
        System.out.println("Побежали.............................");
        for (Animal pet : zooList) {
            pet.doRun(300);
        }

        System.out.println();
        System.out.println();
        System.out.println("Поплыли...............................");
        for (Animal pet : zooList) {
            pet.doSwim(8);
        }
    }
}
