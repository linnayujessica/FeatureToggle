import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ToggleServiceTest extends TestCase {

    private ToggleService toggleService;

    @Before
    public void setup() {
        toggleService  = new ToggleService();
        for(int i=0 ; i<4 ; i++) {
            toggleService.createToggle("test No."+ (i+1) +" toggle", true);
        }
    }

    @Test
    public void testCreateToggle() {
        assertEquals(toggleService.toggle, toggleService.toggleList.get(3));
        assertEquals(4, toggleService.toggleList.size());
    }
    @Test
    public void testGetStatus() {
        assertTrue(toggleService.getStatus());
    }
    @Test
    public void testDisable() {
        toggleService.disable();
        assertFalse(toggleService.toggle.isStatus());
    }
    @Test
    public void testEnable() {
        toggleService.enable();
        assertTrue(toggleService.toggle.isStatus());
    }
    @Test
    public void testDeleteToggle() {
        toggleService.deleteToggle(toggleService.toggle);
        assertEquals(3, toggleService.toggleList.size());
    }
}