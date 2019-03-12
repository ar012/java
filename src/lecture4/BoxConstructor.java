package lecture4;

public class BoxConstructor {

	double width;
	double height;
	double depth;
	
	
	public BoxConstructor() {
		this.width = 1;
		this.height = 1;
		this.depth = 1;
	}
	
	public BoxConstructor(int width) {
		this.width = width;
		this.height = width;
		this.depth = width;
	}
	
	
	public BoxConstructor(double width) {
		this.width = width;
		this.height = width;
		this.depth = width;
	}
	
	public BoxConstructor(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	

	
	public void printBox() {
		System.out.println("Width: " + width + ", Height = " + height + ", Depth = " + depth + ", Volume = " + volume());
	}
	

	public double  volume() {
		return width * height * depth;
	}
	
//	private double  volume() {
//		return width * height * depth;
//	}
	
//	protected double  volume() {
//		return width * height * depth;
//	}

}