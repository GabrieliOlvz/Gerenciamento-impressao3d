
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabrieli
 */
public class ImpressaoDAO {

    // Cadastrar uma impressão
    public void adicionar(Impressao impressao) throws SQLException {

        String sql = "INSERT INTO impressoes "
                + "(modelo, material, cor, quantidade, filamento, horas, minutos, status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, impressao.getModelo());
            comando.setString(2, impressao.getMaterial());
            comando.setString(3, impressao.getCor());
            comando.setInt(4, impressao.getQuantidade());
            comando.setFloat(5, impressao.getFilamento());
            comando.setInt(6, impressao.getHoras());
            comando.setInt(7, impressao.getMinutos());
            comando.setString(8, impressao.getStatus());

            comando.executeUpdate();
        }
    }

    // Listar impressões
    public List<Impressao> listar() throws SQLException {

        List<Impressao> impressoes = new ArrayList<>();
        String sql = "SELECT * FROM impressoes";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql);
             ResultSet resultado = comando.executeQuery()) {

            while (resultado.next()) {

                Impressao impressao = new Impressao(
                    resultado.getString("modelo"),
                    resultado.getString("material"),
                    resultado.getString("cor"),
                    resultado.getInt("quantidade"),
                    resultado.getFloat("filamento"),
                    resultado.getInt("horas"),
                    resultado.getInt("minutos"),
                    resultado.getString("status")
                );

                impressao.setId(resultado.getInt("id"));
                impressoes.add(impressao);
            }
        }

        return impressoes;
    }

    // Excluir impressão
    public void excluir(int id) throws SQLException {

        String sql = "DELETE FROM impressoes WHERE id = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setInt(1, id);
            comando.executeUpdate();
        }
    }

    // Atualizar impressão
    public void atualizar(Impressao impressao) throws SQLException {

        String sql = "UPDATE impressoes SET "
                + "modelo = ?, material = ?, cor = ?, quantidade = ?, "
                + "filamento = ?, horas = ?, minutos = ?, status = ? "
                + "WHERE id = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, impressao.getModelo());
            comando.setString(2, impressao.getMaterial());
            comando.setString(3, impressao.getCor());
            comando.setInt(4, impressao.getQuantidade());
            comando.setFloat(5, impressao.getFilamento());
            comando.setInt(6, impressao.getHoras());
            comando.setInt(7, impressao.getMinutos());
            comando.setString(8, impressao.getStatus());
            comando.setInt(9, impressao.getId());

            comando.executeUpdate();
        }
    }

    // Buscar impressão pelo ID
    public Impressao buscarPorId(int id) throws SQLException {

        String sql = "SELECT * FROM impressoes WHERE id = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setInt(1, id);

            try (ResultSet resultado = comando.executeQuery()) {

                if (resultado.next()) {

                    Impressao impressao = new Impressao(
                        resultado.getString("modelo"),
                        resultado.getString("material"),
                        resultado.getString("cor"),
                        resultado.getInt("quantidade"),
                        resultado.getFloat("filamento"),
                        resultado.getInt("horas"),
                        resultado.getInt("minutos"),
                        resultado.getString("status")
                    );

                    impressao.setId(resultado.getInt("id"));
                    return impressao;
                }
            }
        }

        return null;
    }
}
