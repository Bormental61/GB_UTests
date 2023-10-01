public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0 || discountAmount > 99)
            throw new ArithmeticException("Wrong input: Discount should be between 0 and 100");
        return purchaseAmount - purchaseAmount * ((double) discountAmount / 100);
    }
}
