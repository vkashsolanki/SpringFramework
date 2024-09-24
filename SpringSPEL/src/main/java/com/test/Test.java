package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("test")
public class Test {

	@Value("#{2+3}")
	private int x;
	@Value("#{12+12}")
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
	
	
}
