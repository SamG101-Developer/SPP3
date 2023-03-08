package application.spp3;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SPPElementType extends IElementType {
    public SPPElementType(@NotNull @NonNls String debugName) {
        super(debugName, SPPLanguage.INSTANCE);
    }
}
