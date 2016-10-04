package interfaces;

/**
 * Created by dcatalans on 04/10/16.
 */
public class Persona {
}
interface Treballador{
    public void pagaAlTreballador(Treballador treballador);
}
class Alumne extends Persona{}
class Estudiant extends Alumne{}
class Becari extends  Alumne implements Treballador {

    @Override
    public void pagaAlTreballador(Treballador treballador) {

    }
}

class Docent extends Persona implements Treballador{
    @Override
    public void pagaAlTreballador(Treballador treballador) {

    }
}
class Primaria extends Docent {}
class Secundaria extends Docent {}