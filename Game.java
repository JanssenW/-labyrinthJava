import java.awt.Dimension;

import javax.swing.JFrame;

public class Game {

    static int larguraTela = 900;
    int largura = larguraTela;
    static int alturaTela = 900;
    int altura = alturaTela;


    public static void main(String[] args) {

        JFrame frame = new JFrame("Labyrinth");
        


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(larguraTela, alturaTela));

       Universe universe = Universe.getInstance();
       frame.getContentPane().add(universe);
        //frame.addKeyListener(Ship.getInstance());
        universe.requestFocus(true);
    
        frame.pack(); //faz com que o frame se ajuste
        frame.setLocationByPlatform(true);
        frame.setVisible(true); // se não colocar o jframe n estrá visivel
        Thread t = new Thread(universe);
        t.start();
        
    }


}