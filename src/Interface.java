
import java.awt.EventQueue;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Interface extends JFrame {
    /**

 * Запуск */
 public static void main(String[] args) {

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

        setBounds(100, 100, 362, 249);

        setTitle("Quiz");

        getContentPane().setLayout(null);

//background

        ImagePanel myImage = ImageIO.read(...);
        JFrame myJFrame = new JFrame("Image pane");
        myJFrame.setContentPane(new ImagePanel(myImage));

// Button 1

        JButton btn1 = new JButton("Button 1");

        btn1.setBounds(129, 49, 99, 23);

        getContentPane().add(btn1);



// Button 2

        JButton btn2 = new JButton();

        btn2.setText("Button 2");

        btn2.setBounds(111, 74, 128, 23);

        getContentPane().add(btn2);



// Button 3 (Icon)

//        JButton btn3 = new JButton(new ImageIcon(getClass().getResource("save.gif")));
//
//        btn3.addActionListener(e -> JOptionPane.showMessageDialog(null,
//
//                "Hello"));
//
//        btn3.setBounds(156, 119, 46, 39);
//        getContentPane().add(btn3);

    }

}