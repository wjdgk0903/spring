package domain.entity;

import domain.value.Address;
import lombok.Getter;

@Getter
public class Delivery {
	private Long id;
	private Order order;
	private Address address;

}
