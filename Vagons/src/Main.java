/**
 * Created by Admin on 02.02.14.
 */
public class Main {
    public static void main(String[] args) {
        Passenger u0 = new Passenger();
        u0.setName("Иван");
        Passenger u1 = new Passenger();
        u1.setName("Иван1");
        Passenger u2 = new Passenger();
        u2.setName("Иван2");
        Passenger u3 = new Passenger();
        u3.setName("Иван3");
        Passenger u4 = new Passenger();
        u4.setName("Иван4");
        Passenger u5 = new Passenger();
        u5.setName("Иван5");
        Passenger u6 = new Passenger();
        u6.setName("Иван6");
        Passenger u7 = new Passenger();
        u7.setName("Иван7");
        Passenger u8 = new Passenger();
        u8.setName("Иван8");
        Passenger u9 = new Passenger();
        u9.setName("Иван9");
        Passenger[] p0 = new Passenger[3];
        p0[0]= u2;
        p0[1]= u1;
        p0[2]= u7;
        Passenger[] p1 = new Passenger[4];
        p1[0]= u6;
        p1[1]= u2;
        p1[2]= u3;
        p1[3]= u2;
        Passenger[] p2 = new Passenger[0];

        Passenger[] p3 = new Passenger[6];
        p3[0] = u0;
        p3[1] = u4;
        p3[2] = u7;
        p3[3] = u3;
        p3[4] = u8;
        p3[5] = u9;

        Passenger[] p4 = new Passenger[7];
        p4[0]= u3;
        p4[1]= u2;
        p4[2]= u6;
        p4[3]= u4;
        p4[4]= u5;
        p4[5]= u8;
        p4[6]= u9;


        Vagon v0 = new Vagon();
        Vagon v1 = new Vagon();
        Vagon v2 = new Vagon();
        Vagon v3 = new Vagon();
        Vagon v4 = new Vagon();

        Vagon[] vagons = new Vagon[5];

        vagons[0] = v0;
        vagons[1] = v1;
        vagons[2] = v2;
        vagons[3] = v3;
        vagons[4] = v4;
        v0.setPassengers(p0);
        v0.setNumber(10);
        v0.setMaxPass(5);
        v0.setType("Плацкарт");

        v1.setPassengers(p1);
        v1.setNumber(11);
        v1.setMaxPass(5);
        v1.setType("Плацкарт");

        v2.setPassengers(p2);
        v2.setNumber(12);
        v2.setMaxPass(5);
        v2.setType("Купе");


        v3.setPassengers(p3);
        v3.setNumber(13);
        v3.setMaxPass(5);
        v3.setType("Купе");


        v4.setPassengers(p4);
        v4.setNumber(14);
        v4.setMaxPass(5);
        v4.setType("Плацкарт");




        Train t1 = new Train();
        t1.setName("Хогвардский Экспресс");
        t1.setType("Скоростной");
        t1.setVagons(vagons);

        for (int i = 0; i <vagons.length ; i++) {

            System.out.println(t1.getVagons()[i].getNumber()+ " " +
                    t1.getVagons()[i].getType()+ " " + t1.getVagons()[i].getPassengers().length);

        }
        System.out.println();


        t1.delEmptyVagons();


        for (int i = 0; i <vagons.length ; i++) {
            if(t1.getVagons()[i] != null){
            System.out.println(t1.getVagons()[i].getNumber()+ " " + t1.getVagons()[i].getType()+
                    " " + t1.getVagons()[i].getPassengers().length);
            }

        }
        System.out.println();
        for (int i = 0; i <t1.overfilledVagons().length ; i++) {
            if(t1.overfilledVagons()[i] != null){
                System.out.println(t1.overfilledVagons()[i].getNumber()+ " " + t1.overfilledVagons()[i].getType()+
                        " " + t1.overfilledVagons()[i].getPassengers().length);
            }

        }




    }



}
