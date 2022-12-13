import java.util.List;

public class Club {
    private String name;
    private String startclub;
    private Coach coach;
    private List<Players>players;

    public Club(String name, String startclub, Coach coach, List<Players> players) {
        this.name = name;
        this.startclub = startclub;
        this.coach = coach;
        this.players = players;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", startclub='" + startclub + '\'' +
                ", coach=" + coach +
                ", players=" + players +
                '}';
    }
}
