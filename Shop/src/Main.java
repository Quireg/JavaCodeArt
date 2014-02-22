import java.util.ArrayList;

/**
 * Created by Admin on 02.02.14.
 */
public class Main {
    public static void main(String[] args) {
        Store shop = new Store();

        ArrayList<Good> goods = new ArrayList<Good>();
        shop.setGoods(goods);

        Good freedom = new Good();
        freedom.setName("Свобода");
        freedom.setPrice(1000);
        freedom.setWeight(3000);
        Good honor = new Good();
        honor.setName("Честь");
        honor.setPrice(1500);
        honor.setWeight(100);
        Good liberty = new Good();
        liberty.setName("Независимость");
        liberty.setPrice(10000);
        liberty.setWeight(1500);
        Good democracy = new Good();
        democracy.setName("Демократия");
        democracy.setPrice(7500);
        democracy.setWeight(5000);

        goods.add(freedom);
        goods.add(honor);
        goods.add(liberty);
        goods.add(democracy);



        shop.sortByPrice();
        shop.report();

    }
}
