package com.testebetaweb.CursoSpring.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT (0), //0
	PAID(1),//1
	SHIPPED(2),//2
	DELIVERED(3),//3
	CANCELED(4);//4
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getcode() {
		return code;
	}
	
	public static OrderStatus valueOF(int code) {
		for (OrderStatus value: OrderStatus.values()) {
			if( value.getcode() == code) {
				return value;
			} 
		}
		throw new IllegalArgumentException("Codigo Invalido");
	}
}
