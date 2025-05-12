//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Common Constants:
//        Math.PI : The value of π (pi), approximately 3.14159.Math.E : The value of e (Euler's number), approximately 2.71828.
//        Common Methods:
//        1. Basic Arithmetic:
//        Math.abs(x) : Returns the absolute value of x .
//        Math.max(a, b) : Returns the larger of a and b .Math.min(a, b) : Returns the smaller of a and b .
//        2. Power and Exponential:
//        Math.pow(a, b) : Returns a raised to the power of b (a^b).Math.sqrt(x) : Returns the square root of x .
//        Math.cbrt(x) : Returns the cube root of x .
//        Math.exp(x) : Returns e^x.
//        3. Logarithms:
//        Math.log(x) : Returns the natural logarithm (base e) of x .
//        Math.log10(x) : Returns the logarithm base 10 of x .
//        Math.log1p(x) : Returns the natural logarithm of 1+x.
//        4. Trigonometric Functions:
//        Math.sin(x) : Returns the sine of x (in radians).Math.cos(x) : Returns the cosine of x (in radians).Math.tan(x) : Returns the tangent of x (in radians).Math.asin(x) : Returns the arc sine of x (in radians).
//        Math.acos(x) : Returns the arc cosine of x (in radians).
//        Math.atan(x) : Returns the arc tangent of x (in radians).
//        5. Rounding and Remainder:
//        Math.round(x) : Returns the closest long to the argument.
//        Math.ceil(x) : Returns the smallest integer that is greater than or equal to x .
//        Math.floor(x) : Returns the largest integer that is less than or equal to x .
//        Math.rint(x) : Returns the double value that is closest to x and is equal to a mathematical integer.
//        Math.random() : Returns a random double value between 0.0 and 1.0.


        // Basic Arithmetic
        int absValue = Math.abs(-10); // 10
        int maxVal = Math.max(10, 20); // 20
        int minVal = Math.min(10, 20); // 10
        // Power and Exponential
        double power = Math.pow(2, 3); // 8.0
        double sqrt = Math.sqrt(16); // 4.0
        double exp = Math.exp(1); // 2.718281828459045
        // Trigonometric Functions
        double sinVal = Math.sin(Math.PI / 2); // 1.0
        double cosVal = Math.cos(0); // 1.0
        double tanVal = Math.tan(Math.PI / 4); // 1.0
        // Logarithms
        double logVal = Math.log(10); // 2.302585092994046
        double log10Val = Math.log10(10); // 1.0
        // Rounding and Remainder
        long roundVal = Math.round(2.5); // 3
        double ceilVal = Math.ceil(2.1); // 3.0
        double floorVal = Math.floor(2.9); // 2.0
        System.out.println("absValue: " + absValue);
        System.out.println("maxVal: " + maxVal);
        System.out.println("minVal: " + minVal);
        System.out.println("power: " + power);
        System.out.println("sqrt: " + sqrt);
        System.out.println("exp: " + exp);
        System.out.println("sinVal: " + sinVal);
        System.out.println("cosVal: " + cosVal);
        System.out.println("tanVal: " + tanVal);
        System.out.println("logVal: " + logVal);
        System.out.println("log10Val: " + log10Val);
        System.out.println("roundVal: " + roundVal);
        System.out.println("ceilVal: " + ceilVal);
        System.out.println("floorVal: " + floorVal);

    }
}