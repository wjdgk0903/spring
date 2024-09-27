package domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	private Long id;
	private Member member;
	private String city;
	private String street;
	private String zipcode;
	private Date order_date;
	private List<OrderItem> orderItems = new ArrayList<>();
	public void addOrderItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
}
