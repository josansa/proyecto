/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import alumnos.Alumno;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author José Antonio Sánchez
 */
@RunWith(value = Parameterized.class)

public class calificacionModuloTestPara {

    double nota_practica1, nota_práctica2, nota_práctica3, nota_examen;
    String experado;

    public calificacionModuloTestPara(double nota_practica1, double nota_práctica2, double nota_práctica3, double nota_examen, String experado) {
        this.nota_practica1 = nota_practica1;
        this.nota_práctica2 = nota_práctica2;
        this.nota_práctica3 = nota_práctica3;
        this.nota_examen = nota_examen;
        this.experado = experado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1, 2, 3, 4, "Suspenso"}, {7, 8, 9, 10, "Sobresaliente"}, {3, 4, 8, 8.4, "Notable"}, {8, 4.2, 7, 6.6, "Bien"}, {6, 7, 9, 2, "Suspenso"}};
        return Arrays.asList(data);
    }

    Alumno objetoAlumno = new Alumno();

    @Test
    public void calificacionModuloTest() {
        System.out.println("Ejecutando calificacionModuloTest...");
        objetoAlumno.setNota_practica1(this.nota_practica1);
        objetoAlumno.setNota_práctica2(this.nota_práctica2);
        objetoAlumno.setNota_práctica3(this.nota_práctica3);
        objetoAlumno.setNota_examen(this.nota_examen);
        String resultado = objetoAlumno.calificacionModulo();
        Assert.assertEquals(this.experado, resultado);
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Ejecutando notaModuloTestPara...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Tests finalizados");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
