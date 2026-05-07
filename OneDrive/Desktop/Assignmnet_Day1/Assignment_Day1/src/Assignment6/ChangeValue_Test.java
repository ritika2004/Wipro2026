package Assignment6;

public class ChangeValue_Test {
	static int changeValue(int num) {
        num = 100; 
        return num;
    }

	public static void main(String[] args) {
		int num = 50;

        System.out.println("Before method call: " + num);

        num=changeValue(num);

        System.out.println("After method call: " + num);
    

	}

}
