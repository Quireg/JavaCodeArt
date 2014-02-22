import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.Console;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 09.02.14.
 */
public class Main {
    public static void main(String[] args) {

        Container container = new Container(new ArrayList<Figure>());
        Triangle t0 = new Triangle("T0", 5);
        Triangle t1 = new Triangle("T1", 7);
        Triangle t2 = new Triangle("T2", 10);
        Circle c0 = new Circle("C0", 30);
        Circle c1 = new Circle("C1", 10);
        Circle c2 = new Circle("C2", 10);
        Square s0 = new Square("S0", 15);
        Square s1 = new Square("S1", 10);
        Square s2 = new Square("S2", 25);
        container.getFigures().add(t0);
        container.getFigures().add(t1);
        container.getFigures().add(t2);
        container.getFigures().add(c0);
        container.getFigures().add(c1);
        container.getFigures().add(c2);
        container.getFigures().add(s0);
        container.getFigures().add(s1);
        container.getFigures().add(s2);

        System.out.println(container.findMaxPerimetr().getName() + " "+  container.findMaxSquare().getName());
        Figure f = container.findMaxPerimetr();

        System.out.println(f);
        if(container.findMaxSquare() instanceof Circle){
            Circle circle = (Circle) container.findMaxSquare();
            System.out.println();
            System.out.println(c0.getRadius());
        }


}
}
