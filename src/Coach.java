public class Coach {
    private String name;
    private String surname;
    private int age;
    private String national;

    public Coach(String name, String surname, int age, String national) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.national = national;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getNational() {
        return national;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", national='" + national + '\'' +
                '}';
    }
}
