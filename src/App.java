import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //ejemploScanner();
        //ejemConversion();
        //ejemplosRelacionales();
        ejericicoIMC();
    }

    public static void ejemConversion(){

        int cantidada = 5;
        int total = 4;
        double promedio = (double)total/cantidada;
        
        System.out.println("resultado= "+promedio);
    }
    
    public static void ejemploScanner(){
       Scanner sc = new Scanner(System.in);

       System.out.println("Nombre: ");
       var nombre = sc.nextLine();

       System.out.println("Edad: ");
       int edad = sc.nextInt();

       sc.nextLine();

       System.out.println("Salario: ");
       double salario = sc.nextDouble();

       sc.nextLine();

        System.out.println("nombre  "+nombre+" edad "+edad+" salario "+salario);

        sc.close();
    }

    public static void ejemplosRelacionales(){
        int a = 5;
        int b = 10;

        System.out.println(a>b);
        System.out.println(a<b);
    }

    public static void ejericicoIMC(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso kg: ");
        double peso = sc.nextDouble();

        System.out.print("Altura mt: ");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.println("IMC: "+IMC);
        System.out.println("peso bajo "+(IMC<18.5));
        System.out.println("peso normal: "+(IMC >= 18.5 && IMC <= 24.9));
        System.out.println("peso alto "+(IMC>24.9));

        sc.close();
    }
}
