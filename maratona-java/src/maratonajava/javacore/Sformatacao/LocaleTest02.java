package maratonajava.javacore.Sformatacao;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCoutries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCoutry : isoCoutries) {
            System.out.print(isoCoutry + " ");
        }
        System.out.println();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
    }
}
