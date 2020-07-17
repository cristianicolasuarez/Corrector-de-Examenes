package UI.VM;

import UI.Windows.ExamenWindow;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.utils.Observable;

public class IdentificadorModel extends AlgoViewModel {
    @Observable
    private static String usuario;


    public static void validar(WindowOwner propietario)
    {
        System.out.println(usuario+" VALIDADO");

        Dialog<?> dialog = ExamenesModel;
        dialog.open();
        dialog.onAccept(() -> {});

    }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getUsuario() { return usuario; }

}
