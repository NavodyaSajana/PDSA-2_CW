
import Huffman.Controller.HuffmanController;
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
public class HuffmanTest {
    
    @Test
    public void testFindTheCode(){
        HuffmanController ctrl = new HuffmanController();
        assertFalse(ctrl.findTheCode("11110001010", "test")=="MATCH");
        assertTrue(ctrl.findTheCode("11110001010", "test")=="NOT");
    }
    
    @Test
    public void testFindTheString(){
        HuffmanController ctrl = new HuffmanController();
        assertFalse(ctrl.findTheString("11110001010", "test")=="MATCH");
        assertTrue(ctrl.findTheString("11110001010", "test")=="NOT");
    }
}
