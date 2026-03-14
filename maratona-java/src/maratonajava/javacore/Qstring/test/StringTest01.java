package maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Erik"; // String constant pool
        String nome2 = "Erik";
        nome = nome.concat(" Richard"); // nome += " Richard"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Erik");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
