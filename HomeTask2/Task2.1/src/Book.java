package Task1;

/**
 * Created by Quireg on 2/15/14.
 */
public class Book extends Good{
    private int pageNumber;

    public Book(int id, String name, int cost, String type, String owner, int pageNumber) {
        super(id, name, cost, type, owner);
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
