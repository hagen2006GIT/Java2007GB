package course1.lesson7;

public class EatPlate {

    private int available; //количество еды на тарелке
    private String title; //как иы будем называть тарелку

    public EatPlate(int available, String title) {
        this.available = available;
        this.title = title;
    }

    public int getAvailable() {
        return available;
    }

    /**
     * увеличить количество доступной для раздачи еды
     * @param addEat
     */
    public void setAvailable(int addEat) {
        available += addEat;
    }

        /**
         * Положить на тарелку указанное кол-во еды
         * @param amount
         */
    public boolean refill(int amount) {
        System.out.println("порций еды запрошено: " + amount + ", всего доступно: " + getAvailable());
        if (this.available - amount < 0) {
            return false; //нельзя покормить, т. к. кот запросил больше еды, чем доступно на тарелке
        } else if (amount - this.available > 0) { //если кот хочет больше, чем есть в тарелке, то он еду не трогает
            this.available = this.available - amount;
            return false;
        }
        else {
            this.available = this.available - amount;
            return true; //выдать коту еду в нужно количестве
        }
    }

    @Override
    public String toString() {
        return "EatPlate {"
                + "доступно = " + available + " порций еды"
                + ", называется: " + title
                + "}";
    }

    public void info() {
        System.out.println(this);
    }
}
