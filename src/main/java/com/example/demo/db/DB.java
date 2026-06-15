package com.example.demo.db;

import com.example.demo.exceptions.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    public static Connection conn = null;

    // Abre uma unica conexao com o banco usando as informacoes de db.properties.
    public static Connection getConnection() throws DbException {
        if(conn == null){
            try {
                Properties prop = loadProperties();

                String url = prop.getProperty("dburl");
                conn = DriverManager.getConnection(url, prop);

            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

        return conn;
    }

    // Fecha a conexao aberta e libera a variavel para permitir reconectar depois.
    public static void closeConnection() throws DbException {
        if (conn != null){
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    // Carrega usuario, senha e URL do banco a partir do arquivo db.properties.
    public static Properties loadProperties() throws DbException {
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties prop = new Properties();

            prop.load(fs);

            return  prop;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    // Evita repetir try/catch em todos os lugares que usam Statement ou PreparedStatement.
    public static void closeStatement(Statement stmt) throws DbException {
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    // Fecha resultados de SELECT para evitar vazamento de recursos.
    public static void closeResultSet(ResultSet rs) throws DbException {
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
