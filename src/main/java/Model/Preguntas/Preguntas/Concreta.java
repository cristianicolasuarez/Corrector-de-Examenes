package Model.Preguntas.Preguntas;

import Model.Enums.TipoRespuesta;

import static Model.Enums.TipoRespuesta.LIMITADA;

public class Concreta implements Pregunta
{
    String texto = null;
    String respuesta=null;
    private TipoRespuesta tipoRespuesta=LIMITADA;
    public Concreta (String texto)
    {
        this.texto=texto;
    }
    @Override
    public void responder() {

    }
}
