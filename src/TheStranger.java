import java.util.Scanner;

public class TheStranger extends Variables {



    private String move;
    private Scanner sc;

    public TheStranger() {
        sc = new Scanner(System.in);
        move = "";
    }
    ChapterIntros intro = new ChapterFour();

    public void Stranger() {

        intro.Introduction();

        System.out.println("At the exit, you see a stranger waiting for you in a coat.\n" +
                "You might want to greet him.\t Type: 'north'");
        if (sc.hasNext(moveNorth)) {
            System.out.println("You walked 16m to approache this person. You immediately realise it's your old friend,"
                    + " Frederick\n");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        System.out.println("He gives you a shovel and tells you the whereabout of the secret treasure."+ " Follow Fredrick!\n"
                + " Type: 'follow'");
        move = sc.next();
        if (sc.hasNext(moveFollow)) {
            System.out.println("You walked 52m and stopped on top of the treasure.");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        move = sc.next();
        System.out.println("You and Frederick are about to dig out the treasure.\n" + "Type: 'dig'");
        if (sc.hasNext(doDig)) {
            System.out.println("Getting closer to the treasure.");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        move = sc.next();
        System.out.println("Almost there...\n"+ "Type: 'dig'");
        if (sc.hasNext(doDig)) {
            System.out.println("Finally you got the treasure.\n");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        System.out.println("Congratulations! You finished the game");
    }
}
