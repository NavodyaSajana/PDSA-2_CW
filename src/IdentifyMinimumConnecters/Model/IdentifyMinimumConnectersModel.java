/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IdentifyMinimumConnecters.Model;

import Components.Database;
import java.sql.SQLException;

/**
 *
 * @author Sajana
 */
public class IdentifyMinimumConnectersModel {
    Database db = new Database();

    public boolean insertPlayer(String playerName, String correctResults) throws SQLException {
        return db.insertDeleteUpdate_Data("insert into minimumconnecters values (NULL,'"+playerName+"','"+correctResults+"')");
    }
    
    
}
