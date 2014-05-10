import java.util.ArrayList;

public interface DataMapper {
    public static void save(Object obj) throws DataMapperException{};
    public static Object load(long id, Class clazz) throws DataMapperException{
        return null;
    };
    public static ArrayList<Object> loadAll(Class clazz){
        return null;
    };
    public static void update(long id, Object obj){};

}
