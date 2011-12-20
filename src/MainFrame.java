import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Created by JFormDesigner on Thu Jun 23 14:21:16 CEST 2011
 */



/**
 * @author User #2
 */
public class MainFrame extends JFrame {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }

    private JFileChooser fileChooser;

    public MainFrame() {
        initComponents();
        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }

    private void btDatyZdjecActionPerformed(ActionEvent e) {
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            AtrybutyPlikowZeZdjeciami.zmienDaty(fileChooser.getSelectedFile());
        }
    }

    private void btM3UListActionPerformed(ActionEvent e) {
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            ListaM3U.utworzListeM3U(fileChooser.getSelectedFile(), false);
        }
    }

    private void btM3UListRecursiveActionPerformed(ActionEvent e) {
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            ListaM3U.utworzListeM3U(fileChooser.getSelectedFile(), true);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        btDatyZdjec = new JButton();
        btM3UList = new JButton();
        btM3UListRecursive = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        //---- btDatyZdjec ----
        btDatyZdjec.setText("Zmiana Daty Ostatniej Edycji Zdjec");
        btDatyZdjec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btDatyZdjecActionPerformed(e);
            }
        });
        contentPane.add(btDatyZdjec, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- btM3UList ----
        btM3UList.setText("Create M3U list");
        btM3UList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btM3UListActionPerformed(e);
            }
        });
        contentPane.add(btM3UList, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- btM3UListRecursive ----
        btM3UListRecursive.setText("Create M3U list recursive");
        btM3UListRecursive.setToolTipText("Tworzy listy M3U we wskazanym katalogu i rekursywnie w g\u0142\u0105b.");
        btM3UListRecursive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btM3UListRecursiveActionPerformed(e);
            }
        });
        contentPane.add(btM3UListRecursive, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton btDatyZdjec;
    private JButton btM3UList;
    private JButton btM3UListRecursive;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
