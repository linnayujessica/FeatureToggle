import java.util.ArrayList;
import java.util.List;

public class ToggleService {

    public Toggle toggle;
    public List toggleList = new ArrayList<Toggle>();

    // define toggle
    public void createToggle(String name, boolean status) {
        toggle = new Toggle(name, status);
        toggleList.add(toggle);
    }

    // get state: enable or disable
    public boolean getStatus() {
        return toggle.isStatus();
    }
    // enable/disable toggle
    public void disable() {
        toggle.setStatus(false);
    }
    public void enable() {
        toggle.setStatus(true);
    }
    // delete toggle
    public void deleteToggle(Toggle toggle) {
        toggleList.remove(toggle);
    }


}
