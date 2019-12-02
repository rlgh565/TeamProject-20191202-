import javax.swing.*;
/**
 * Frame역할을 하는 TextFieledFrame.
 * 
 * @author (2018315053 테라오카유이카) 
 * @version (2019.12.02)
 */
public class TextFieledFrame extends JFrame
{
    public MyPanel mp;
    public TextFieldFrame(){
        this.setTitle("라디오 버튼 만들기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        mp = new MyPanel();
        this.add(mp);
        this.setSize(225,250);
        this.setVisible(true);
    }
}
