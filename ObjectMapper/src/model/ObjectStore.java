package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(namespace = "model")
//@XmlJavaTypeAdapter(MyAdapter.class)

public class ObjectStore {
    // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "objectList")
    // XmlElement sets the name of the entities
    @XmlElement(name = "object")
    private final ArrayList<Object> objects;
    private final String name;

    public ObjectStore(ArrayList<Object> objects, String name) {
        this.objects = objects;
        this.name = name;
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public String getName() {
        return name;
    }
}
