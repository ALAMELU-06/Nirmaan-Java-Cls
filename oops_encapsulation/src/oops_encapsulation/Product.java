package oops_encapsulation;

public class Product {
	    private int productId;
	    private String productName;
	    private long price;
	    private int quantity;

	   
	    public Product() {
	    }
	    
	    public Product(int productId, String productName, long price, int pQuantity) {
	    	super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.quantity = pQuantity;
		}

		
		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public long getPrice() {
			return price;
		}

		public void setPrice(long price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	    
	    }

