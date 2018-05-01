import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jbtLeft = new JButton("<--");
    private JButton jbtRight = new JButton("-->");
    private JButton jbtExit = new JButton("Exit");
    private JLabel jlbFace = new JLabel("> ___ <");
    private  int  x = 30 ;
    public MainFrame () {
        init();
    }
    private void init () {
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(40,40,1280,960);

        jbtLeft.setBounds(30,30,200,120);
        jbtRight.setBounds(240,30,200,120);
        jbtExit.setBounds(450,30,200,120);
        jlbFace.setBounds(x,180,100,120);

        jbtLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= 10 ;
                jlbFace.setLocation(x,180);
            }
        });

        jbtRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += 10;
                jlbFace.setLocation(x,180);
            }
        });

        jbtExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.add(jbtLeft);
        this.add(jbtRight);
        this.add(jbtExit);
        this.add(jlbFace);
    }
}
