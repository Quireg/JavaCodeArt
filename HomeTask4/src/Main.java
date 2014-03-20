

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Quireg on 12.03.14.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ArrayList<Good> temp  =  Database1.createConnection("Notebooks");
        for (int i = 0; i < temp.size() ; i++) {
            System.out.println(temp.get(i).getModel());

        }
//          MyFrame.MyFrame();


//        Shop shop = new Shop();
//        Database1.getConnection();
//        System.out.println();
//        System.out.println(shop.getConnection().getMetaData().getTableTypes().getType());

    }
}
