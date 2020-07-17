package Model.Repositorios;

import Model.Usuario;

import java.util.LinkedList;
import java.util.List;

public class UsuarioRepository
{
    private List<Usuario> usuarios = new LinkedList<>();

    public void agregar(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Usuario> all() {
        return usuarios;
    }
}

