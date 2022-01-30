package course1.lesson7;
import java.util.Random;

public class RunAppLesson7 {

    public static void main(String[] args) {

        Random var1 = new Random();
        Animal[] catList = new Animal[2];
        Cat tmpCat;
        EatPlate plate = new EatPlate(15, "Общая тарелка");


        printPartInfo("исходные данные...");

        catList[0] = new Cat("Barsik",false);
        catList[1] = new Cat("Nastya",false);

        printPartInfo("количество котов = " + catList.length);
        for (Animal pet : catList) {
            pet.printName();
        }
        plate.info();

        printPartInfo("ЗАВТРАК...");
        for (Animal pet : catList) {
            tmpCat = ((Cat) pet);
            tmpCat.setSatiety(tmpCat.getRefill(plate, 10 + var1.nextInt(10)));
            pet.printName();
        }
        plate.info();

        printPartInfo("ОБЕД...");
        for (Animal pet : catList) {
            tmpCat = ((Cat) pet);
            tmpCat.setSatiety(tmpCat.getRefill(plate, 10 + var1.nextInt(10)));
            pet.printName();
        }
        plate.info();

        printPartInfo("УЖИН...");
        plate.setAvailable(55); //на ужин привезли дополнительные функции еды
        for (Animal pet : catList) {
            tmpCat = ((Cat) pet);
            tmpCat.setSatiety(tmpCat.getRefill(plate, 10 + var1.nextInt(10)));
            pet.printName();
        }
        plate.info();

    }

    public static void printPartInfo(String label) {
        System.out.println();
        System.out.println(label);
        System.out.println();
    }
}
