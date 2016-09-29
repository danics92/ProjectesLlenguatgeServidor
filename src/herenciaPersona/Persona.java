package herenciaPersona;

/**
 * Created by dcatalans on 29/09/16.
 */
public class Persona {
    String nom;
    String adreça;
}

class Alumne extends Persona{
    String dataAlata;
    int edad;
}

class Estudiant extends Alumne{
    String nif;
}

class Intercanvi extends Alumne {
    String nie;
    String paisOrigen;
}
class Personal extends Persona{
    String numSS;
}
class Professor extends Personal {
    String titulacio;
    String especialitat;
}
class PersonalGestio extends Personal {
    String posicio;
}
