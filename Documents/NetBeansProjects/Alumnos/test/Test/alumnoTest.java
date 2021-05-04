/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import alumnos.Alumno;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author José Antonio Sánchez
 */
public class alumnoTest {
    
    Alumno objetoAlumno = new Alumno();
    
    @Test
    public void notaModuloTest() {
        System.out.println("Ejecutando notaModuloTest...");
        objetoAlumno.setNota_practica1(6);
        objetoAlumno.setNota_práctica2(7.8);
        objetoAlumno.setNota_práctica3(4.5);
        objetoAlumno.setNota_examen(5.5);
        double experado = 5.74;
        double resultado = objetoAlumno.notaModulo();
        Assert.assertEquals(experado, resultado, 0.0);
    }
       
    @Test
    public void calificacionModuloTest() {
        System.out.println("Ejecutando calificacionModuloTest...");
        String experado = "Suspenso";
        String resultado = objetoAlumno.calificacionModulo();
        Assert.assertEquals(experado, resultado);
    }
    
    @Test
    public void entregaPracticasTest() {
        System.out.println("Ejecutando entregaPracticasTest...");
        objetoAlumno.setNota_practica1(6);
        objetoAlumno.setNota_práctica2(7.8);
        objetoAlumno.setNota_práctica3(4);
        boolean experado = true;
        boolean resultado = objetoAlumno.entregaPracticas();
        Assert.assertEquals(experado, resultado);
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Ejecutando los test...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Test completados.");
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
