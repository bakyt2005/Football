import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Players players1 = new Players("De gea", "David", 32, "Spain", "Gk", 192, 1);
        Coach coach = new Coach("Ten hag", "Erik", 52, "Nederland");
        Club MU = new Club("Manchester United", "Startclubs-1878", coach, List.of(players1));
        Club MUdfg = new Club("Manchester United", "Startclubs-1878", coach, List.of(players1));

        while (true) {
            System.out.println("Manchester United -> 1\n");
            System.out.println("Manchester City -> 2\n");
            System.out.println("Find players with name -> 3\nEnter here: ");
            int a = scanner.nextInt();
            if (a==1){
                System.out.println(MU);

            }else if (a==2){
                System.out.println();
            }else if (a==3){
                System.out.println("Name of: ");
                String name = scanner1.nextLine();
                if (name.equals(players1.getName())||name.equals(players1.getSurname()));
                System.out.println(players1.getName()+","+players1.getSurname()+","+players1.getAge()+","+players1.getNational()+","+
                        players1.getPosition()+","+players1.getHeight()+","+players1.getNumber());
            }

        }

    }
}