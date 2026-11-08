// 1. El molde del aviso. No hace nada solo: existe para que alguien lo lance.
public class CupoLlenoException extends Exception {
    public CupoLlenoException(String mensaje) {
        super(mensaje);   // le pasa el mensaje a Exception, que lo guarda
    }
}
