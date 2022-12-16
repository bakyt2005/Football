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
