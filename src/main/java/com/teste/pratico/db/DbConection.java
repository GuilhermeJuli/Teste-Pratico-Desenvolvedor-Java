package com.teste.pratico.db;

import org.springframework.http.HttpStatus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConection {
    private final String Url = "jdbc:hsqldb:file:database/";
    private final String DbName = "agendaDb;hsqldb.lock_file";
    private final String UserName = "SA";
    private final String Pass = "";

    public Connection connection;

    public void setConnection() throws SQLException {
        connection = DriverManager.getConnection(Url + DbName, UserName, Pass);
        if (connection != null){
            System.out.println("Conectado ao banco de dados HSQLDB!");
        }else {
            System.out.println("Erro ao conectar ao banco de dados HSQLDB!");
        }
    }
    public void setDisnection() throws SQLException {
        connection.close();
    }

    public void setScriptddl(String sql) throws SQLException{

        System.out.println("Executanto Script SQL... " + sql);

        setConnection();

        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.execute();
        connection.commit();

        setDisnection();
    }
}
