package HW.src.DPackage;

import HW.src.DPackage.DummiesPanel;

import javax.swing.JApplet;

public class SimpleApplet extends JApplet {
    private static final long serialVersionUID = 1L;

    public void init() {
        setContentPane(new DummiesPanel());
    }
}
