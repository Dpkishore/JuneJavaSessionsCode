package constructor_assignment;

import java.util.Arrays;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser b= new Browser("Chrome",169.85, new String[]{"xpath","camera","addon"} );
		System.out.println(Arrays.toString(b.plugin));

	}

}
