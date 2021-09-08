public class Toggle {

    private String toggleName;
    private boolean status;

    public Toggle(String toggleName, boolean status) {
        this.toggleName = toggleName;
        this.status = status;
    }

    public String getToggleName() {
        return toggleName;
    }

    public void setToggleName(String toggleName) {
        this.toggleName = toggleName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}



// Toggle toggle = new Toggle(name, true);
// Toggle.disable();
