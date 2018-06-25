
public class MainClass {
    public static void main(String[] args) {
        Introduction obj = new Introduction();
        Cell eps1 = new Cell();
        OutOfCell eps2 = new OutOfCell();
        Sewers eps3 = new Sewers();
        TheStranger eps4 = new TheStranger();

        Levels level = new Levels();

        level.setLevelOne("Level 1 - Good Luck!");
        level.setLevelTwo("You managed to reach level 2!");
        level.setLevelThree("You managed to reach level 3!");
        level.setLevelFour("You managed to reach level 4!");

        obj.Intro();  /* Introduction */

        System.out.println(level.getLevelOne());
        eps1.IntheCell(); /* Harsh awakening */

        System.out.println(level.getLevelTwo());
        eps2.Corridor(); /* Out of cell */

        System.out.println(level.getLevelThree());
        eps3.IntoTheSewers(); /* Into the Sewers */

        System.out.println( level.getLevelFour());
        eps4.Stranger(); /* The Stranger */


    }
}
