package com.example.loanapp;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="loandetails")
public class LoanEntity {
	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		private String customerName;
	    private int loanAmount;
	    private int loanNumber;
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public int getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(int loanAmount) {
			this.loanAmount = loanAmount;
		}
		public int getLoanNumber() {
			return loanNumber;
		}
		public void setLoanNumber(int loanNumber) {
			this.loanNumber = loanNumber;
		}
		
	   
}




