package projects.ex09.repository;

public interface Repository <T> {

    void saveElement(T t);

    void listAll();

    T searchById(int id);

    void removeElement(T d);
}
