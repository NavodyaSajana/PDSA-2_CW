/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IdentifyShortestPath.Model;

import Components.Database;
import java.sql.SQLException;

/**
 *
 * @author Sajana
 */
public class IdentifyShortestPathModel {

    Database db = new Database();
    public boolean insertPlayer(String playerName, String cities) throws SQLException {
        return db.insertDeleteUpdate_Data("INSERT INTO `tbl_shortestpath` (`playerID`, `playerName`, `cities`) VALUES (NULL, '"+playerName+"', '"+cities+"')");
    }
    
}
