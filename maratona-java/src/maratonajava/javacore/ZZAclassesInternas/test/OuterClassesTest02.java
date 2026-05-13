package maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest02 {

    private String nome = "Midoriya";

    void print(final String param) {

        class LocalClass {

            final String lastName = "Isuku";

            public void printLocal() {

                System.out.println(param);
                System.out.println(nome + " " + lastName);
            }
        }

        new LocalClass().printLocal();
    }

    public static void main(String[] args) {

        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("Param");
    }
}
