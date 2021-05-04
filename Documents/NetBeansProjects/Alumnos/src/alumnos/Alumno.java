package alumnos;

public class Alumno {

    String Nombre, apellidos, DNI, módulo;
    double nota_practica1, nota_práctica2, nota_práctica3, nota_examen;

    public Alumno(String Nombre, String apellidos, String DNI, String módulo, double nota_practica1, double nota_práctica2, double nota_práctica3, double nota_examen) {
        this.Nombre = Nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.módulo = módulo;
        this.nota_practica1 = nota_practica1;
        this.nota_práctica2 = nota_práctica2;
        this.nota_práctica3 = nota_práctica3;
        this.nota_examen = nota_examen;
    }

    public Alumno() {
    }

    public double getNota_practica1() {
        return nota_practica1;
    }

    public void setNota_practica1(double nota_practica1) {
        this.nota_practica1 = nota_practica1;
    }

    public double getNota_práctica2() {
        return nota_práctica2;
    }

    public void setNota_práctica2(double nota_práctica2) {
        this.nota_práctica2 = nota_práctica2;
    }

    public double getNota_práctica3() {
        return nota_práctica3;
    }

    public void setNota_práctica3(double nota_práctica3) {
        this.nota_práctica3 = nota_práctica3;
    }

    public double getNota_examen() {
        return nota_examen;
    }

    public void setNota_examen(double nota_examen) {
        this.nota_examen = nota_examen;
    }

    public double notaModulo() {
        double mediaPrac = ((this.nota_practica1 + this.nota_práctica2 + this.nota_práctica3) / 3);
        if ((mediaPrac < 3) || (this.nota_examen < 3)) {
            return 4;
        }
        mediaPrac = mediaPrac * 0.4;
        double notaEx = this.nota_examen * 0.6;
        return mediaPrac + notaEx;
    }

    public String calificacionModulo() {
        if (this.notaModulo() < 5) {
            return "Suspenso";
        } else if ((this.notaModulo() >= 5) && (this.notaModulo() < 6)) {
            return "Aprobado";
        } else if ((this.notaModulo() >= 6) && (this.notaModulo() < 7)) {
            return "Bien";
        } else if ((this.notaModulo() >= 7) && (this.notaModulo() < 9)) {
            return "Notable";
        } else if ((this.notaModulo() >= 9) && (this.notaModulo() <= 10)) {
            return "Sobresaliente";
        }
        return "El alumno no tiene notas registradas";
    }

    public boolean entregaPracticas() {
        return !((this.nota_practica1 == 0) || (this.nota_práctica2 == 0) || (this.nota_práctica3 == 0));
    }
}
