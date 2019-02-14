package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		return;
	}

	@Override
	public void resize(double rate) {
		width = width*rate;
		height = height*rate;
	}

	@Override
	public double getArea() {
		return 0.;
	}

	@Override
	public double getPerimeter() {
		return 0.;
	}
}