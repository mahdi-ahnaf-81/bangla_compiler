// The different kinds of tokens the lexer can produce.
public enum TokenType {
    DHORO,      // keyword: ধরো
    ID,         // user-defined name
    NUMBER,     // numeric literal
    STRING,
    ASSIGN,     // =
    EQ,         // ==
    NEQ,        // !=
    GT,         // >
    LT,         // <
    GTE,        // >=
    LTE,        // <=
    PLUS, MINUS, MUL, DIV,
    LPAREN, RPAREN,
    LBRACE, RBRACE, 
    SEMI,       // ;
    TRUE, FALSE, // boolean literals
    IF,         // যদি
    ELSE,       // নাহলে
    WHILE,      // যতক্ষণ
    PRINT,      // দেখাও
    EOF         
}