package Task1;

import java.util.ArrayList;

/**
 * Created by Quireg on 2/15/14.
 */
public class Main {
    public static void main(String[] args) {
    Shop store = new Shop("Магазин", new ArrayList<Good>());
        store.getGoods().add(0,new Laptop(13,"Dell", 300, "laptop", "Greg", "some charact." ));
        store.getGoods().add(1,new Laptop(14,"Samsung", 350, "laptop", "Mike", "some charact." ));
        store.getGoods().add(2,new Tv(15,"Samsung", 670, "tv", "Moore", 37 ));
        store.getGoods().add(3,new Tv(16,"LG", 660, "tv", "Moore", 39 ));
        store.getGoods().add(4,new Book(17,"War and Peace", 60, "book", "Alex", 750 ));
        store.getGoods().add(5,new Book(18,"Nemo", 30, "book", "Alex", 235 ));
        store.getGoods().add(6,new Tv(19,"LG", 300, "tv", "Alex", 27 ));

        store.showGood(store.maxPriceGood());
        store.removeBooks();
//        System.out.println(store.getGoods().size());
        for (int i = 0; i < store.getGoods().size(); i++) {
            store.showGood(store.getGoods().get(i));
        }

        ArrayList<Good> goodsWithSpecifiedPrices = store.goodsPrice(300, 349);
        for (int i = 0; i < goodsWithSpecifiedPrices.size(); i++) {


            store.showGood(goodsWithSpecifiedPrices.get(i));


        }
    }
}
