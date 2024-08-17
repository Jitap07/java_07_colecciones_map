import java.util.Map;
//import java.util.HashMap;
//import java.util.TreeMap;
import java.util.LinkedHashMap;

public class App
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Bienvenido a nuestra verduleria (Tienda de Frutas y Verduras)!");
    //  Map<String, Double> Inventario = new HashMap<>();        // Sin Ordenamiento
    //  Map<String, Double> Inventario = new TreeMap<>();        // Ordena Alfabeticamente
        Map<String, Double> Inventario = new LinkedHashMap<>();  // Ordena según su inserción
        Inventario.put("Banana", 0.89);
        Inventario.put("Tomate", 0.75);
        Inventario.put("Palta", 0.95);
        Inventario.put("Frutilla", 0.65);
        Inventario.put("Pimiento", 0.77);
        
        // Listando Inventario:
        System.out.println("");
        System.out.println("Este es el inventario: ");
        for (String fruta : Inventario.keySet()) // KeySet me da un arreglo con las keys
        {                                        //Con el get accedo al valor
            System.out.println(fruta + ": $ " + Inventario.get(fruta));
        }
        
        // Buscar Fruta:
        String frutaBuscada = "Frutilla";
        System.out.println("");
        System.out.println("Se acerca un Cliente y nos pide la siguiente fruta: " + frutaBuscada);
        
        if (Inventario.containsKey(frutaBuscada))
            System.out.println(frutaBuscada + " está en el inventario, encantado le vendemos.");
        else
            System.out.println ("Lamentable,ente nos quedamos sin " + frutaBuscada);
        
        // Sin Stock:
        String SinStock = "Frutilla";
        Inventario.remove(SinStock);
        System.out.println("");
        System.out.println ("Nos hemos quedado sin " + SinStock + ".");
        
        // Actualizado Inventario:
        System.out.println("");
        System.out.println ("Inventario Actualizado: ");
        for (String fruta : Inventario.keySet())
        {                                       //Con el get accedo al valor
            System.out.println(fruta + ": $ " + Inventario.get(fruta));
        }
        System.out.println ("La cantidad de mercaderia es: " + Inventario.size());
    }
}
