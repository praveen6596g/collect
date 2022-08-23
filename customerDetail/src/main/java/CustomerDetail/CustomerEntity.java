package CustomerDetail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_table")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private int id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(int ifsccode) {
		this.ifsccode = ifsccode;
	}
	private String branch;
	private String name;
	private int ifsccode;

}
