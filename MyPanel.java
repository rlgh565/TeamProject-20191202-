import javax.swing.*;
import java.awt.*;
import javax.swing.JComboBox;
import java.awt.event.*;
/**
 * Write a description of class MyPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPanel extends JPanel
{
    private JTextArea ta = new JTextArea(7,20);
    private JLabel mlName = new JLabel("이름");
    private JLabel mlDept = new JLabel("학과");
    private JLabel mlAddress = new JLabel("");
    private JButton btn1 = new JButton("추가");
    private JButton btn2 = new JButton("Clear");
    public MyPanel()
    {
        this.setLayout(new FlowLayout());
        this.add(mlName);
        this.add(new JTextField(20));
        this.add(mlDept);
        this.add(new JTextField("글소",20));
        this.add(mlAddress);
        this.add(new JTextField("서울..",20));
        this.add(new JLabel("학년"));
        JComboBox jcb = new JComboBox(new String[] {"1학년","2학년","3학년","4학년"});
        this.add(jcb);
        this.add(btn1);
        this.add(btn2);
        this.add(new JScrollPane(ta));
        btn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JTextField t = (JTextField)e.getSource();
                    ta.append(t.getText() + "\n");
                    t.setText("");
                }
            });
        btn2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                }
            });    
        setSize(300,300);
        setVisible(true);
    }
    
}
