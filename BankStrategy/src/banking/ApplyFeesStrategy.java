package banking;

public interface ApplyFeesStrategy {

	public long feesAppliedCredit(long creditBalance, long transactionAmount);
	
	public long feesAppliedTime();
}
