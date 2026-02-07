/*
====================================================================================================
                           JAVA PRIMITIVE DATA TYPES - REFERENCE TABLE
====================================================================================================

┌──────────────┬──────────┬─────────────────────────────────────────────┬─────────────────────────┐
│  DATA TYPE   │   SIZE   │                    RANGE                    │       DESCRIPTION       │
├──────────────┼──────────┼─────────────────────────────────────────────┼─────────────────────────┤
│   byte       │  1 byte  │  -128 to 127                                │  8-bit signed integer   │
│              │  (8 bit) │  (-2^7 to 2^7 - 1)                          │                         │
├──────────────┼──────────┼─────────────────────────────────────────────┼─────────────────────────┤
│   short      │  2 bytes │  -32,768 to 32,767                          │  16-bit signed integer  │
│              │ (16 bit) │  (-2^15 to 2^15 - 1)                        │                         │
├──────────────┼──────────┼─────────────────────────────────────────────┼─────────────────────────┤
│   int        │  4 bytes │  -2,147,483,648 to 2,147,483,647            │  32-bit signed integer  │
│              │ (32 bit) │  (-2^31 to 2^31 - 1)                        │  (Most commonly used)   │
├──────────────┼──────────┼─────────────────────────────────────────────┼─────────────────────────┤
│   long       │  8 bytes │  -9,223,372,036,854,775,808 to              │  64-bit signed integer  │
│              │ (64 bit) │   9,223,372,036,854,775,807                 │  (Use 'L' suffix:       │
│              │          │  (-2^63 to 2^63 - 1)                        │   e.g., 123456789L)     │
├──────────────┼──────────┼─────────────────────────────────────────────┼─────────────────────────┤
│   float      │  4 bytes │  Approximately ±3.40282347E+38F             │  32-bit IEEE 754        │
│              │ (32 bit) │  (6-7 significant decimal digits)           │  floating point         │
│              │          │                                             │  (Use 'f' suffix:       │
│              │          │                                             │   e.g., 3.14f)          │
├──────────────┼──────────┼─────────────────────────────────────────────┼─────────────────────────┤
│   double     │  8 bytes │  Approximately ±1.79769313486231570E+308    │  64-bit IEEE 754        │
│              │ (64 bit) │  (15 significant decimal digits)            │  floating point         │
│              │          │                                             │  (Default for decimals) │
├──────────────┼──────────┼─────────────────────────────────────────────┼─────────────────────────┤
│   char       │  2 bytes │  0 to 65,535                                │  16-bit Unicode         │
│              │ (16 bit) │  ('\u0000' to '\uffff')                     │  character              │
│              │          │                                             │  (Use single quotes:    │
│              │          │                                             │   e.g., 'A')            │
├──────────────┼──────────┼─────────────────────────────────────────────┼─────────────────────────┤
│   boolean    │  1 bit*  │  true or false                              │  Represents logical     │
│              │          │                                             │  values only            │
│              │          │                                             │  *Size is JVM-dependent │
└──────────────┴──────────┴─────────────────────────────────────────────┴─────────────────────────┘

====================================================================================================
                              DEFAULT VALUES (for class/instance variables)
====================================================================================================

    byte    → 0
    short   → 0
    int     → 0
    long    → 0L
    float   → 0.0f
    double  → 0.0d
    char    → '\u0000' (null character)
    boolean → false

====================================================================================================
                                        USAGE EXAMPLES
====================================================================================================

    byte age = 25;
    short year = 2024;
    int population = 1000000;
    long nationalDebt = 9223372036854775807L;
    float pi = 3.14159f;
    double scientificValue = 1.23456789012345;
    char grade = 'A';
    boolean isJavaFun = true;

====================================================================================================
                                        IMPORTANT NOTES
====================================================================================================

    • Local variables do NOT have default values and must be initialized before use
    • Wrapper classes exist for each primitive: Byte, Short, Integer, Long, Float, Double, 
      Character, Boolean
    • Use 'L' or 'l' suffix for long literals (uppercase L is preferred for clarity)
    • Use 'f' or 'F' suffix for float literals
    • char in Java is unsigned and uses Unicode (unlike C/C++)
    • boolean size is not precisely defined; it's JVM implementation-dependent

====================================================================================================
*/
public class datatype {

    public static void main(String[] args) {

        // Integer types
        byte b = 100;                 // 1 byte
        short s = 32000;              // 2 bytes
        int i = 1000000;              // 4 bytes
        long l = 9000000000L;         // 8 bytes (L is required)

        // Floating-point types
        float f = 3.14f;              // 4 bytes (f is required)
        double d = 3.14159265358979;  // 8 bytes (default)

        // Character type
        char c = 'A';                 // single character
        char unicodeChar = '\u263A';  // ☺ Unicode example

        // Boolean type
        boolean isJavaFun = true;

        // Printing values
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("unicode char: " + unicodeChar);
        System.out.println("boolean value: " + isJavaFun);
    }
}
