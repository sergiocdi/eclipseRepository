package termometro;

public class Termometro { 

    private float temperatura; 

 

    public Termometro(float temperatura) throws TemperaturaFueraRangoException { 

        if (temperatura < -192 || temperatura > 100) 

            throw new TemperaturaFueraRangoException("La temperatura esta fuera del rango [-192,100]"); 

        this.temperatura = temperatura; 

    } 

 

    public void fijarTemperatura(float temperatura) throws TemperaturaFueraRangoException { 

        if (temperatura < -192 || temperatura > 100) 

            throw new TemperaturaFueraRangoException("La temperatura esta fuera del rango [-192,100]"); 

        this.temperatura = temperatura; 

    } 

 

    public void imprimir() { 

        System.out.println("La temperatura actual del termometro es " + temperatura); 

    } 

 

    public static void main(String[] args) { 

        try { 

            Termometro termometro1 = new Termometro(30); 

            termometro1.imprimir(); 

            termometro1.fijarTemperatura(-250); 

            termometro1.imprimir(); 

        } catch (TemperaturaFueraRangoException ex) { 

            System.out.println(ex.getMessage()); 

        } 

 

    } 

 

} 