package banking;

public class GrantWithdrawlImpl implements GrantWithdrawalStrategy {
	
	private int daysSinceLastTransaction;
	
	public GrantWithdrawlImpl() {
		this.daysSinceLastTransaction = 0;
	}

	@Override
	public boolean transaction(long endingBalance, long overdraftAllowed) {
		if (endingBalance < overdraftAllowed) {
			return false;
		}
		this.daysSinceLastTransaction ++;
		return true;
	}

	@Override
	public boolean allowedMonthlyTransaction() {
		if (this.daysSinceLastTransaction <= 31)
			return false;
		else {
			this.daysSinceLastTransaction = 0;
			return true;
		}
	}

}
