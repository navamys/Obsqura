package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		System.out.println(ExcelSample.readStringData(1, 0));
		System.out.println(ExcelSample.readIntegerData(1, 1));
	}
}
