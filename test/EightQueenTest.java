
import EightQueenPuzzle.Controller.EightQueenPuzzleController;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sajana
 */
public class EightQueenTest {
    @Test
    public void testCheckPatterns(){
        EightQueenPuzzleController ctrl = new EightQueenPuzzleController();
        assertThrows(SQLException.class,
                ()->{
                    assertTrue(ctrl.checkPatterns("0000000000000000000000000000000000000000000000000000000000000000"));
                    assertFalse(ctrl.checkPatterns("0000000000000000000000000000000000000000000000000000000000000000"));
                }
        );
                
    }
    
    @Test
    public void testifPatternFounded(){
        EightQueenPuzzleController ctrl = new EightQueenPuzzleController();
        assertThrows(SQLException.class,
                ()->{
                    assertTrue(ctrl.ifPatternFounded(1));
                    assertFalse(ctrl.ifPatternFounded(1));
                            }
                );
                
    }
    
    @Test
    public void testinsertPatternFounder(){
        EightQueenPuzzleController ctrl = new EightQueenPuzzleController();
        assertThrows(SQLException.class,
                ()->{
                    assertTrue(ctrl.insertPatternFounder(1,"test"));
                    assertFalse(ctrl.insertPatternFounder(1,"test"));
                            }
                );
                
    }
}
