package com.capgemini.order.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ITEMS")
public class LineItem {
	@Id
	@GeneratedValue
	private int itemId;
//	private int orderId;
	private int quantity;
	private int productId;
	@ManyToOne
	@JoinColumn(name="order_id", nullable=false)
	private Order order;

	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LineItem(int itemId, int quantity, int productId, Order order) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.productId = productId;
		this.order = order;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}


}