import java.util.Scanner;


public class Cell extends Variables {


    RandomVoice v = new PikeVoice();


    private String move;
    private Scanner sc;

    public Cell() {
        sc = new Scanner(System.in);
        move = "";
    }

    ChapterIntros intro = new ChapterOne();

    /* Harsh awakening */
    public void IntheCell() {


        intro.Introduction();

        System.out.println("Perhaps you want to look around. Type 'look'\n");
        if (sc.hasNext(doLook)) {
            System.out.println("You find yourself in a cell with some of your inmates. These are skeletons hanging on chains.\r"
                    + "In front of you is the cell door... \n" + "Perhaps it's open?! You should check it out.\n\n");
        } else {
            System.out.println("You didn't walk or entered something else. Please restart the game.");
            sc.close();
        }


        System.out.println("Move north. (type: 'north')");
        move = sc.next();
        if (sc.hasNext(moveNorth)) {
            System.out.println("You walked ahead 4.56m.");
            System.out.println("It's locked (obviously).\r" + "You might want to look for something to open the door.\n" +
                    "Perhaps the skeletons could help you out.\n" + "Consider moving back to the remains of your dead inmates.\n\n");
        } else {
            System.out.println("You didn't walk or entered something else. Please restart the game.");
            sc.close();
        }


        System.out.println("Move back. (type: 'south')");
        move = sc.next();
        if (sc.hasNext(moveSouth)) {
            System.out.println("You walked back 4.56m. Now, you might want to search for any objects.");
        } else {
            System.out.println("You didn't walk or entered something else. Please restart the game.");
            sc.close();
        }


        System.out.println("Search the corpses (type: 'search')");
        move = sc.next();
        if(sc.hasNext(doSearch)) {
            System.out.println("As a master lockpicker, you figured out that a bone fragment could help you open the door.\n" +
                    "You also managed to find a compass and a hat with a Jack Spandro signature.\n\n");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        v.randomVoice();

        System.out.println("Move to the celldoor again. (type: north)");
        move = sc.next();
        if (sc.hasNext(moveNorth)) {
            System.out.println("Great! You are at the celldoor with a 'key'.\n\n");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }


        System.out.println("Use the key to open the door. (type: 'key')");
        move = sc.next();
        if (sc.hasNext(doOpen)) {
            System.out.println("Damn. The bone broke.\n" + "However, as a person with backup plans, you have a spare one.\n\n");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        System.out.println("Use the key option again. (type: 'key')");
        move = sc.next();
        if (sc.hasNext(doOpen)) {
            System.out.println("Finally, it's open.\nTime to leave.");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }
    }
}
