package course1;

public class RunAppStaff {
    public static void main(String[] args) {
        staffMember staff[] = new staffMember[5];
        staff[0] = new staffMember("Буденый Семен Михайлович","Маршал","mail1@yandex.ru","(913) 123-45-67",100001,54);
        staff[1] = new staffMember("Ворошилов Климент Ефремович","Маршал","mail2@yandex.ru","(913) 223-45-67",100002,38);
        staff[2] = new staffMember("Жуков Георгий Константинович","Маршал","mail3@yandex.ru","(913) 323-45-67",100003,28);
        staff[3] = new staffMember("Ватутин Николай Федорович","Генерал Армии","mail4@yandex.ru","(913) 423-45-67",100004,43);
        staff[4] = new staffMember("Конев Иван Степанович","Маршал","mail5@yandex.ru","(913) 423-45-67",100005,40);
        for (int i = 0; i < staff.length; i++) {
            if(staff[i].getAge() > 40){
                staff[i].info();
            }
        }
    }

    public static class staffMember {

        private String fio; //ФИО сотрудника
        private String position; //должность сотрудника
        private String email; //email
        private String phone; //номер телефона
        private float salary; //ЗП
        private int age; //возраст

        public staffMember(String fio, String position, String email, String phone, float salary, int age) { //конструктор
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        public void info() {
            System.out.println("ФИО: " + this.fio);
            System.out.println("Должность: " + this.position);
            System.out.println("Адрес эл. почты: " + this.email);
            System.out.println("Номер телефона: " + this.phone);
            System.out.println("Заработная плата: " + this.salary);
            System.out.println("Возраст: " + this.age);
            System.out.println("==================================");
        }
    }
}
