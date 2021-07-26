package tb;

import java.awt.Component;
import javax.swing.JTable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class ButtonEditorTest {
    
    public ButtonEditorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTableCellEditorComponent method, of class ButtonEditor.
     */
    @Test
    public void testGetTableCellEditorComponent() {
        System.out.println("getTableCellEditorComponent");
        JTable table = null;
        Object obj = null;
        boolean selected = false;
        int row = 0;
        int col = 0;
        ButtonEditor instance = null;
        Component expResult = null;
        Component result = instance.getTableCellEditorComponent(table, obj, selected, row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellEditorValue method, of class ButtonEditor.
     */
    @Test
    public void testGetCellEditorValue() {
        System.out.println("getCellEditorValue");
        ButtonEditor instance = null;
        Object expResult = null;
        Object result = instance.getCellEditorValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopCellEditing method, of class ButtonEditor.
     */
    @Test
    public void testStopCellEditing() {
        System.out.println("stopCellEditing");
        ButtonEditor instance = null;
        boolean expResult = false;
        boolean result = instance.stopCellEditing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fireEditingStopped method, of class ButtonEditor.
     */
    @Test
    public void testFireEditingStopped() {
        System.out.println("fireEditingStopped");
        ButtonEditor instance = null;
        instance.fireEditingStopped();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
