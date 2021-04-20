package ejercciosExcepciones;

public class Try5
{
    public static void main(String arg[])
    {
        try
        {
	         Exception e = new Exception("Este es mi propio error.");
	         throw e;
        }
        catch(Exception excepcion)
        {
	         excepcion.printStackTrace();
        	//System.out.print("error");
        }
    }
}
