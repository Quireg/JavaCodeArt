package main;
import java.awt.print.Book;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



import model.Company;
import model.ObjectStore;
import model.User;

public class Main {
    private static final String OBJECTSTORE_XML = "./objectstore-jaxb.xml";

    public static void main(String[] args) throws JAXBException, IOException {

        ArrayList<Object> objectList = new ArrayList<Object>();

        User user = new User("ivan", "ivanov", 12, 123);
        objectList.add(user);
        User user1 = new User("ivan", "ivan2ov", 12, 123);
        objectList.add(user1);
        Company company = new Company("intel", "metalistov 3");
        objectList.add(company);

        ObjectStore objectStore = new ObjectStore(objectList, "test");


        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(ObjectStore.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
        m.marshal(objectStore, System.out);

        // Write to File
        m.marshal(objectStore, new File(OBJECTSTORE_XML));

//        // get variables from our xml file, created before
//        System.out.println();
//        System.out.println("Output from our XML File: ");
//        Unmarshaller um = context.createUnmarshaller();
//        Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(BOOKSTORE_XML));
//        ArrayList<Book> list = bookstore2.getBooksList();
//        for (Book book : list) {
//            System.out.println("Book: " + book.getName() + " from "
//                    + book.getAuthor());
//        }
    }

}
