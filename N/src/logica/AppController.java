package logica;


public enum AppController {
    INSTANCE;
    private final Concesionario concesionario;

    AppController() {
    	concesionario = new Concesionario();
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }}