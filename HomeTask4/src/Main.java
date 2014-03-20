

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Quireg on 12.03.14.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ArrayList<Good> temp  =  Database1.createConnection("Notebooks");
        ArrayList<Good> temp1  =  Database1.createConnection("Cellphones");
        ArrayList<Good> temp2  =  Database1.createConnection("Printers");
        for (int i = 0; i < temp.size() ; i++) {
            System.out.println(temp.get(i).getModel());

        }for (int i = 0; i < temp1.size() ; i++) {
            System.out.println(temp1.get(i).getModel());

        }for (int i = 0; i < temp2.size() ; i++) {
            System.out.println(temp2.get(i).getModel());

        }
//          MyFrame.MyFrame();


//        Shop shop = new Shop();
//        Database1.getConnection();
//        System.out.println();
//        System.out.println(shop.getConnection().getMetaData().getTableTypes().getType());

    }
}
