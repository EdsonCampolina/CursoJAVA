package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Status;

public class OrderEX {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private Status status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;

	public OrderEX(Client client, Status status) {
		this.client = client;
		this.status = status;
		this.moment = new Date();
	}

	public Double total() {
		Double total = 0.0;
		for (OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem orderItem) {
		items.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		items.remove(orderItem);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + this.status.getStatus() + "\n");
		sb.append(client);
		sb.append("Order items:\n");
		Double price = 0.0;
		for (OrderItem item : items) {
			sb.append(item);
			price += item.subTotal();
		}
		sb.append("Total price: $" + price);
		return sb.toString();
	}

}
