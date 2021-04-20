package ejercciosExcepciones;

//Uso de throws
class ThrowsDemo {
  public static char prompt(String args)   throws java.io.IOException {
          System.out.println(args + " :");
          return (char) System.in.read();
 }
      public static void main (String[]args){
          char ch;
          try {
              //dado que prompt() podr�a arrojar una excepci�n,
              // una llamada debe incluirse dentro de un bloque try
              ch = prompt("Ingresar una letra");
          } catch (java.io.IOException exc) {
              System.out.println("Ocurri� una excepci�n de E/S");
              ch = 'X';
          }
           System.out.println("Usted presion�: " + ch);
  }
}
