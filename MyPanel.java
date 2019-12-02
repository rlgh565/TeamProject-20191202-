import javax.swing.*;
import java.awt.*;
import javax.swing.JComboBox;
/**
 * Write a description of class MyPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPanel extends JPanel
{
    public MyPanel()
    {
        this.setLayout(new FlowLayout());
        this.add(new JLabel("이름"));
        this.add(new JTextField(20));
        this.add(new JLabel("학과"));
        this.add(new JTextField("글소",20));
        this.add(new JLabel("주소"));
        this.add(new JTextField("서울..",20));
        
        this.add(new JLabel("학년"));
        JComboBox jcb = new JComboBox(new String[] {"1학년","2학년","3학년","4학년"});
        
    }
    
}
