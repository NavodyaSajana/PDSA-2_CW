
import IdentifyMinimumConnecters.Controller.IdentifyMinimumConnectersController;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sajana
 */
public class IdentifyMinimumConnectersControllerTest {
    
    @Test
    public void testcheckConnecters(){
        IdentifyMinimumConnectersController ctrl = new IdentifyMinimumConnectersController();
        int [] distance = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        ctrl.setDistance(distance);
        Map<String,Integer> userValues = new HashMap<String,Integer>();
        userValues.put("AB", 20);
        userValues.put("CD", 30);
        userValues.put("EF", 40);
        userValues.put("GH", 50);
        
        assertEquals("NE",ctrl.checkConnecters(userValues));
    }
}
