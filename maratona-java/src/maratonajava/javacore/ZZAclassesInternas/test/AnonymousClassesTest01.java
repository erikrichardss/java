package maratonajava.javacore.ZZAclassesInternas.test;

class Animal {

    public  void walk() {

        System.out.println("Animal Walking");
    }
}

public class AnonymousClassesTest01 {

    void apSystem(final String param) {

        class ClassAnonymous {

            public void insideOfSystem() {

            }
        }
    }
    public static void main(String[] args) {

        Animal animal = new Animal() {

            @Override
            public void walk() {

                System.out.println("Walking in the shadows");
            }
        };

        animal.walk();
    }
}
