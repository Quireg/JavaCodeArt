import java.util.HashMap;
import java.util.HashSet;

public class EntityCache {

    static private HashMap entityCache = new HashMap<>();
    static private HashSet<String> keys = new HashSet<>();

    public static void saveToCache(long id, Object obj){
         String key = obj.getClass().getSimpleName() + id;
         keys.add(key);
         entityCache.put(key, obj);
    }
    public static Object loadFromCache(Object obj, long id){
        String key = obj.getClass().getSimpleName() + id;

        return entityCache.get(key);
    }
    public static void saveCache(){
        for (String key : keys) {

        }

    }
}
