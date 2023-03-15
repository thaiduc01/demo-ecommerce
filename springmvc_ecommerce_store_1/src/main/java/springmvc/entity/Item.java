package springmvc.entity;

public class Item {

	private ProductEntity product;
	
	private int quantity;

	public Item() {
		super();
	}

	public Item(ProductEntity product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}