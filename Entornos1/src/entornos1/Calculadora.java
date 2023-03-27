

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos1;

/**
 *
 * @author redes
 * @version 22/23
 * @serial Febrero 2023
 *holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 
 *klkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk 
  ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk*/
public class Calculadora {
    private int num1;
    private int num2;
    
    
    /**
     * 
     * @param a primer dato
     * @param b segundo dato
     *
     */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    /**
     * 
     * @return Me devuelve el resultado de la suma
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    
    /**  
     * 
     * @return Realiza la comparacion y me devuelve el Return
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result; 
    }
    /**
     * 
     * @return Compara si num1 es mayor que num2 devuelve un True y si es al contrario devuelve un False  
     */
    public boolean resta2(){
         if (num1 > num2){    
            return true;
        }
        else {               
            return false;
        }
    }
    /**
     * 
     * @return Me devuelve el resultado de la multiplicacion
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    /**
     * 
     * @return Me devuelve el resultado de la division
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    /**
     * 
     * @return Si num2 es igual a 0 devuelve un NULL y me devuelve el resultado de la division
     * 
     * 
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
        /**
         * 
         * @return Si num2 es igual a 0 me devuelve "División por 0" y si es al contrario me devuelve el resultado de la division
         * @throws  ArithmeticException Si el divisor es 0
         * @exception ArithmeticException Si el divisor es 0
         * 
         */
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    */
}
