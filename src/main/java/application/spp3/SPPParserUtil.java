package application.spp3;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.openapi.util.Key;
import com.intellij.psi.TokenType;


// https://github.com/kandeshvari/idea-nim/blob/master/src/org/dmitrigb/ideanim/parser/ParserUtil.java


public class SPPParserUtil extends GeneratedParserUtilBase {
    private static class ParserState {
        private final PsiBuilder builder;
        private int currentIndent = 0;

        ParserState(PsiBuilder builder) {
            this.builder = builder;
        }

        private String getPrecedingWhiteSpace() {
            // Get the offset of the current token (where the parser is currently at) -- this is where the token starts.
            var wsOffset = 0;

            // While the current token is a white space token, decrement the offset by 1. This will move the offset to
            // the last non-[white space] token.
            while (builder.rawLookup(wsOffset - 1) == TokenType.WHITE_SPACE)
                --wsOffset;

            // Get the start of the token, and return the sub text of the original text from the start of the token to
            // the current offset. This will return the whitespace preceding the token.
            var wsStart = builder.rawTokenTypeStart(wsOffset);
            return builder.getOriginalText().subSequence(wsStart, builder.getCurrentOffset()).toString();
        }

        int getTokenIndent() {
            // Otherwise, calculate the indent of the token, cache it, and return it. Start the indent at -1, which
            // indicates that the token is not indented. Then, get the preceding whitespace, and find the last newline
            // character.
            var indent = -1;
            var ws = getPrecedingWhiteSpace();
            var nlPos = ws.lastIndexOf('\n');

            // If there is a newline character, then the indent is the length of the whitespace minus the position of
            // the newline character minus 1 (to account for the newline character itself).
            if (nlPos != -1)
                indent = ws.length() - nlPos - 1;

            // Return the indent of the token.
            return indent;
        }
    }

    private static Key<ParserState> parserStateKey = new Key<>("parser-state");

    private static ParserState getParserState(PsiBuilder builder) {
        return builder.getUserData(parserStateKey);
    }

    public static boolean indented(PsiBuilder builder, int level, Parser parser) {
        // Get the parser state, and the token indent
        var state = getParserState(builder);
        var tokIndent = state.getTokenIndent();

        // If the token is indented (it is more indented than the current token), then begin the parsing procedure for
        // that token, and return the result of parsing it (true if it was parsed successfully, false otherwise) --
        // propagating the result up the stack.
        if (tokIndent > state.currentIndent) { // TODO: && tokIndent % 4 == 0

            // Save the current indent as the previous indent (will restore later).
            var prevIndent = state.currentIndent;

            // Set the current indent to the token indent, parse the token, and restore the current indent to the
            // previous indent (ie the original current indent).
            state.currentIndent = tokIndent;
            var result = parser.parse(builder, level + 1);
            state.currentIndent = prevIndent;

            // Return the result of parsing the token.
            return result;
        }

        // If the token is not indented, then return false, indicating that the token was not parsed successfully.
        return false;
    }
}