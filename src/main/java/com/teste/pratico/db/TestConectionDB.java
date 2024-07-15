package com.teste.pratico.db;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConectionDB {
    public static void main(String[] args) throws SQLException {
       DbConection db =  new DbConection();

       db.setConnection();

        System.out.println("Conexão com HSQLDB concluida!!!");

        db.setDisnection();
        System.out.println("Conexão com HSQLDB encerrada!!!");

        BuildTable buildTable = new BuildTable();
        buildTable.contructTable();

    }
}
