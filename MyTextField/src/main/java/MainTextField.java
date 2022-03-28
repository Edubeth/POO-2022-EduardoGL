import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MainTextField {
    public static void main(String[] args) {
        JFrame fm = new JFrame("MyTextField");

        fm.setSize(350, 100);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setLayout( new FlowLayout(FlowLayout.CENTER, 20, 20));

        MyTextField ntf = new MyTextField(18);

        fm.add(ntf);
        fm.setVisible(true);
    }
}
