/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import java.util.logging.Level;
import java.util.logging.Logger;
import principal.dominio.usuario.Usuario;
import principal.dominio.usuario.UsuarioService;

/**
 *
 * @author chris
 */
public class JDBC {

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        
        try {
            usuarioService.crearUsuario("chiquito@chiquito", "asdasdasda");
        } catch (Exception ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
