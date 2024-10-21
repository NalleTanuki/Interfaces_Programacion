/*
Si hereda de una interfaz, usamos IMPLEMENTS
Si hereda de una clase, usamos EXTENDS
 */
public class Naranja implements Imprimible
{
    private double peso;
    public boolean sonTransgenicas()
    {
        if(peso > 10)  //Si pesa mas de 10gr, devuelve true, que SI es transgenica
        {
            return true;
        }
        return false;
    }

    @Override
    public void imprimirNutrientes()
    {
    }
}
