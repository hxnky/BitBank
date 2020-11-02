package member;

public class Account {

    private String AccountNumber; // 계좌번호
	 private String name;         // 이름
	 private String password;     // 계좌 비밀번호
	 private long balance;		  // 잔액
	private int totalTrans;	// 횟수
	 private static Account AccountArray[] = new Account[100];
	 
	 //생성자
	 public Account (String AccountNumber, String name, String password, long balance, int totalTrans) {      
	 this.AccountNumber = AccountNumber;
	 this.name = name;
	 this.password = password;
	 this.balance = balance;
	 this.totalTrans = totalTrans;
	 }

	 
	//getter & setter 메서드
	 
	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String AccountNumber) {
		this.AccountNumber = AccountNumber;
	}

	public String getAccountName() {
		return name;
	}

	public void setAccountName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	private String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	} 
	 
	public int getTotalTrans() {
		return totalTrans;
	}

	public void setTotalTrans(int totalTrans) {
		this.totalTrans = totalTrans;
	}

}