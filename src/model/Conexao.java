/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabrieli
 */
public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/impressao3d";

    private static final String USUARIO = "root";
    private static final String SENHA = "Gabrieli0402";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(
                URL, USUARIO, SENHA
        );
    }
}