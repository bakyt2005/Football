
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Players players1 = new Players("De gea", "David", 32, "Spain", "Goalkeeper", 192, 1);
        Players players2 = new Players("Heaton", "Tom", 36, "England", "GoalKeeper", 188, 22);
        Players players3 = new Players("Dubravka", "Martin", 33, "Slovakia", "GoalKeeper", 190, 31);
        Players players4 = new Players("Vitek", "Rabek", 19, "Czech Republic", "GoalKeeper", 198, 50);
        Players players5 = new Players("Maguare", "Harry", 29, "England", "Defender", 194, 5);
        Players players6 = new Players("Lindelof", "Victor", 28, "Sweden", "Defender", 187, 2);
        Players players7 = new Players("Jones", "Phil", 30, "England", "Defender", 180, 4);
        Players players8 = new Players("Varane", "Raphael", 29, "France", "Defender", 191, 19);
        Players players9 = new Players("Dalot", "Diogo", 23, "Portugal", "Defender", 183, 20);
        Players players10 = new Players("Shaw", "Luke", 27, "England", "Defender", 185, 23);
        Players players11 = new Players("Wan-Bissaka", "Aaron", 25, "England", "Defender", 183, 29);
        Players players12 = new Players("Wiliams", "Brandon", 22, "England", "Defender", 171, 33);
        Players players13 = new Players("Tuanzebe", "Axel", 25, "England", "Defender", 186, 38);
        Players players14 = new Players("Malacia", "Tyrell", 23, "Netherland", "Defender", 170, 12);
        Players players15 = new Players("Martinez", "lisandro", 24, "Argentina", "Defender", 175, 6);
        Players players16 = new Players("Fred", "Rodrigues", 29, "Brazil", "Midfielder", 169, 17);
        Players players17 = new Players("Fernandes", "Bruno", 28, "Portugal", "Midfielder", 179, 8);
        Players players18 = new Players("Mctominay", "Scott", 25, "Scotland", "Midfielder", 193, 39);
        Players players19 = new Players("Pellistri", "Facundo", 20, "Uruguay", "Midfielder", 175, 28);
        Players players20 = new Players("Van de Beek", "Donny", 25, "Nederland", "Midfielder", 181, 34);
        Players players21 = new Players("Ericksen", "Christian", 30, "Dania", "Midfielder", 182, 14);
        Players players22 = new Players("Casemiro", "Carlos Henriqu", 30, "Brazil", "Midfielder", 185, 18);
        Players players23 = new Players("Iqbal", "Zidane", 19, "Iraq", "Midfielder", 181, 55);
        Players players24 = new Players("Garnacho", "Alejandro", 18, "Argentina", "Forward", 180, 49);
        Players players25 = new Players("Rashford", "Marcus", 25, "England", "LW", 180, 10);
        Players players26 = new Players("Sancho", "Jadon", 22, "England", "Forward", 180, 25);
        Players players27 = new Players("Elanga", "Anthony", 20, "Sweden", "Forward", 178, 36);
        Players players28 = new Players("Martial", "Anthony", 27, "France", "Forward", 181, 9);
        Players players29 = new Players("Shoretire", "Shola", 18, "England", "Forward", 170, 47);
        Players players30 = new Players("Antony", "Matheus dos Santos", 22, "Brazil", "Forward", 174, 21);
        Players players31 = new Players("McNeil", "Charlie", 19, "England", "Forward", 182, 56);
        Players[] players = {players1, players2, players3, players4, players5, players6, players7, players8, players9, players10, players11, players12, players13,
                players14, players15, players16, players17, players18, players19, players20, players21, players23, players24, players25,
                players26, players27, players28, players29, players30, players31};
        Coach coach = new Coach("Ten hag", "Erik", 52, "Nederland");
        Players players32 = new Players("Ederson", "Moraes", 29, "Brazil", "Goalkeeper", 188, 31);
        Players players33 = new Players("Carson", "Scott", 37, "England", "Goalkeeper", 188, 33);
        Players players34 = new Players("Ortega", "Stefan", 30, "Germany", "Goalkeeper", 185, 18);
        Players players35 = new Players("Walker", "Kyle", 32, "England", "Defender", 178, 2);
        Players players36 = new Players("Dias", "Ruben", 25, "Portugal", "Defender", 186, 3);
        Players players37 = new Players("Stones", "John", 28, "England", "Defender", 188, 5);
        Players players38 = new Players("Ake", "Nathan", 27, "Netherland", "Defender", 180, 6);
        Players players39 = new Players("Laporte", "Aymeric", 28, "Spain", "Defender", 189, 14);
        Players players40 = new Players("Cancelo", "Joao", 28, "Portugal", "Defnder", 182, 7);
        Players players41 = new Players("Wilson-Esbrand", "Josh", 19, "England", "Defender", 176, 97);
        Players players42 = new Players("Lewis", "Rico", 18, "England", "Defender", 169, 82);
        Players players43 = new Players("Akanji", "Manuel", 27, "Switzerland", "Defender", 186, 25);
        Players players44 = new Players("Gundogan", "Ilkay", 32, "Germany", "Midfielder", 180, 8);
        Players players45 = new Players("Grealish", "Jack", 27, "England", "Midfielder", 175, 10);
        Players players46 = new Players("Rodri", "Hernandez", 26, "Spain", "Midfielder", 190, 16);
        Players players47 = new Players("De Bruyne", "Kevin", 31, "Belgium", "Midfielder", 181, 17);
        Players players48 = new Players("Silva", "Bernardo", 28, "Portugal", "Midfielder", 173, 20);
        Players players49 = new Players("Foden", "Phil", 22, "England", "Midfielder", 171, 47);
        Players players50 = new Players("Palmer", "Cole", 20, "England", "Midfielder", 182, 80);
        Players players51 = new Players("Philips", "Kalvin", 27, "England", "Midfielder", 178, 4);
        Players players52 = new Players("Gomez", "Sergio", 22, "Spain", "Midfielder", 171, 21);
        Players players53 = new Players("Mahrez", "Riyad", 31, "Algeria", "Forward", 179, 26);
        Players players54 = new Players("Haaland", "Erling", 22, "Norway", "Forward", 194, 9);
        Players players55 = new Players("Alvarez", "Julian", 22, "Argentina", "Forward", 170, 19);
        Players[] playerss = {players32, players33, players34, players35, players36, players37, players38, players39, players40, players41, players42, players43,
                players44, players45, players46, players50, players51, players52, players53, players54, players55};
        Coach coach1 = new Coach("Guardiola", "Pep", 51, "Spain");
        Club Mancity = new Club("Manchester City", "Start Clubs-1880", coach1, List.of(playerss));
        Club ManUnte = new Club("Manchester United", "Start Clubs-1878", coach, List.of(players));

        while (true) {
            System.out.println("|---------->|Primier League|<----------|");
            System.out.println("|---------->Manchester United<---------|--> 1");
            System.out.println("|----------->Manchester City<----------|--> 2");
            System.out.println("|------->Find players with name<-------|--> 3" +
                    "\n|------------->Enter here:<------------|  ");

            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println(ManUnte);
            } else if (a == 2) {
                System.out.println(Mancity);
            } else if (a == 3) {
                System.out.println("Name of: ");
                String name = scanner1.nextLine();
                if (name.equals(players1.getName()) || name.equals(players1.getSurname())) {
                    System.out.println(players1.getName() + "," + players1.getSurname() + "," + players1.getAge() + "," + players1.
                            getNational() + "," + players1.getPosition() + "," + players1.getHeight() + "," + players1.getNumber());
                } else if (name.equals(players2.getName()) || name.equals(players2.getSurname())) {
                    System.out.println(players2.getName() + "," + players2.getSurname() + "," + players2.getAge() + "," + players2.
                            getNational() + "," + players2.getPosition() + "," + players2.getHeight() + "," + players2.getNumber());
                } else if (name.equals(players3.getName()) || name.equals(players3.getSurname())) {
                    System.out.println(players3.getName() + "," + players3.getSurname() + "," + players3.getAge() + "," + players3.
                            getNational() + "," + players3.getPosition() + "," + players3.getHeight() + "," + players3.getNumber());
                } else if (name.equals(players4.getName()) || name.equals(players4.getSurname())) {
                    System.out.println(players4.getName() + "," + players4.getSurname() + "," + players4.getAge() + "," + players4.
                            getNational() + "," + players4.getPosition() + "," + players4.getHeight() + "," + players4.getNumber());
                } else if (name.equals(players5.getName()) || name.equals(players5.getSurname())) {
                    System.out.println(players5.getName() + "," + players5.getSurname() + "," + players5.getAge() + "," + players5.
                            getNational() + "," + players5.getPosition() + "," + players5.getHeight() + "," + players5.getNumber());
                } else if (name.equals(players6.getName()) || name.equals(players6.getSurname())) {
                    System.out.println(players6.getName() + "," + players6.getSurname() + "," + players6.getAge() + "," + players6.
                            getNational() + "," + players6.getPosition() + "," + players6.getHeight() + "," + players6.getNumber());
                } else if (name.equals(players7.getName()) || name.equals(players7.getSurname())) {
                    System.out.println(players7.getName() + "," + players7.getSurname() + "," + players7.getAge() + "," + players7.
                            getNational() + "," + players7.getPosition() + "," + players7.getHeight() + "," + players7.getNumber());
                } else if (name.equals(players8.getName()) || name.equals(players8.getSurname())) {
                    System.out.println(players8.getName() + "," + players8.getSurname() + "," + players8.getAge() + "," + players8.
                            getNational() + "," + players8.getPosition() + "," + players8.getHeight() + "," + players8.getNumber());
                } else if (name.equals(players9.getName()) || name.equals(players9.getSurname())) {
                    System.out.println(players9.getName() + "," + players9.getSurname() + "," + players9.getAge() + "," + players9.
                            getNational() + "," + players9.getPosition() + "," + players9.getHeight() + "," + players9.getNumber());
                } else if (name.equals(players10.getName()) || name.equals(players10.getSurname())) {
                    System.out.println(players10.getName() + "," + players10.getSurname() + "," + players10.getAge() + "," + players10.
                            getNational() + "," + players10.getPosition() + "," + players10.getHeight() + "," + players10.getNumber());
                } else if (name.equals(players11.getName()) || name.equals(players11.getSurname())) {
                    System.out.println(players11.getName() + "," + players11.getSurname() + "," + players11.getAge() + "," + players11.
                            getNational() + "," + players11.getPosition() + "," + players11.getHeight() + "," + players11.getNumber());
                } else if (name.equals(players12.getName()) || name.equals(players12.getSurname())) {
                    System.out.println(players12.getName() + "," + players12.getSurname() + "," + players12.getAge() + "," + players12.
                            getNational() + "," + players12.getPosition() + "," + players12.getHeight() + "," + players12.getNumber());
                } else if (name.equals(players13.getName()) || name.equals(players13.getSurname())) {
                    System.out.println(players13.getName() + "," + players13.getSurname() + "," + players13.getAge() + "," + players13.
                            getNational() + "," + players13.getPosition() + "," + players13.getHeight() + "," + players13.getNumber());
                } else if (name.equals(players14.getName()) || name.equals(players14.getSurname())) {
                    System.out.println(players14.getName() + "," + players14.getSurname() + "," + players14.getAge() + "," + players14.
                            getNational() + "," + players14.getPosition() + "," + players14.getHeight() + "," + players14.getNumber());
                } else if (name.equals(players15.getName()) || name.equals(players15.getSurname())) {
                    System.out.println(players15.getName() + "," + players15.getSurname() + "," + players15.getAge() + "," + players15.
                            getNational() + "," + players15.getPosition() + "," + players13.getHeight() + "," + players15.getNumber());
                } else if (name.equals(players16.getName()) || name.equals(players16.getSurname())) {
                    System.out.println(players16.getName() + "," + players16.getSurname() + "," + players16.getAge() + "," + players16.
                            getNational() + "," + players16.getPosition() + "," + players16.getHeight() + "," + players16.getNumber());
                } else if (name.equals(players17.getName()) || name.equals(players17.getSurname())) {
                    System.out.println(players17.getName() + "," + players17.getSurname() + "," + players17.getAge() + "," + players17.
                            getNational() + "," + players17.getPosition() + "," + players17.getHeight() + "," + players17.getNumber());
                } else if (name.equals(players18.getName()) || name.equals(players18.getSurname())) {
                    System.out.println(players18.getName() + "," + players18.getSurname() + "," + players18.getAge() + "," + players18.
                            getNational() + "," + players18.getPosition() + "," + players18.getHeight() + "," + players18.getNumber());
                } else if (name.equals(players19.getName()) || name.equals(players19.getSurname())) {
                    System.out.println(players19.getName() + "," + players19.getSurname() + "," + players19.getAge() + "," + players19.
                            getNational() + "," + players19.getPosition() + "," + players19.getHeight() + "," + players19.getNumber());
                } else if (name.equals(players20.getName()) || name.equals(players20.getSurname())) {
                    System.out.println(players20.getName() + "," + players20.getSurname() + "," + players20.getAge() + "," + players20.
                            getNational() + "," + players20.getPosition() + "," + players20.getHeight() + "," + players20.getNumber());
                } else if (name.equals(players21.getName()) || name.equals(players21.getSurname())) {
                    System.out.println(players21.getName() + "," + players21.getSurname() + "," + players21.getAge() + "," + players21.
                            getNational() + "," + players21.getPosition() + "," + players21.getHeight() + "," + players21.getNumber());
                } else if (name.equals(players22.getName()) || name.equals(players22.getSurname())) {
                    System.out.println(players22.getName() + "," + players22.getSurname() + "," + players22.getAge() + "," + players22.
                            getNational() + "," + players11.getPosition() + "," + players22.getHeight() + "," + players22.getNumber());
                } else if (name.equals(players23.getName()) || name.equals(players23.getSurname())) {
                    System.out.println(players23.getName() + "," + players23.getSurname() + "," + players23.getAge() + "," + players23.
                            getNational() + "," + players23.getPosition() + "," + players23.getHeight() + "," + players23.getNumber());
                } else if (name.equals(players24.getName()) || name.equals(players24.getSurname())) {
                    System.out.println(players24.getName() + "," + players24.getSurname() + "," + players24.getAge() + "," + players24.
                            getNational() + "," + players24.getPosition() + "," + players24.getHeight() + "," + players24.getNumber());
                } else if (name.equals(players25.getName()) || name.equals(players25.getSurname())) {
                    System.out.println(players25.getName() + "," + players25.getSurname() + "," + players25.getAge() + "," + players25.
                            getNational() + "," + players25.getPosition() + "," + players25.getHeight() + "," + players25.getNumber());
                } else if (name.equals(players26.getName()) || name.equals(players26.getSurname())) {
                    System.out.println(players26.getName() + "," + players26.getSurname() + "," + players26.getAge() + "," + players26.
                            getNational() + "," + players26.getPosition() + "," + players13.getHeight() + "," + players26.getNumber());
                } else if (name.equals(players27.getName()) || name.equals(players27.getSurname())) {
                    System.out.println(players27.getName() + "," + players27.getSurname() + "," + players27.getAge() + "," + players27.
                            getNational() + "," + players27.getPosition() + "," + players27.getHeight() + "," + players27.getNumber());
                } else if (name.equals(players28.getName()) || name.equals(players28.getSurname())) {
                    System.out.println(players28.getName() + "," + players28.getSurname() + "," + players28.getAge() + "," + players28.
                            getNational() + "," + players28.getPosition() + "," + players28.getHeight() + "," + players28.getNumber());
                } else if (name.equals(players29.getName()) || name.equals(players29.getSurname())) {
                    System.out.println(players29.getName() + "," + players29.getSurname() + "," + players29.getAge() + "," + players29.
                            getNational() + "," + players29.getPosition() + "," + players29.getHeight() + "," + players29.getNumber());
                } else if (name.equals(players30.getName()) || name.equals(players30.getSurname())) {
                    System.out.println(players30.getName() + "," + players30.getSurname() + "," + players30.getAge() + "," + players30.
                            getNational() + "," + players30.getPosition() + "," + players30.getHeight() + "," + players30.getNumber());
                } else if (name.equals(players31.getName()) || name.equals(players31.getSurname())) {
                    System.out.println(players31.getName() + "," + players31.getSurname() + "," + players31.getAge() + "," + players31.
                            getNational() + "," + players31.getPosition() + "," + players31.getHeight() + "," + players31.getNumber());
                } else if (name.equals(players32.getName()) || name.equals(players32.getSurname())) {
                    System.out.println(players32.getName() + "," + players32.getSurname() + "," + players32.getAge() + "," + players32.
                            getNational() + "," + players32.getPosition() + "," + players32.getHeight() + "," + players32.getNumber());
                } else if (name.equals(players33.getName()) || name.equals(players33.getSurname())) {
                    System.out.println(players33.getName() + "," + players33.getSurname() + "," + players33.getAge() + "," + players33.
                            getNational() + "," + players33.getPosition() + "," + players33.getHeight() + "," + players33.getNumber());
                } else if (name.equals(players34.getName()) || name.equals(players34.getSurname())) {
                    System.out.println(players34.getName() + "," + players34.getSurname() + "," + players34.getAge() + "," + players34.
                            getNational() + "," + players34.getPosition() + "," + players34.getHeight() + "," + players34.getNumber());
                } else if (name.equals(players35.getName()) || name.equals(players35.getSurname())) {
                    System.out.println(players35.getName() + "," + players35.getSurname() + "," + players35.getAge() + "," + players35.
                            getNational() + "," + players35.getPosition() + "," + players35.getHeight() + "," + players35.getNumber());
                } else if (name.equals(players36.getName()) || name.equals(players36.getSurname())) {
                    System.out.println(players36.getName() + "," + players36.getSurname() + "," + players36.getAge() + "," + players36.
                            getNational() + "," + players36.getPosition() + "," + players36.getHeight() + "," + players36.getNumber());
                } else if (name.equals(players37.getName()) || name.equals(players37.getSurname())) {
                    System.out.println(players37.getName() + "," + players37.getSurname() + "," + players37.getAge() + "," + players37.
                            getNational() + "," + players37.getPosition() + "," + players37.getHeight() + "," + players37.getNumber());
                } else if (name.equals(players38.getName()) || name.equals(players38.getSurname())) {
                    System.out.println(players38.getName() + "," + players38.getSurname() + "," + players38.getAge() + "," + players38.
                            getNational() + "," + players38.getPosition() + "," + players38.getHeight() + "," + players38.getNumber());
                } else if (name.equals(players39.getName()) || name.equals(players39.getSurname())) {
                    System.out.println(players39.getName() + "," + players39.getSurname() + "," + players39.getAge() + "," + players39.
                            getNational() + "," + players39.getPosition() + "," + players39.getHeight() + "," + players39.getNumber());
                } else if (name.equals(players40.getName()) || name.equals(players40.getSurname())) {
                    System.out.println(players40.getName() + "," + players40.getSurname() + "," + players40.getAge() + "," + players40.
                            getNational() + "," + players40.getPosition() + "," + players40.getHeight() + "," + players40.getNumber());
                } else if (name.equals(players41.getName()) || name.equals(players41.getSurname())) {
                    System.out.println(players41.getName() + "," + players41.getSurname() + "," + players41.getAge() + "," + players41.
                            getNational() + "," + players41.getPosition() + "," + players41.getHeight() + "," + players41.getNumber());
                } else if (name.equals(players42.getName()) || name.equals(players42.getSurname())) {
                    System.out.println(players42.getName() + "," + players42.getSurname() + "," + players42.getAge() + "," + players42.
                            getNational() + "," + players42.getPosition() + "," + players42.getHeight() + "," + players42.getNumber());
                } else if (name.equals(players43.getName()) || name.equals(players43.getSurname())) {
                    System.out.println(players43.getName() + "," + players43.getSurname() + "," + players43.getAge() + "," + players43.
                            getNational() + "," + players43.getPosition() + "," + players43.getHeight() + "," + players43.getNumber());
                } else if (name.equals(players44.getName()) || name.equals(players44.getSurname())) {
                    System.out.println(players44.getName() + "," + players44.getSurname() + "," + players44.getAge() + "," + players44.
                            getNational() + "," + players44.getPosition() + "," + players44.getHeight() + "," + players44.getNumber());
                } else if (name.equals(players45.getName()) || name.equals(players45.getSurname())) {
                    System.out.println(players45.getName() + "," + players45.getSurname() + "," + players45.getAge() + "," + players45.
                            getNational() + "," + players45.getPosition() + "," + players45.getHeight() + "," + players45.getNumber());
                } else if (name.equals(players46.getName()) || name.equals(players46.getSurname())) {
                    System.out.println(players46.getName() + "," + players46.getSurname() + "," + players46.getAge() + "," + players46.
                            getNational() + "," + players46.getPosition() + "," + players46.getHeight() + "," + players46.getNumber());
                } else if (name.equals(players47.getName()) || name.equals(players47.getSurname())) {
                    System.out.println(players47.getName() + "," + players47.getSurname() + "," + players47.getAge() + "," + players47.
                            getNational() + "," + players47.getPosition() + "," + players47.getHeight() + "," + players47.getNumber());
                } else if (name.equals(players48.getName()) || name.equals(players48.getSurname())) {
                    System.out.println(players48.getName() + "," + players48.getSurname() + "," + players48.getAge() + "," + players48.
                            getNational() + "," + players48.getPosition() + "," + players48.getHeight() + "," + players48.getNumber());
                } else if (name.equals(players49.getName()) || name.equals(players49.getSurname())) {
                    System.out.println(players49.getName() + "," + players49.getSurname() + "," + players49.getAge() + "," + players49.
                            getNational() + "," + players49.getPosition() + "," + players49.getHeight() + "," + players49.getNumber());
                } else if (name.equals(players50.getName()) || name.equals(players50.getSurname())) {
                    System.out.println(players50.getName() + "," + players50.getSurname() + "," + players50.getAge() + "," + players50.
                            getNational() + "," + players50.getPosition() + "," + players50.getHeight() + "," + players50.getNumber());
                } else if (name.equals(players51.getName()) || name.equals(players51.getSurname())) {
                    System.out.println(players51.getName() + "," + players51.getSurname() + "," + players51.getAge() + "," + players51.
                            getNational() + "," + players51.getPosition() + "," + players51.getHeight() + "," + players51.getNumber());
                } else if (name.equals(players52.getName()) || name.equals(players52.getSurname())) {
                    System.out.println(players52.getName() + "," + players52.getSurname() + "," + players52.getAge() + "," + players52.
                            getNational() + "," + players52.getPosition() + "," + players52.getHeight() + "," + players52.getNumber());
                } else if (name.equals(players53.getName()) || name.equals(players53.getSurname())) {
                    System.out.println(players53.getName() + "," + players53.getSurname() + "," + players53.getAge() + "," + players53.
                            getNational() + "," + players53.getPosition() + "," + players53.getHeight() + "," + players53.getNumber());
                } else if (name.equals(players54.getName()) || name.equals(players54.getSurname())) {
                    System.out.println(players54.getName() + "," + players54.getSurname() + "," + players54.getAge() + "," + players54.
                            getNational() + "," + players54.getPosition() + "," + players54.getHeight() + "," + players54.getNumber());
                } else if (name.equals(players55.getName()) || name.equals(players55.getSurname())) {
                    System.out.println(players55.getName() + "," + players55.getSurname() + "," + players55.getAge() + "," + players55.
                            getNational() + "," + players55.getPosition() + "," + players55.getHeight() + "," + players55.getNumber());
                }else  {
                    System.out.println("Wrong name!!!!");
                }
            }
        }
    }
}