
import TicTacToe.TicTacToeController;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sajana
 */
public class TicTacToeTest {
    
    @Test
    public void testPlay(){
        TicTacToeController ctrl = new TicTacToeController();
        assertEquals(" ",ctrl.play(0, 0));
    }
}
