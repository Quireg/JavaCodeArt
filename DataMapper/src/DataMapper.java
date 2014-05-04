
public interface DataMapper {
    public void save(Object obj) throws DataMapperException;
    public Object load(long id, Class clazz) throws DataMapperException;
    public Object loadAll(Class clazz);
    public void update(long id, Object obj);

}
