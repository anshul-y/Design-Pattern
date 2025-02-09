package pattern.structural.bridge;

import java.math.BigInteger;
import java.util.Arrays;

public class BridgePattern {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(trailingZeroes(5745));
        int n  = 5745;
        int res = 0;
        while (n > 0) {
            n /= 5; // Count multiples of 5, 25, 125, etc.
            res += n;
        }
        System.out.println(res);
    }

    public static int trailingZeroes(int n) {
        int trailingZero = 0;
        BigInteger num = factorial(BigInteger.valueOf(n));
        while (num.compareTo(BigInteger.valueOf(0)) > 0) {
            if (num.remainder(BigInteger.valueOf(10)) == BigInteger.valueOf(0)) {
                trailingZero++;
            } else {
                break;
            }
            num = num.divide(BigInteger.valueOf(10));
        }
        return trailingZero;
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.intValue() == 0 || n.intValue() == 1)
            return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static int[] plusOne(int[] digits) {
        int carryNum = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + carryNum;
            carryNum = num / 10;
            digits[i] = num % 10;
        }
        int arrSize = digits.length;
        if (carryNum > 0) {
            arrSize++;
        }
        int[] resArr = new int[arrSize];
        if (digits.length != arrSize) resArr[0] = carryNum;
        for (int i = carryNum; i < digits.length; i++) {
            resArr[i] = digits[i];
        }
        return resArr;
    }

}
