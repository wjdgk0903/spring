package domain.entity;

import lombok.Getter;

@Getter
public class OrderItem {
	private Long id;
	private Item item;
	private Order order;
	private int orderPrice;
	private int count;
}
