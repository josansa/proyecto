import calculadora.Calculadora;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class CalculadoraTestPara {

    int nTest;
    double num1;
    double num2;
    double resulExp;
    double num3;
    double num4;
    double resulExp2;

    Calculadora objetoCalculadora = new Calculadora();

    public CalculadoraTestPara(int nTest, double num1, double num2, double resulExp,
             double num3, double num4, double resulExp2) {
        this.nTest = nTest;
        this.num1 = num1;
        this.num2 = num2;
        this.resulExp = resulExp;
        this.num3 = num3;
        this.num4 = num4;
        this.resulExp2 = resulExp2;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1, 6, 2, 8, 30, 10, 20}, {2, 8, 2, 10, 4, 3, 1}, {3, 10, 2, 12, 10, 5, 5}};
        return Arrays.asList(data);
    }

    @BeforeClass
    public static void fin() {
        System.out.println(" Comienzan el test parametrizado....");
    }

    @AfterClass
    public static void inicio() {
        System.out.println(" Fin del test parametrizado...");
    }

    @Test
    public void sumaTest() {
        System.out.println("  ejecutando sumaTest " + this.nTest + "....");
        objetoCalculadora.setNum1(this.num1);
        objetoCalculadora.setNum2(this.num2);
        double experado = this.resulExp;
        double resultado = objetoCalculadora.suma();
        Assert.assertEquals(experado, resultado, 0.0);

        //fail("No implementado aun");
    }

    @Test
    public void restaTest() {
        System.out.println("  ejecutando sumaTest " + this.nTest + "....");
        objetoCalculadora.setNum1(this.num3);
        objetoCalculadora.setNum2(this.num4);
        double experado = this.resulExp2;
        double resultado = objetoCalculadora.resta();
        Assert.assertEquals(experado, resultado, 0.0);

        //fail("No implementado aun");
    }

}
