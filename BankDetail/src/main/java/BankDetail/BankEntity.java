package BankDetail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bank_detail")
public class BankEntity {
	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
	    private String branch;
	    private int ifsccode;
		
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public int getIfsccode() {
			return ifsccode;
		}
		public void setIfsccode(int ifsccode) {
			this.ifsccode = ifsccode;
			}
}











