package Task1;

import java.util.ArrayList;

/**
 * Created by Quireg on 2/15/14.
 */
public class Shop {
    private String name;
    private ArrayList<Good> goods;

    public void showGood(Good good){
        System.out.println();
        System.out.println("Good ID: " + good.getId());
        System.out.println("Good cost: "+ good.getCost());
        System.out.println("Good name: "+ good.getName());
        System.out.println("Good owner: " + good.getOwner());
        System.out.println("Good type: " + good.getType());

    }

    public Good maxPriceGood(){
        System.out.println("Max price good is: ");
        int j = 0;
        Good result = getGoods().get(0);
        for (int i = 0; i <getGoods().size() ; i++) {

            if(getGoods().get(i).getCost() >= j){
             j = getGoods().get(i).getCost();
             result = getGoods().get(i);
            }

        }


        return result;
    }
    public void removeBooks(){
        System.out.println();
        System.out.println("Books have been removed");
        for (int i = getGoods().size() - 1; i >= 0 ; i--) {
            if(getGoods().get(i) instanceof Book){

                getGoods().remove(i);
            }

        }

    }

    public ArrayList<Good> goodsPrice(int startPrice, int endPrice){
        System.out.println();
        System.out.println("All goods with prices more than "+ startPrice + " and less than " + endPrice);
        ArrayList<Good> result  = new ArrayList<Good>();
        for (int i = 0; i < getGoods().size() ; i++) {
            if(getGoods().get(i).getCost() >= startPrice && getGoods().get(i).getCost() <= endPrice){
              result.add(getGoods().get(i));
            }

        }
        return result;
    }
    public Shop(String name, ArrayList<Good> goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Good> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Good> goods) {
        this.goods = goods;
    }
}
