package com.shape;
public class ShapedrawingApp {
	
	public static void main(String args[]) {
		DrawApplication canvas=(DrawApplication) new BasicCanvas();
		Shape Hexagon=new Hexagon();
		Shape Rectangle=new Rectangle();
		Shape triangle=new triangle();
		canvas.drawShape(Hexagon);
		canvas.drawShape(Rectangle);
		canvas.drawShape(triangle);
	}
	

}
