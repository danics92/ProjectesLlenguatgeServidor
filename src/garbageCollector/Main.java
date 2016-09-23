package garbageCollector;

/**
 * Created by dcatalans on 23/09/16.
 */
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p = null;
        System.gc();

    }

}

class Persona {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Se ha borrado una persona!");
    }
}
