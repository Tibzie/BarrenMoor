import java.util.Scanner;

class OutOfCell extends Variables{

    private String move;
    private Scanner sc;

    public OutOfCell() {
        sc = new Scanner(System.in);
        move = "";
    }

    ChapterIntros intro = new ChapterTwo();


    /* Out of cell */
    public void Corridor() {

        intro.Introduction();

        System.out.println("Careful as always, you made sure the door is closed behind you, so the guards won't suspect anything.\n" +
                "Now you have two options, to go right 'West' and 'East' (type: 'West' or 'East')");
        if (sc.hasNext(moveEast)) {
            System.out.println("You moved east 8m.\n" + "Luckily, the patrol from the west direction didn't notice.\n" + "Nice job!");
        } else if (sc.hasNext(moveWest)) {
            System.out.println("You moved west 6.2m.\n" + "However. You bumped into a guard and he immediately charged you with his pike. Please restart the game.");
            sc.close();
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        System.out.println("You are walking on the corridor. Looking for a way out of this maze. type: 'north'");
        move = sc.next();
        if (sc.hasNext(moveNorth)) {
            System.out.println("You moved forward 12m.");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        System.out.println("Suddenly, you find a path that leads elsewhere. Which way do you want to go?\n" +
                "Keep moving forward! Type: 'north' " + "Or choose the path on your left. Type: 'west'");
        move = sc.next();
        if (sc.hasNext(moveNorth)) {
            System.out.println("You moved forward another 22m.\n");
        } else if (sc.hasNext(moveWest)) {
            System.out.println("You turned left, and moved 12m.\n");
            System.out.println("You activated a hidden trap beneath you. Despite your best efforts, you fell and died.\nPlease restart the game.");
            sc.close();
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }


        System.out.println("Few minutes later, you find yourself in a similar situation."+ "Do you want to turn left (West) or"
                + " turn right (East)" + " - (Type: 'west' or 'east').");
        move = sc.next();
        if (sc.hasNext(moveWest)) {
            System.out.println("You turned left and walked 5m. However, a pack of hounds showed up and bit you to death.\n"
                    + "Apparently, someone doesn't like to turn on his left.");
        } else if (sc.hasNext(moveEast)) {
            System.out.println("You turned left and saw a hole on the wall. It seems like it leads to the sewers.");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

    }
}
