import javax.swing.*;
<<<<<<< HEAD

/**
 * Frame역할을 하는 TextFieledFrame.
 * 
 * @author (2018315053 테라오카유이카) 
 * @version (2019.12.02)
 */
public class TextFieldFrame extends JFrame
{
    public MyPanel mp;
    public TextFieldFrame(){
        this.setTitle("라디오 버튼 만들기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        c.add(new JLabel("이름 "));
        c.add(new JTextField(20));
        c.add(new JLabel("학과 "));
        c.add(new JTextField("글로벌소프트웨어학과", 20));
        c.add(new JLabel("주소 "));
        c.add(new JTextField("수원시", 20));
=======
/**
 * Frame역할을 하는 TextFieledFrame.
 * 
 * @author (2018315053 테라오카유이카) 
 * @version (2019.12.02)
 */
public class TextFieldFrame extends JFrame
{
    public MyPanel mp;
    public TextFieldFrame(){
        this.setTitle("실습_4");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
>>>>>>> 2be2184e006dafe548e17dc7838d00e3b74bbc46
        
        
        mp = new MyPanel();
        this.add(mp);
        this.setSize(225,250);
        this.setVisible(true);
    }
}
