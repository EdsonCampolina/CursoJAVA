package entities;

public class OrderItem {

	private String name;
	private Integer quantity;
	private Double price;
	private Product product;

	public OrderItem(Integer quantity, Product product) {
		this.name = product.getName();
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public Double subTotal() {
		return price * quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + ", $" + String.format("%.2f", this.price) + ", Quantity: " + this.quantity
				+ ", Subtotal: $" + String.format("%.2f", this.subTotal()) + "\n");
		return sb.toString();
	}

}
