package exceptionhandling;

import java.io.IOException;

public class ThrowsChecked {
	public static void checked() throws IOException{
		throw new IOException("Exception occurred");
	}

	public static void main(String[] args) {
		try {    //handling is mandatory for checked
			checked();
		}
		catch(IOException e) {
			System.out.println("handled");
		}

	}

}
