
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Interface extends JFrame {
    /**

 * Запуск */
 public static void main(String[] args) {

     String[] ans1;
     ans1 = new String[4];
     ans1[0] = "1";
     ans1[1] = "2";
     ans1[2] = "3";
     ans1[3] = "4";
     Content.Choosing(ans1);
        EventQueue.invokeLater(new Runnable() {

            public void run() {

                Interface frame = new Interface();

                frame.setVisible(true);
             }

        });
    }

/**

 * Рамка.

 */

    public Interface() {



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 362, 362);

        setTitle("Quiz");

        getContentPane().setLayout(null);

//background

//        ImagePanel myImage = ImageIO.read(...);
//        JFrame myJFrame = new JFrame("Image pane");
//        myJFrame.setContentPane(new ImagePanel(myImage));

        //Question


// Button 1

        JButton btn1 = new JButton("Button 1");

        btn1.setBounds(111, 104, 128, 23);

        getContentPane().add(btn1);



// Button 2

        JButton btn2 = new JButton();

        btn2.setText("Button 2");

        btn2.setBounds(111, 134, 128, 23);

        getContentPane().add(btn2);

// Button 3

        JButton btn3 = new JButton();

        btn3.setText("Button 3");

        btn3.setBounds(111, 164, 128, 23);

        getContentPane().add(btn3);

        // Button 4

        JButton btn4 = new JButton();

        btn4.setText("Button 4");

        btn4.setBounds(111, 194, 128, 23);



        getContentPane().add(btn4);

 //Button 5 (Finish)

        JButton btn_finish = new JButton(new ImageIcon(getClass().getResource("next.png")));

        btn_finish.addActionListener(e -> JOptionPane.showMessageDialog(null,

                "Game over"));

        btn_finish.setBounds(156, 239, 46, 39);
        getContentPane().add(btn_finish);

    }

}