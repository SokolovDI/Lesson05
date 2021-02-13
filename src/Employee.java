/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * persArray[4] = new Person(...);
 * <p>
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String post;
    private String email;
    private String phoneNumber;
    private int wages;
    private int age;

    public Employee(String surname, String name, String patronymic, String post,
                    String email, String phoneNumber, int wages, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;
    }
    public void getInfo(){
        System.out.println("Фамилия: " + surname + "\nИмя: "  + name +
                "\nОтчество: " + patronymic + "\nДолжность: " + post + "\nE-mail: " + email +
                "\nТелефон: " + phoneNumber + "\nЗарплата: " + wages + "\nВозраст: " + age + "\n");
    }

    public int getAge() {
        return age;
    }
}
