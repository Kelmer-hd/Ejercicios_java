public class Calculadora {
    private double num1;
    private double num2;
    private double resultado;

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public String sumar(){
        resultado = num1 + num2;
        return "La suma es: "+resultado;
    }

    public String resta(){
        resultado = num1 - num2;
        return "La resta es: "+resultado;
    }

    public String multiplicacion(){
        resultado = num1 * num2;
        return  "La multiplicación es: "+resultado;
    }

    public String divicion(){
        resultado = num1 / num2;
        return "La divición es: "+resultado;
    }


}
