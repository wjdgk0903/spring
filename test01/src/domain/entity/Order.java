package domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;

@Getter
public class Order {
	private Long id;
	private Member member;
	private Delivery delivery;
	private Date orderDate;
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public void addOrderItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
}
