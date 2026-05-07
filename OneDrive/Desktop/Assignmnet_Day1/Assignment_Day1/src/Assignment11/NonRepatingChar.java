package Assignment11;

public class NonRepatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str="WiproComapany";
		
		boolean[] vis = new boolean[256];
	    StringBuilder str1 = new StringBuilder();

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (!vis[ch]) {
	            vis[ch] = true;
	            str1.append(ch);
	        }
	    }
		
		System.out.println(str1);

	}

}
