package HomeWork1;

public class Application {


    /**
     * Performs summary of byte and short values
     *
     * @param byteValue  byte primitive type
     * @param shortValue short primitive type
     * @return byte primitive type
     */
    public static byte SumByteShort(byte byteValue, short shortValue) {
        return (byte) (byteValue + shortValue);
    }

    /**
     * Performs multiplying of int and long values
     *
     * @param intValue  int primitive type
     * @param longValue long primitive type
     * @return int primitive type
     */
    public static int MultiIntLong(int intValue, long longValue) {
        return (int) (intValue * longValue);
    }

    /**
     * Returns maximum number from two values
     *
     * @param firstValue  int primitive type
     * @param secondValue int primitive type
     * @return int primitive type
     */
    public static int getMaxNumber(int firstValue, int secondValue) {
        return Math.max(firstValue, secondValue);
    }

    /**
     * If input character equals 'A', return true, else - false
     *
     * @param charValue char primitive type
     * @return boolean type
     */
    public static boolean isCharA(char charValue) {
        return charValue == 'A';
    }

    /**
     * If input character is a digit, return true, else - false
     *
     * @param charValue char primitive type
     * @return boolean type
     */
    public static boolean isCharNumber(char charValue) {
        return Character.isDigit(charValue);
    }

    /**
     * Print binary string of digit numbers from 0 to 30
     */
    public static void digitToBinaryString() {
        for (int i = 0; i < 31; i++) {
            System.out.println("Бинарное представление числа " + i + " = " + Integer.toBinaryString(i));
        }
    }

    /**
     * Print result of Integer.toBinaryString(Integer.MAX_VALUE)) and Integer.toBinaryString(Integer.MAX_VALUE + 1))
     */
    @SuppressWarnings("NumericOverflow")
    public static void maxNumberToBinaryString() {
        System.out.println("Бинарное представление числа Integer.MAX_VALUE = " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Бинарное представление числа Integer.MAX_VALUE + 1 = " + Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    /**
     * Returns char symbol as integer value
     *
     * @param charValue char primitive type
     * @return int primitive type
     */
    public static int charToInt(char charValue) {
        return charValue;
    }

    /**
     * Returns int value as char symbol
     *
     * @param intValue int primitive type
     * @return char primitive type
     */
    public static char intToChar(int intValue) {
        return (char) intValue;
    }

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 1000;
        int intValue = 100_000;
        long longValue = 100_000_000_000L;

        int firstValue = 1;
        int secondValue = 2;
        int thirdValue = 55;

        char charValue = '7';

        System.out.println("Сумма " + byteValue + " + " + shortValue + " = " + SumByteShort(byteValue, shortValue));
        System.out.println("Умножение " + intValue + " * " + longValue + " = " + MultiIntLong(intValue, longValue));
        System.out.println("Максимум из " + firstValue + " и " + secondValue + " = " + getMaxNumber(firstValue, secondValue));
        System.out.println("Сравнение '" + charValue + "' и 'A' = " + isCharA(charValue));
        System.out.println("Проверка '" + charValue + "' на цифровое значение = " + isCharNumber(charValue));

        digitToBinaryString();
        maxNumberToBinaryString();

        System.out.println("Числовое представление символа '" + charValue + "' = " + charToInt(charValue));
        System.out.println("Символьное представление числа " + thirdValue + " = '" + intToChar(thirdValue) + "'");

    }
}

