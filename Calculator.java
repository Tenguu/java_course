public class Calculator{

private int result;

public void plus(int... params){
	for (Integer param: params){
		this.result += param;
	}
}
public void minus(int... params){
	for (Integer param: params){
		this.result -= param;
	}
}
public void delenie(int... params){
	for (Integer param: params){
		this.result /= param;
	}
}
public void umnogenie(int... params){
	for (Integer param: params){
		this.result *= param;
	}
}
public int getResult(){
	return this.result;
}
public void cleanResult(){
	this.result = 0;
}
}