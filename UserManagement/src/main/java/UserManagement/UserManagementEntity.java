package UserManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class UserManagementEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private   String username;
	private   long   aadhaarnumber;
	private   String address;
	private   int    gst;
	private   long    purchaseamount;
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getAadhaarnumber() {
		return aadhaarnumber;
	}
	public void setAadhaarnumber(long aadhaarnumber) {
		this.aadhaarnumber = aadhaarnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public long getPurchaseAmount() {
		return purchaseamount;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseamount = purchaseAmount;

	}
	}



