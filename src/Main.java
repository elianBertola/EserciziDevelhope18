import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        stampaElementi(lista);
        stampaGrandezza(lista);
    }
    public static void stampaElementi(Set<String> lista) {
        for(String elementi : lista) {
            System.out.println(elementi);
        }
    }
    public static void stampaGrandezza(Set<String> lista) {
        System.out.println(lista.size());
    }
}