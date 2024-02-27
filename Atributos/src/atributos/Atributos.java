package atributos;
import java.util.Scanner;

class Estudiante{
    String nombre;
    int edad;
    int matricula;
    
    /*
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getMatricula(){
        return matricula;
    }
    */
    public String setGetNombre(String nombre){
        this.nombre = nombre;
        return this.nombre;
    }
    
}

public class Atributos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estudiante est1 = new Estudiante();
        String temp;
        
        temp = est1.setGetNombre("Roberto");
        /*
        Estudiante est2 = new Estudiante();
        Estudiante est3 = new Estudiante();
        */
        System.out.println("El nombre del estudiante es: "+temp);
        
        
        
        
        
        
        /*
        //Captura del estudiante 1
        System.out.println("Ingresa el nombre del estudiante 1: ");
        est1.setNombre(entrada.nextLine());
        System.out.println("Ingresa la edad del estudiante 1: ");
        est1.setEdad(entrada.nextInt());
        System.out.println("Ingresa la matricula del estudiante 1: ");
        est1.setMatricula(entrada.nextInt());
        System.out.println("\n");
        
        //Captura del estudiante 2
        System.out.println("Ingresa el nombre del estudiante 2: ");
        est2.setNombre(entrada.next());
        System.out.println("Ingresa la edad del estudiante 2: ");
        est2.setEdad(entrada.nextInt());
        System.out.println("Ingresa la matricula del estudiante 2: ");
        est2.setMatricula(entrada.nextInt());
        System.out.println("\n");
        
        //Captura del estudiante 3
        System.out.println("Ingresa el nombre del estudiante 3: ");
        est3.setNombre(entrada.next());
        System.out.println("Ingresa la edad del estudiante 3: ");
        est3.setEdad(entrada.nextInt());
        System.out.println("Ingresa la matricula del estudiante 3: ");
        est3.setMatricula(entrada.nextInt());
        
        System.out.println("Nombre del estudiante 1 es:" +est1.getNombre()+ " ,su edad es: "+est1.getEdad()+" y su matricula es: "+est1.getMatricula());
        System.out.println("Nombre del estudiante 2 es:" +est2.getNombre()+ " ,su edad es: "+est2.getEdad()+" y su matricula es: "+est2.getMatricula());
        System.out.println("Nombre del estudiante 3 es:" +est3.getNombre()+ " ,su edad es: "+est3.getEdad()+" y su matricula es: "+est3.getMatricula());
        */
        
        
    }
    
}
