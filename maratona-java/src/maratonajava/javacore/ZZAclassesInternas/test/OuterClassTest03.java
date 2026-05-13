package maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassTest03 {
    private String name = "Erik";
    static class Nested {
        private String lastName = "Richard";
        void print() {
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {

        OuterClassTest03.Nested nested = new Nested();
        nested.print();
    }
}
