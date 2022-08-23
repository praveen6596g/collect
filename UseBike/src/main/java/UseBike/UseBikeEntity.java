package UseBike;

public class UseBikeEntity {
	
   private int id;
	private String name;
	private int hsncode;
	private int price;
    public int getId() { 
	return id;
     }
    public void setId(int id) {
	this.id=id;
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHsncode() {
		return hsncode;
	}
	public void setHsn(int hsncode) {
		this.hsncode = hsncode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;

}
}