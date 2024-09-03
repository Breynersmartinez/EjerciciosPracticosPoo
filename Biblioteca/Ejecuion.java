
class Proceso {
    //Atributos
   private String Titulo;
   private String Autor;
   //ISBN es como un ID por que es en numero identificador de libros
   private int ISBN;
   private int NumPag;
   private boolean Disponibilidad;
   
   //Constructor
   public Proceso(String Titulo, String Autor, int ISBN,  int NumPag,  boolean Disponibilidad){
       this.Titulo = Titulo;
       this.Autor = Autor;
       this.ISBN = ISBN;
       this.NumPag = NumPag; 
       this.Disponibilidad  = Disponibilidad;
   }
   
   public String prestar(){
       if( Disponibilidad == true){
          return  " El prestamo ha sido aprobado ";
       }else{
           return " El libro no esta disponible ";
       }
        
   }
   public String toString(){
       return "Libro { Titulo: "+Titulo+", Autor " +Autor+", ISBN "+ ISBN+ ", Numero De paginas " + NumPag +", Disponibilidad " + Disponibilidad +"}";
   }
}
