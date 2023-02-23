package Report5.SPR;

public class Calculator {
    AddOperation addOperation = new AddOperation();
    SubstractOperation substractOperation = new SubstractOperation();
    MultiplyOperation multiplyOperation = new MultiplyOperation();
    DivideOperation divideOperation = new DivideOperation();

    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if(operator.equals("+")){
            answer = addOperation.operate(firstNumber,secondNumber);
        }else if(operator.equals("-")){
            answer = substractOperation.operate(firstNumber,secondNumber);
        }else if(operator.equals("*")){
            answer = multiplyOperation.operate(firstNumber,secondNumber);
        }else if(operator.equals("/")){
            answer = divideOperation.operate(firstNumber,secondNumber);
        }

        return answer;
    }
}