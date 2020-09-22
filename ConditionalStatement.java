import java.io.*;

public class ConditionalStatement {
	public static void main(String[] args) throws Exception {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

int age = Integer.parseInt(reader.readLine());
String male = reader.readLine();
double height = Double.parseDouble(reader.readLine());
String firstNameLetter = reader.readLine();

		if (age > 20) {
			System.out.println("older than 20 yo");
		}
		if (male == "m") {
			System.out.println("male");
		}
		if (male != "m") {
			System.out.println("female");
		}
		if (height < 1.80) {
			System.out.println("lower than 1.80");
		} else {
			System.out.println("higher than 1.80");
		}
		if (firstNameLetter == "M") {
			System.out.println("The first name's letter is \"M\"");
		} else if (firstNameLetter == "I") {
			System.out.println("The first name's letter is \"I\"");
		} else { 
			System.out.println("The first name's letter is nor \"M\" or \"I\"");
		}
	}
}