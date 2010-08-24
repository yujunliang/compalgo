package loan.atomic;

import com.google.common.base.Function;
import loan.domain.Amount;
import loan.domain.Loan;

import static loan.domain.FinancialCalculator.monthlyPayment;

public class MonthlyPaymentCalculation implements Function<Loan, Loan>{

    @Override
    public Loan apply(Loan loan) {
        loan.setMonthPayment(
               Amount.valueOf(
                       monthlyPayment(loan.getRate().doubleValue(),
                               loan.getTerm()*12,
                               loan.getPrincipal().doubleValue())
                       )
        );
        return loan;
    }    
}