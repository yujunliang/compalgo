package loan.atomic;

import com.google.common.base.Predicate;
import loan.domain.Loan;

import static algocraft.util.Logic.not;

public final class PayLoanApplicationFeePredicate implements Predicate<Loan> {

	@Override
	public boolean apply(final Loan loan) {
		return not(loan.isBorrowLoanApplicationFee());
	}
}