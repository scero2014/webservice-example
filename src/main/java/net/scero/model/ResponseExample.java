package net.scero.model;

import lombok.Data;

@Data
public class ResponseExample {
	private String operation;
	private String message;
	private int result;
}
