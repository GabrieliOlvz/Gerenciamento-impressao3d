package model;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabrieli
 */
public class TesteConexao {

    public static void main(String[] args) {

        try {
            Connection con = Conexao.conectar();

            JOptionPane.showMessageDialog(
                    null,
                    "Conexão com o banco realizada com sucesso!"
            );

            con.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao conectar: " + e.getMessage()
            );
        }
    }
}