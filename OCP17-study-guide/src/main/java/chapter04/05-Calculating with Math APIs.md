# Calculating with Math APIs

## Finding the Minimum and Maximum

The min() and max() methods compare two values and return one of them.

    public static double min(double a, double b) 
    public static float min(float a, float b)
    public static int min(int a, int b)
    public static long min(long a, long b)

The max() method works the same way, except it returns the larger value.

    int first = Math.max(3, 7); // 7 
    int second = Math.min(7, -9); // -9

## Rounding Numbers

The round() method gets rid of the decimal portion of the value, choosing the next higher number if appropriate. If the
fractional part is .5 or higher, we round up.

    public static long round(double num)
    public static int round(float num)

    long low = Math.round(123.45); // 123
    long high = Math.round(123.50); // 124
    int fromFloat = Math.round(123.45f); // 123

## Determining the Ceiling and Floor

The ceil() method takes a double value. If it is a whole number, it returns the same value. If it has any fractional
value, it rounds up to the next whole number. By contrast, the floor() method discards any values after the decimal.

    public static double ceil(double num) 
    public static double floor(double num)

## Calculating Exponents

The pow() method handles exponents.

    public static double pow(double number, double exponent)

    double squared = Math.pow(5, 2); // 25.0

## Generating Random Numbers

The random() method returns a value greater than or equal to 0 and less than 1. The method signature is as follows:

    public static double random()

    double num = Math.random();

