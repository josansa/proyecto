package calculadora;

public class Calculadora {

    // Atributos de la clase 
    private double num1;
    private double num2;
    private String marca;
    private String modelo;

    // Métodos de la clase
    // Constructor por defecto
    public Calculadora(double num1, double num2, String marca, String modelo) {
        this.num1 = num1;
        this.num2 = num2;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor sobrecargado
    public Calculadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor sobrecargado
    public Calculadora() {
    }

    // Métodos de funciones de la clase
    public double suma() {
        return (this.num1 + this.num2);
    }

    public double resta() {
        return (this.num1 - this.num2);
    }

    public double multiplicacion() {
        double resultado = (this.num1 * this.num2);
        if ((num1 < 0) && (num2 < 0)) {
            Math.abs(resultado);
        }
        return resultado;
    }


    // GETTERS & SETTERS
    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
