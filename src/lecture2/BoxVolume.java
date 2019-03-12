package lecture2;

public class BoxVolume {
	public static void main(String[] args) {
		
//		int width = 10;
//		int height = 5;
//		int depth = 3;
//		
//		int volume = volume(width, height, depth);
//		
//		System.out.println(volume);
//	
//		Box box = new Box();
//		
//		box.width = 10;
//		box.height = 7;
//		box.depth = 5;
//		
//		
//		Box box2 = new Box();
//		box2.width = 5;
//		box2.height = 4;
//		box2.depth = 3;
//		
//		System.out.println(box.width + ", " + box.height + ", " + box.depth);
//		System.out.println(box2.width + ", " + box2.height + ", " + box2.depth);
		
		
		
		
		BoxClass box = new BoxClass();
		box.setData(10, 5, 3);
		
		box.printBox();
		
		BoxClass box2 = new BoxClass();
		box2.setData(5, 3, 2);
		
		box2.printBox();
		
		
		
		
//		
//		Box[] boxes = new Box[2];
//		boxes[0] = box;
//		boxes[1] = box2;
//		
//		System.out.println(boxes);
		
	}
	
}