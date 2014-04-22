import java.awt.print.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


public class ObjectMapper {
    private static final String OBJECTSTORE_XML = "./objectstore-jaxb.xml";

    public static void main(String[] args) throws JAXBException {
        ArrayList<Object> objects = new ArrayList<>();

        Object company1 = new Company1("kyivstar", "metalistov 4");
        Object user1 = new User1("kolia", "ivanov", 33, 1400);

        objects.add(company1);
        objects.add(user1);

        ObjectsMine objectsMine = new ObjectsMine();
        objectsMine.setName("Objects");
        objectsMine.setObjects(objects);

        JAXBContext context = JAXBContext.newInstance(ObjectsMine.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);


        // Write to System.out
        m.marshal(objectsMine, System.out);

        // Write to File
        m.marshal(objectsMine, new File(OBJECTSTORE_XML));

        // get variables from our xml file, created before
//        System.out.println();
//        System.out.println("Output from our XML File: ");
//        Unmarshaller um = context.createUnmarshaller();
//        Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(BOOKSTORE_XML));
//        ArrayList<Book> list = bookstore2.getBooksList();
//        for (Book book : list) {
//            System.out.println("Book: " + book.getName() + " from "
//                    + book.getAuthor());

//
//
//
//
//        save(company1);
//
//        Company1 k = (Company1)load(1, "Company1");
//        System.out.println(k.getClass().getDeclaredFields()[0].getName() + " " + k.getName());

    }

    public static void save(Object obj){

            String path = "C:\\javatemp\\" + obj.getClass().getSimpleName();
            File file = new File(path);
            if(file.getName() != null){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("bida bida");
                }
            }

        ObjectOutputStream ous = null;
        try {
            ous = new ObjectOutputStream(new FileOutputStream(path));
            ous.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public static Object load(long id, String className){
        String path = "C:\\javatemp\\" + className;
        ObjectInputStream ois;

        try{
            ois = new ObjectInputStream(new FileInputStream(path));
            Object result = ois.readObject();
            return result;
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}



class User1  {
    @XmlElement(name = "User1")
    private String name;
    private String lname;
    private int age;

    User1(String name, String lname, int age, int salsry) {
        this.name = name;
        this.lname = lname;
        this.age = age;
        this.salsry = salsry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalsry() {
        return salsry;
    }

    public void setSalsry(int salsry) {
        this.salsry = salsry;
    }

    private int salsry;
}
class Company1 {
    @XmlElement(name = "Company1")
    private String name;
    private String address;

    Company1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
@XmlRootElement(namespace = "ObjectMapper")

class ObjectsMine {
    // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "ObjectsMine")
    // XmlElement sets the name of the entities
    @XmlElement(name = "object")

    private String name;
    private ArrayList<Object> objects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Object> objects) {
        this.objects = objects;
    }
}