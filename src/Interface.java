public interface Interface <T>{
    void add(T t);

    void delete(String name);

    void update(String name,T t);

    void display();

    int findByName(String name);
}
