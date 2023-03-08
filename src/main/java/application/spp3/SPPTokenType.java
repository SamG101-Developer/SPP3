package application.spp3;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;


public class SPPTokenType extends IElementType {
    public SPPTokenType(@NonNls @NotNull String debugName) {
        super(debugName, SPPLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SPPTokenType." + super.toString();
    }
}
