package maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do banco de dados.");
    }

    public static void retrieveMaxDataBaseSize() {
        System.out.println("Dentro do retrieveMaxDataBaseSize na classe DataBaseLoader ");
    }
}
