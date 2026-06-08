package oops;

public class BankApplication {
	
	
		private String Name;
		private int AcctNo;
		private String BranchName;
		private String PhNo;
		private String Ifsc; 
		private String AcctType;
		private boolean isActive;
		private int balance;
		
		public BankApplication()
		{}	
		
		public BankApplication(String name, int acctNo, String branchName, String phNo, String ifsc, String acctType,
				boolean isActive, int balance) {
			super();
			this.Name = name;
			this.AcctNo = acctNo;
			this.BranchName = branchName;
			this.PhNo = phNo;
			this.Ifsc = ifsc;
			this.AcctType = acctType;
			this.isActive = isActive;
			this.balance = balance;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public long getAcctNo() {
			return AcctNo;
		}

		public void setAcctNo(int acctNo) {
			AcctNo = acctNo;
		}

		public String getBranchName() {
			return BranchName;
		}

		public void setBranchName(String branchName) {
			BranchName = branchName;
		}

		public String getPhNo() {
			return PhNo;
		}

		public void setPhNo(String phNo) {
			PhNo = phNo;
		}

		public String getIfsc() {
			return Ifsc;
		}

		public void setIfsc(String ifsc) {
			Ifsc = ifsc;
		}

		public String getAcctType() {
			return AcctType;
		}

		public void setAcctType(String acctType) {
			AcctType = acctType;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
		
	}


