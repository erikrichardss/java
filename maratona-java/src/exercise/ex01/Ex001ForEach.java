package exercise.ex01;

public class Ex001ForEach {
    public static void main(String[] args) {
        String[] names = new String[] {"Erik", "Maria", "Jose", "Madalena", "Tiago"};

        for (String name : names) {
            System.out.println(name);
            System.out.println(name.length());
        }
    }
}
