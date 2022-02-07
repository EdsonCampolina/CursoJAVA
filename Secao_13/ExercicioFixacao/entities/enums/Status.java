package entities.enums;

public enum Status {
	PENDING_PAYMENT("Pending payment"), PROCESSING("Processing"), SHIPPED("Shipped"), DELIVERED("Delivered");

	public String descOrderStatus;

	Status(String value) {
		descOrderStatus = value;
	}

	public String getStatus() {
		return this.descOrderStatus;
	}
}
