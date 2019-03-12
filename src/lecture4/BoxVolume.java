package lecture4;

public class BoxVolume {
	public static void main(String[] args) {

//		Box box = new Box();
		
//		new Box();
		
	BoxConstructor box = new BoxConstructor(10, 8, 5);

	BoxConstructor box1 = new BoxConstructor();

	BoxConstructor box2 = new BoxConstructor(5.5);
	
	box.printBox();
	
	box.width = 5;
	box.printBox();
	
	box1.printBox();
	
	box2.printBox();
//	
	box.volume();
	
		
	}
	
}