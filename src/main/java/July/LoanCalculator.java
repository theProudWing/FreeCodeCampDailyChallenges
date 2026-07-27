/**
 * Created by: Ben Jones
 * Date:24/07/2026
 * Time:08:44
 */

package main.java.July;

import java.util.ArrayList;

public class LoanCalculator {

    /**
     * FreeCodeCamp Daily Challenge - 24-07-2026
     * <p>Given a loan amount, annual interest rate %, and fixed monthly payment, returns an array of the amount outstanding
     * after each payment.</p>
     * <ul>
     *     <li>Each month, interest is calculated on the remaining balance using the monthly interest rate:
     *     (annual rate / 100) / 12, then the monthly payment is subtracted.</li>
     *     <li>Return each remaining balance rounded to the nearest dollar.</li>
     *     <li>Include the loan amount in the returned array. The first element in the array will always be the loan amount,
     *     and the last element of the array will always be 0.</li>
     * </ul>
     * @param amountBorrowed the total amount borrowed
     * @param annualInterestRate the annual interest rate, represented as a %
     * @param monthlyPayment the fixed amount to be paid back each month
     * @return a forecast of outstanding amounts (rounded to the nearest dollarpound) after each monthly payment until the loan is paid off.
     */
    public static int[] getLoanSchedule(final double amountBorrowed, final double annualInterestRate, final double monthlyPayment){
        // While loop, ends when outstanding amount <= 0
        // Each loop:   Calculate interest
        //              Add interest to outstanding amount
        //              Reduce amount by monthlyPayment
        //              Add outstanding balance (rounded) to Schedule ArrayList UNLESS less than 0, then add 0

        double amountOutstanding = amountBorrowed;
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        ArrayList<Integer> paymentSchedule = new ArrayList<>();

        paymentSchedule.add((int) Math.round(amountOutstanding));

        while (amountOutstanding > 0){
            double monthlyInterest = monthlyInterestRate * amountOutstanding; // calculate interest
            amountOutstanding += monthlyInterest;                             // add interest to amount outstanding
            amountOutstanding -= monthlyPayment;                              // make monthly payment
            if (amountOutstanding < 0){
                paymentSchedule.add(0);                                       // outstanding balance is 0
            } else {
                paymentSchedule.add((int) Math.round(amountOutstanding));     // add amount outstanding to schedule
            }
        }

        return paymentSchedule.stream().mapToInt(i -> i).toArray();
    }
}
