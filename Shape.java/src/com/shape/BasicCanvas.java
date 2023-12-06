package com.shape;
public class BasicCanvas implements DrawApplication {

	@Override
	public void drawShape(Shape shape) {
		shape.draw();
	}
}
