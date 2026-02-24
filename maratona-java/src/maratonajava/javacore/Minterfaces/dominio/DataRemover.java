package maratonajava.javacore.Minterfaces.dominio;

public interface DataRemover {
    public abstract void remove();

    default void checkPermission() {
        System.out.println("Fazendo a checagem de permissões. ");
    }
}
