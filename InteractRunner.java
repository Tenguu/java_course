import java.util.Scanner;
import java.lang.Math;

public class InteractRunner {
	
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				System.out.println("Select functuion : + , - , / , *");
				String third = reader.next();
					if (third.equals("-")){
						calc.minus(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result : " + calc.getResult());
				} else if (third.equals("+")){
						calc.plus(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result : " + calc.getResult());
				} else if (third.equals("*")){
						calc.umnogenie(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result : " + calc.getResult());
				} else if (third.equals("/")){
						calc.delenie(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result : " + calc.getResult());
				} else {
						System.out.println(third);
						System.out.println("Неверно выбранна функция");
				}
						//System.out.println("Result : " + calc.getResult());
						//calc.cleanResult();
						System.out.println("Exit : yes/no");
						exit = reader.next();
				
			}
		} finally {
			reader.close();
		}
	}
}
