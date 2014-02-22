import java.util.ArrayList;

/**
 * Created by Admin on 01.02.14.
 */
public class Main {
    public static void main(String[] args) {
        Book bladerunner = new Book();
        bladerunner.setAuthor("Billy Gimp");
        bladerunner.setName("The Bladerunner");
        bladerunner.setPages(new ArrayList<Page>());

        for (int i = 0; i < 6 ; i++) {
            bladerunner.getPages().add(new Page());
            bladerunner.getPages().get(i).setPageNumber(i+1);
            bladerunner.getPages().get(i).setPageContains(new ArrayList<String>());
            }

        bladerunner.getPages().get(0).getPageContains().add(0, "The eye is magnified and deeply revealed. Flecks of green and yellow in a field of milky blue. Icy filaments surround the undulating center. ");
        bladerunner.getPages().get(0).getPageContains().add(1, "The eye is brown in a tiny screen.");
        bladerunner.getPages().get(0).getPageContains().add(2, "On the metallic surface below the words VOIGHT-KAMPFF are finely fetched.");

        bladerunner.getPages().get(1).getPageContains().add(0, "There's a touch-light panel across the top and on the side of the screen, a dial that registers fluctuation of the iris.");
        bladerunner.getPages().get(1).getPageContains().add(1, "The instrument is no bigger than a music box and sits on a table between two men.  ");
        bladerunner.getPages().get(1).getPageContains().add(2, "The man talking is big looks like an overstuffed kid. ");

        bladerunner.getPages().get(2).getPageContains().add(0, "LEON it says on his breast pocket.");
        bladerunner.getPages().get(2).getPageContains().add(1, "He's dressed in a warehouseman's uniform and his pudgy hands are folded expectantly in his lap. ");
        bladerunner.getPages().get(2).getPageContains().add(2, "Despite the obvious heat, he looks very cool. ");

        bladerunner.getPages().get(3).getPageContains().add(0, "The man facing him is lean, hollow-cheeked, and dressed in grey.");
        bladerunner.getPages().get(3).getPageContains().add(1, "Detached and efficient, he looks like a cop or an accountant. ");
        bladerunner.getPages().get(3).getPageContains().add(2, "His name is Holden and he's all business except for the sweat on his face.");

        bladerunner.getPages().get(4).getPageContains().add(0, "The room is large and humid.");
        bladerunner.getPages().get(4).getPageContains().add(1, "Rows of salvaged junk are stacked neatly against the walls.");
        bladerunner.getPages().get(4).getPageContains().add(2, "Two large FANS WHIRR above their heads.");

        bladerunner.getPages().get(5).getPageContains().add(0, "LEON: Okay if I talk? Holden doesn't answer. He's centering Leon's eye on the machine.");
        bladerunner.getPages().get(5).getPageContains().add(1, "LEON: I kinda get nervous when I take tests.");
        bladerunner.getPages().get(5).getPageContains().add(2, "HOLDEN: Don't move. ");




        for (int i = 0; i < bladerunner.getPages().size() ; i++) {
            System.out.println("Page " + bladerunner.getPages().get(i).getPageNumber());
            for (int j = 0; j <bladerunner.getPages().get(i).getPageContains().size() ; j++) {
                System.out.println(bladerunner.getPages().get(i).getPageContains().get(j));

            }

        }
        String[]  arr = new String[3];
        arr[0] = "is";
        arr[1] = "room";
        arr[2] = "eye";

        bladerunner.showPagesMatching(arr);

        bladerunner.addPage(2);
        System.out.println();
        for (int i = 0; i < bladerunner.getPages().size() ; i++) {
            System.out.println("Page " + bladerunner.getPages().get(i).getPageNumber());
            for (int j = 0; j <bladerunner.getPages().get(i).getPageContains().size() ; j++) {
                System.out.println(bladerunner.getPages().get(i).getPageContains().get(j));

            }

        }

        System.out.println();
        System.out.println("Book "+ bladerunner.getName() + " counts " +  bladerunner.countWords()+ " words");

    }
}
