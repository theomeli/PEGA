/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Totoros
 */
public class Operators {
    
    public static Double addition(Double firstOperand, Double secondOperand){
        return firstOperand + secondOperand;
    }

    public static Double subtraction(Double firstOperand, Double secondOperand){
        return firstOperand - secondOperand;
    }
    
    public static Double multiplication(Double firstOperand, Double secondOperand){
        return firstOperand * secondOperand;
    }
    
    public static Double division(Double firstOperand, Double secondOperand) throws DivisionByZeroException{
        if (secondOperand == 0.0)
            throw new DivisionByZeroException("A division must not be by zero");
        return firstOperand / secondOperand;
    }
    
    public static Double square(Double operand){
        return Math.pow(operand, 2);
    }
    
    public static Double squareRoot(Double operand){
        return Math.sqrt(operand);
    }
}