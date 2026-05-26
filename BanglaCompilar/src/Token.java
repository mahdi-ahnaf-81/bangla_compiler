// A token is one piece of the source text after the lexer has broken it up.
// It keeps the token kind, the exact text, and the line number for errors.
public class Token {
    public final TokenType type;
    public final String lexeme;
    public final int line;

    public Token(TokenType type, String lexeme, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.line = line;
    }

    @Override
    public String toString() {
        return "Token{" + "type=" + type + ", lexeme='" + lexeme + '\'' + '}';
    }
}