package lecture3;

public class BoxVolume {
	public static void main(String[] args) {

//		Box box = new Box();
		
//		new Box();
		
		BoxConstructor box = new BoxConstructor(10, 8, 3);
		box.printBox();
		
		BoxConstructor box2 = new BoxConstructor(6, 4, 2);
		box2.depth = 12;
		box2.printBox();
		
	}
	
}