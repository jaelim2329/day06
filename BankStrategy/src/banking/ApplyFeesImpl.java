package banking;

public class ApplyFeesImpl implements ApplyFeesStrategy {
	
	private long transactionFee;
	private int transactionCount;
	private int daysSinceLastTransaction;
	
	public ApplyFeesImpl(long transactionFee) {
		this.transactionFee = transactionFee;
		this.transactionCount = 0;
		this.daysSinceLastTransaction = 0;
	}
	
	public void transaction() {
		if (this.daysSinceLastTransaction > 31) {
			this.transactionCount = 0;
			this.daysSinceLastTransaction = 0; 
		}
		
		this.transactionCount ++;
		this.daysSinceLastTransaction ++;
	}
	
	

	@Override
	public long feesAppliedCredit(long creditBalance, long transactionAmount) {
		if (transactionAmount > creditBalance){
			return transactionFee;
		}
		return 0;
	}

	@Override
	public long feesAppliedTime() {
		if (this.transactionCount > 5 && this.daysSinceLastTransaction <= 31) {
			return transactionFee;
		}
		return 0;
	}

}
