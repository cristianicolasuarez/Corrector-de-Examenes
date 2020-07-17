package Model.Preguntas.Preguntas;


import Model.Enums.TipoRespuesta;
import Model.Enums.VOF;

import static Model.Enums.TipoRespuesta.BINARIA;

public class VerdaderoOFalso implements Pregunta
{
    String texto = null;
    VOF respuesta=null;
    private TipoRespuesta tipoRespuesta=BINARIA;

    public VerdaderoOFalso (String texto)
    {
        this.texto=texto;
    }
    @Override
    public void responder() {

    }
}
