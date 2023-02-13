import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee>employeeList = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("D:\\text.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
