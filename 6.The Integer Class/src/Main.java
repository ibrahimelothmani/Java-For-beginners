//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        1. Creating Integer Objects
//        Integer(int value) : Creates an Integer object representing the specified int
//        value.Integer(String s) : Creates an Integer object representing the value of the
//        specified String .
//        Example:
        Integer intObj1 = new Integer(10);
        Integer intObj2 = new Integer("20");
        System.out.println(intObj1);
        System.out.println(intObj2);

//        2. Constants
//        Integer.MAX_VALUE : The maximum value an int can hold ( 2^31 - 1 ).
//        Integer.MIN_VALUE : The minimum value an int can hold ( 2^31 ).
//        Integer.SIZE : The number of bits used to represent an int in two's
//        complement binary form.
//        Integer.BYTES : The number of bytes used to represent an int .
//        Example:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        System.out.println(max);
        System.out.println(min);

//        3. Parsing and Conversion
//        Integer.parseInt(String s) : Parses the string argument as a signed decimal
//        integer.
//        Integer.parseInt(String s, int radix) : Parses the string argument with the
//        specified radix (base).
//        Integer.valueOf(String s) : Returns an Integer object holding the value of the
//        specified String .
//        Integer.valueOf(int i) : Returns an Integer object holding the value of the
//        specified int .
//        Example:
        int num1 = Integer.parseInt("123"); // 123
        int num2 = Integer.parseInt("7B", 16); // 123 in hexadecimal
        Integer intObj = Integer.valueOf("123"); // Integer object with value 123
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(intObj);
        System.out.println("#########################################################");

//        4. Conversion to Other Types
//        intValue() : Returns the value of this Integer as an int .
//        longValue() : Returns the value of this Integer as a long .
//        floatValue() : Returns the value of this Integer as a float .
//        doubleValue() : Returns the value of this Integer as a double .

        Integer intOb = 123;
        int intValue = intOb.intValue(); // 123
        double doubleValue = intOb.doubleValue(); // 123.0
        System.out.println(intValue);
        System.out.println(doubleValue);

        System.out.println("#########################################################");

//        5. Comparisons
//        compareTo(Integer anotherInteger) : Compares two Integer objects numerically.
//        compare(int x, int y) : Compares two int values numerically.
//        equals(Object obj) : Compares this Integer object to the specified object for equality.
//        Example:
        Integer intOB = 100;
        Integer intOB2 = 200;
        int result = intOB.compareTo(intOB2); // -1 (100 is less than 200)
        boolean isEqual = intOB.equals(intOB2); // false
        int comparison = Integer.compare(100, 200); // -1
        System.out.println(result);
        System.out.println(comparison);
        System.out.println(isEqual);
        System.out.println("#########################################################");


//        6. Conversions to Strings and Hash Codes
//        toString() : Returns a string representation of the Integer .
//        hashCode() : Returns a hash code for the Integer .
//        Example:
        Integer intObject = 123;
        String str = intObject.toString(); // "123"
        int hashCode = intObject.hashCode(); // 123 (same as int value)
        System.out.println(str);
        System.out.println(hashCode);
        System.out.println("#########################################################");

//        7. Bit Manipulation Methods
//        bitCount(int i) : Returns the number of one-bits in the two's complement
//        binary representation of the specified int value.
//        highestOneBit(int i) : Returns an int value with at most a single one-bit, in
//        the position of the highest-order ("leftmost") one-bit in the specified int value.
//        lowestOneBit(int i) : Returns an int value with at most a single one-bit, in the
//        position of the lowest-order ("rightmost") one-bit in the specified int value.
//        numberOfLeadingZeros(int i) : Returns the number of zero bits preceding the
//        highest-order one-bit in the two's complement binary representation of the specified int value.
//        numberOfTrailingZeros(int i) : Returns the number of zero bits following the
//        lowest-order one-bit in the two's complement binary representation of the specified int value.
//        reverse(int i) : Returns the value obtained by reversing the order of the bits
//        in the two's complement binary representation of the specified int value.
//        rotateLeft(int i, int distance) : Returns the value obtained by rotating the
//        two's complement binary representation of the specified int value left by
//        the specified number of bits.
//        rotateRight(int i, int distance) : Returns the value obtained by rotating the
//        two's complement binary representation of the specified int value right by
//        the specified number of bits.
//        signum(int i) : Returns the signum function of the specified int value.
//        Example:

        int bitCount = Integer.bitCount(5); // 2 (binary: 101)
        int highestBit = Integer.highestOneBit(5); // 4 (binary: 100)
        int lowestBit = Integer.lowestOneBit(5); // 1 (binary: 001)

        System.out.println(bitCount);
        System.out.println(highestBit);
        System.out.println(lowestBit);

        int a = 20;
        System.out.println(Integer.toHexString(a)); // 14
        System.out.println(Integer.toOctalString(a)); // 24

        System.out.println("##################################################");
    }
}