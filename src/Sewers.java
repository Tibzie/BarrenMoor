import java.util.Scanner;

public class Sewers extends Variables{

    RandomVoice v = new RatVoice();


    private String move;
    private Scanner sc;

    public Sewers() {
        sc = new Scanner(System.in);
        move = "";
    }
    ChapterIntros intro = new ChapterThree();

    /* Into the Sewers */
    public void IntoTheSewers() {

        intro.Introduction();

        System.out.println("After careful inspection, you find 3 different paths.\n" + "The main path is in front of you. "
                + "However, it's blocked with large, heavy objects and you don't want to make a noise.\n" + "There are four other paths that could lead you out.\n" +
                "One on the left and other one is on the right. Type 'west' or 'east'");

        if (sc.hasNext(moveWest)) {
            System.out.println("You walked 41m.\nThis time west was the good choice.");
        } else if (sc.hasNext(moveEast)) {
            v.randomVoice();
            System.out.println("You turned right and walked 23m, but a giant rat heard your footsteps and ate you alive.\nPlease restart the game.");
            sc.close();
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }

        System.out.println("You can see the moonlight at the end of the sewers. Move forward. Type 'north'");
        move = sc.next();
        if (sc.hasNext(moveNorth)) {
            System.out.println("You walked 50m and you finally reached the sewers' exit.\n");
        } else {
            System.out.println("You didn't do anything or entered something else. Please restart the game.");
            sc.close();
        }


    }
}
