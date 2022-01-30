package course1.lesson6;

public class Animal {


    protected String name;

    public String getName() {
        return name;
    }

    public void doRun(int distanceForRun) {
        if (this instanceof Dog && distanceForRun > ((Dog) this).maxRun) {
            System.out.println("maxRUN for Dog = " + ((Dog) this).maxRun + ". " + distanceForRun + " собака не пробежит!");
        } else if (this instanceof Cat && distanceForRun > ((Cat) this).maxRun) {
            System.out.println("maxRUN for Cat = " + ((Cat) this).maxRun + ". " + distanceForRun + " кошка не пробежит!");
        } else {
            System.out.println(this.getName() + " пробежал "+ distanceForRun);
        }
    }

    public void doSwim(int distanceForSwim) {
        if (this instanceof Dog && distanceForSwim > ((Dog) this).maxSwim) {
            System.out.println("maxSwim for Dog = " + ((Dog) this).maxSwim + ". " + distanceForSwim + " собака не проплывет!");
        } else if (this instanceof Cat && distanceForSwim > ((Cat) this).maxSwim) {
            System.out.println("maxSwim for Cat = " + ((Cat) this).maxSwim + ". " + distanceForSwim + " кошка не проплывет!");
        } else {
            System.out.println(this.getName() + " проплыл "+ distanceForSwim);
        }
    }

    void printName() {
        System.out.print("Hi, my name is " + name);
        if (this instanceof Dog) {
            System.out.println(". I'm Dog" + ". maxRUN = " + ((Dog) this).maxRun + ", maxSWIM = " + ((Dog) this).maxSwim);
        } else if (this instanceof Cat) {
            System.out.println(". I'm Cat" + ". maxRUN = " + ((Cat) this).maxRun + ", maxSWIM = " + ((Cat) this).maxSwim);
        }
    }
}
