package tb;

import java.awt.Component;
import javax.swing.JTable;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Lenovo
 */
public class ButtonEditorNGTest {
    
    public ButtonEditorNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
