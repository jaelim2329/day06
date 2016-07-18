package banking;

public interface GrantWithdrawalStrategy {
	
	public boolean transaction(long endingBalance, long overdraftAllowed);
	
	public boolean allowedMonthlyTransaction(); 
	

}
