package Assignment6;

class Box {
    int length;

    Box(int length) {
        this.length = length;
    }
}

public class Boxlength_Change {
	static void modifyBox(Box b) {
        b.length = 200;
    }

    public static void main(String[] args) {

        Box box = new Box(50);

        System.out.println("Before modification: " + box.length);

        modifyBox(box);

        System.out.println("After modification: " + box.length);
    }
	

}
