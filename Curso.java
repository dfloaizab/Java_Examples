import java.io.*;
import java.util.*;

public class Curso {

    //atributos:
   private String codigo;
   private String nombre;
   private boolean abierto;
   private int creditos;
   private int matricula;
   private boolean tiene_certificado;

   //implementación de la colección de estudiantes:
    //como un arreglo de tamaño fijo / arreglos estáticos (1 curso puede tener máximo NUM_ESTUDIANTES, 8)
   //final int NUM_ESTUDIANTES = 8;
   //private Estudiante[] estudiantes;


   //como un arreglo de tamaño variable / arreglo dinámico
    //cuando la relación establece que un curso puede tener un número "ilimitado" de estudiantes
   private ArrayList<Estudiante> estudiantes;


    //métodos:
    public Curso() {
        estudiantes = new ArrayList<Estudiante>();
    }

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        estudiantes = new ArrayList<Estudiante>();
    }

    public Curso(String codigo, String nombre, boolean abierto, int creditos, int matricula, boolean tiene_certificado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.abierto = abierto;
        this.creditos = creditos;
        this.matricula = matricula;
        this.tiene_certificado = tiene_certificado;
        estudiantes = new ArrayList<Estudiante>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isTiene_certificado() {
        return tiene_certificado;
    }

    public void setTiene_certificado(boolean tiene_certificado) {
        this.tiene_certificado = tiene_certificado;
    }

    //Métodos propios de las funcionalides de la clase:

    //matricular estudiante

    /**
     * agregar un estudiante a la colección de estudiantes
     * @param pEstudianteAMatricular
     */
    public void MatricularEstudiante( Estudiante pEstudianteAMatricular )
    {

        estudiantes.add(pEstudianteAMatricular);
    }

    /**
     * recorre la colección de estudiantes y retorna el objeto cuyo nombre coincide con el parámetro
     * @param pNombre
     * @return
     */
    /*
    public Estudiante buscarEstudianteNombre(  String pNombre  )
    {





    }
    */



    /**
     * hacer carga inicial de información desde un archivo plano (  se lee secuencialmente  )
     * de los estudiantes (un estudiante por renglón)
     * @param rutaArchivo
     */
    public void cargarInformacionArchivo(String rutaArchivo)
    {
        String lineaArchivo="";
        try {

            //abrir buffer de lectura que apunte al archivo
            BufferedReader myReader = new BufferedReader(  new FileReader(rutaArchivo));
            lineaArchivo = myReader.readLine();
            while(lineaArchivo != null)
            {
                //lineaArchivo = "12345,Pedro Perez,pedro@mail.com"
                //El split es un método sobre String, que devuelve un arreglo de String
                String valores[] = lineaArchivo.split(",");

                //valores = {"12345","Pedro Perez","pedro@gmail.com"}
                Estudiante nuevoEstudiante = new Estudiante(valores[0], valores[1], valores[2]);

                //cada linea (String) debe procesarla y crear un objeto Estudiante a partir de ahí
                //depende de cómo esté estructurado el archivo

                //agregar el estudiante a la colección "estudiantes"
                MatricularEstudiante(nuevoEstudiante);
                //leer linea por linea hasta que llegue al final (ciclo while?)
                lineaArchivo = myReader.readLine();
            }
            myReader.close();

        } catch (FileNotFoundException e)
        {
            //
        }
        catch(IOException e)
        {
            //
        }
    }




    /*
    public Estudiante buscarEstudianteCodigo(  String pCodigo  )
    {

    }
    */


}
