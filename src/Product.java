
public class Product {

    private int Product_ID;
    private String Type;
    private String Manufacturer;
    private String Production_Date;
    private String Expiry_Date;

    public int getProduct_ID() {
		return Product_ID;
	}
	
    public void setProduct_ID(int product_ID) {
		this.Product_ID = product_ID;
	}
	public String getType() {
		return (this.Type);
	}
	public void setType(String type) {
		this.Type = type;
	}
	public String getManufacturer() {
		return (this.Manufacturer);
	}
	public void setManufacturer(String manufacturer) {
		this.Manufacturer = manufacturer;
	}
	public String getProduction_Date() {
		return (this.Production_Date);
	}
	public void setProduction_Date(String production_Date) {
		this.Production_Date = production_Date;
	}
	public String getExpiry_Date() {
		return (this.Expiry_Date);
	}
	public void setExpiry_Date(String expiry_Date) {
		this.Expiry_Date = expiry_Date;
	}

}
