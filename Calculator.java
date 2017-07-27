
public class Calculator{

private int result;

public void plus(int first, int second){
		this.result = first + second;
}
public void minus(int first, int second){
		this.result = first - second;
}
public void delenie(int first, int second){
		this.result = first / second;
}
public void umnogenie(int first, int second){
		this.result = first * second;
}
public int getResult(){
	return this.result;
}
public void cleanResult(){
	this.result = 0;
}
}