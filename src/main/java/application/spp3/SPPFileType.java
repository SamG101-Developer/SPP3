package application.spp3;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;


public class SPPFileType extends LanguageFileType {
    public static final SPPFileType INSTANCE = new SPPFileType();

    public SPPFileType() {
        super(SPPLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "SPP";
    }

    @Override
    public @NotNull String getDescription() {
        return "SPP language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "spp";
    }

    @Override
    public Icon getIcon() {
        return null;
    }
}
