import exampleClasses.Company;
import exampleClasses.Store;
import exampleClasses.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws  DataMapperException {
        Mapper mapper = null;
        try {
            mapper = new Mapper();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataMapperException();
        }
        User u1 = new User("Kolia", "Loboda", 22, 5000);
        Company c1 = new Company("intel", "Toronto");
//        Store s1 = new Store();
//        mapper.save(u1);
//        mapper.save(u1);
//        mapper.save(c1);
//        mapper.save(c1);
//        mapper.save(c1);
        User u111 = (User)mapper.load(4, User.class);
        System.out.println(u111.getName()+u111.getLname()+u111.getAge()+u111.getSalary());
        System.out.println();
        Company comp = (Company)mapper.load(1, Company.class);
        System.out.println(comp.getName()+comp.getAddress());
    }
}
