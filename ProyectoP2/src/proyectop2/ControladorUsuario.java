/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2;

import java.util.ArrayList;
import java.util.List;

public class ControladorUsuario {
    private List<Usuario> usuarios;

    public ControladorUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario iniciarSesion(String username, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }
}

