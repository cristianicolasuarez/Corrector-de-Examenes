package Model.Preguntas.Preguntas;

import Model.Enums.TipoRespuesta;

import java.util.List;

import static Model.Enums.TipoRespuesta.LIBRE;

public class MultipleChoice implements Pregunta
{
    String texto = null;
    List<String> posiblesRespuestas;
    private TipoRespuesta tipoRespuesta=LIBRE;
    public MultipleChoice (String texto, List<String>posiblesRespuestas)
    {
        this.texto=texto;
        this.posiblesRespuestas=posiblesRespuestas;
    }
    String respuesta;
    @Override
    public void responder() {

    }
}

