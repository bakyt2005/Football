public class Players {

    private String name;
    private String surname;
    private int age;
    private String national;
    private String position;
    private int height;
    private int number;

    public Players(String name, String surname, int age, String national, String position, int height, int number) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.national = national;
        this.position = position;
        this.height = height;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", national='" + national + '\'' +
                ", position='" + position + '\'' +
                ", height=" + height +
                ", number=" + number +
                '}';
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

    public String getPosition() {
        return position;
    }

    public int getHeight() {
        return height;
    }

    public int getNumber() {
        return number;
    }
}
