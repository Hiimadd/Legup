package edu.rpi.legup.ui.puzzleeditorui.elementsview;

import edu.rpi.legup.controller.EditorElementController;
import edu.rpi.legup.controller.RuleController;
import edu.rpi.legup.ui.proofeditorui.rulesview.BasicRulePanel;
import edu.rpi.legup.ui.proofeditorui.rulesview.CaseRulePanel;
import edu.rpi.legup.ui.proofeditorui.rulesview.ContradictionRulePanel;
import edu.rpi.legup.ui.proofeditorui.rulesview.RulePanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ElementFrame extends JPanel {
    private static final String checkBox = "<font style=\"color:#00CD00\"> \u2714 </font>";
    private static final String xBox = "<font style=\"color:#FF0000\"> \u2718 </font>";
    private static final String htmlHead = "<html>";
    private static final String htmlTail = "</html>";

    private JTabbedPane tabbedPane;
    private JLabel status;
    private ButtonGroup buttonGroup;

    private EditorElementController controller;

    public ElementFrame(EditorElementController controller) {
        this.controller = controller;

        this.tabbedPane = new JTabbedPane();
        this.status = new JLabel();
        this.buttonGroup = new ButtonGroup();

        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(250, 256));
        setPreferredSize(new Dimension(330, 256));

        add(tabbedPane);
        add(status, BorderLayout.SOUTH);

        TitledBorder title = BorderFactory.createTitledBorder("Rules");
        title.setTitleJustification(TitledBorder.CENTER);
        setBorder(title);
    }

    public ButtonGroup getButtonGroup() {
        return buttonGroup;
    }

    public void resetSize() {
        int buttonWidth = ((ElementPanel) tabbedPane.getSelectedComponent()).getElementButtons()[0].getWidth();
        this.setMinimumSize(new Dimension(2 * buttonWidth + 64, this.getHeight()));
    }

    public EditorElementController getController() {
        return controller;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }
}
