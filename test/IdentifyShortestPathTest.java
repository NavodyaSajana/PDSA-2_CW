
import IdentifyShortestPath.Controller.IdentifyShortestPath;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sajana
 */
public class IdentifyShortestPathTest {
    
    @Test
    public void testStart(){
        IdentifyShortestPath ctrl = new IdentifyShortestPath();
        int [] distance = {1,2,3,4,5,6,7,8,9,10,11};
        assertFalse(ctrl.start(distance, "A")==10);
    }
}
