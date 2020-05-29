import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Universe extends JPanel implements Runnable {

    private static Universe singleton;

    public Labyrinth labyrinth;


    public static synchronized Universe getInstance() {

        if (singleton == null) {
            singleton = new Universe();

        }
        singleton.requestFocus(true);
        return singleton;

    }

    public Universe (){




        this.setBackground(Color.WHITE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.requestFocus(true);
    }


    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        labyrinth.generateLabyrinth();
        labyrinth.paint(g);

       
    }








    public void run() {

        while (true) {







            this.requestFocus(true);

            try {
                Thread.sleep(45);
            } catch (InterruptedException ex) {

            }


        } 
    
    }

}