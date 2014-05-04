
public interface DataMapper {
    public void save(Object obj) throws DataMapperException;
    public Object load(long id, Class clazz);
    public Object loadAll(Class clazz);
    public void update(long id, Object obj);

}
