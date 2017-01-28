package labWork_3_4_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bulik on 22.09.2016.
 */
public class MyProgram extends JFrame {
    public MyProgram() throws HeadlessException {
        init();
        createControls();
    }
    private void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Application");
        this.setSize(new Dimension(350, 300));
        setLocation(250, 250);
    }
    private void createControls(){
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        panel.setLayout(new BorderLayout());
//        panel1.setLayout(new FlowLayout());
        panel1.setLayout(new GridLayout(5, 3, 10, 10));

        JButton button = new JButton("Ok");
        button.addActionListener(new ActionListener() {//
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Information");
            }
        });

        panel.add(button, BorderLayout.WEST);

        JButton button1 = new JButton("CANSEL");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
                panel.add(button1, BorderLayout.EAST);



        for (int i = 1; i<=15; i++){
            panel1.add(new JButton(" " + i));
        }
        panel.add(panel1, BorderLayout.CENTER);

        this.add(panel);

    }
}
