import java.util.ArrayList;

/**
 * Created by Admin on 01.02.14.
 */
public class Book {
    private String name;
    private String author;
    private ArrayList<Page> pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public void showPagesMatching(String[] arr){
        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < getPages().size() ; j++) {
                for (int k = 0; k < getPages().get(j).getPageContains().size() ; k++) {
                    if(getPages().get(j).getPageContains().get(k).contains(arr[i])){
                        System.out.println("Word " + arr[i] + " is taking place on page " + getPages().get(j).getPageNumber() + " line # " + k);
                    }

                }

            }
        }
    }

    public void addPage(int i){
        getPages().add(i, new Page());
        getPages().get(i).setPageContains(new ArrayList<String>());
        getPages().get(i).setPageNumber(i + 1);
        for (int j = i + 1; j <getPages().size() ; j++) {
            getPages().get(j).setPageNumber(getPages().get(j).getPageNumber() + 1);

        }
    }
    public int countWords(){

        int wordCount = 0;
        for (int j = 0; j < getPages().size() ; j++) {
            for (int k = 0; k < getPages().get(j).getPageContains().size() ; k++) {

                boolean word = false;
                int endOfLine = getPages().get(j).getPageContains().get(k).length() - 1;
                for (int i = 0; i < getPages().get(j).getPageContains().get(k).length(); i++) {
                    // if the char is a letter, word = true.
                    if (Character.isLetter(getPages().get(j).getPageContains().get(k).charAt(i)) && i != endOfLine) {
                        word = true;
                        // if char isn't a letter and there have been letters before,
                        // counter goes up.
                    } else if (!Character.isLetter(getPages().get(j).getPageContains().get(k).charAt(i)) && word) {
                        wordCount++;
                        word = false;
                        // last word of String; if it doesn't end with a non letter, it
                        // wouldn't count without this.
                    } else if (Character.isLetter(getPages().get(j).getPageContains().get(k).charAt(i)) && i == endOfLine) {
                        wordCount++;
                    }
                }
            }

        }
            return wordCount;

    }


}
