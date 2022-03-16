package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}	
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus val : OrderStatus.values()) {
			if (val.getCode() == code) {
				return val;
			}
		}
		throw new IllegalArgumentException("Invalid order status code!");
	}
	
}
