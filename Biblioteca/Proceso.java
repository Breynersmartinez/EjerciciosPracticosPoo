public class Proceso {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su Contraseña: ");
            int Contraseña = scanner.nextInt();
            int ContraseñaUser = 1234567;
    
            if (Contraseña == ContraseñaUser) {
              //proceso
              Proceso proceso = new Proceso( " Etica para Amador", " Breiner", 123, 11, false );
              System.out.println(" Biblioteca UCC ");
              System.out.println(proceso.toString());
              
              System.out.println(" ¿Que libro desea pedir prestado? ");
              String Titulo = scanner.nextLine();
              
              String SolicitudPrestamo = proceso.prestar();
              System.out.println(SolicitudPrestamo);
              
              
              
              
              
              
              
              
              
            } else {
                System.out.println("Contraseña incorrecta.");
            }
    
          
        }
}
