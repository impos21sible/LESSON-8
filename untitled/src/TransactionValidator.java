public class TransactionValidator {

    public static boolean isValidAmount(Double amount)
    {
        final Double MIN_AMOUNT = 1.0;
        final Double MAX_AMOUNT  = 5000.0;

        if (amount < MIN_AMOUNT || amount > MAX_AMOUNT)
        {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return  false;

        }



        return true;
    }
}
