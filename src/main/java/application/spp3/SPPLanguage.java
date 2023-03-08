package application.spp3;

import com.intellij.lang.Language;


public class SPPLanguage extends Language {
    public static final SPPLanguage INSTANCE = new SPPLanguage();

    public SPPLanguage() {
        super("SPP");
    }
}
