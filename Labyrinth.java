import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;


public class Labyrinth extends Elements {

    
   public Block blockAcess;
   int xBlock = 0;
   int yBlock = 0;


  
 

    public Labyrinth(double x, double y, int width, int height) {
        super(x, y, width, height);
    
    }

    List <List <Block>> block = new ArrayList<>();



    public void generateLabyrinth (){

        int blockQtdX = blockAcess.blockQtdX;
        int blockQtdY = blockAcess.blockQtdY;
        int blockQtd = blockQtdX*blockQtdY;
        int blockHeight = blockAcess.bHeight;
        int blockWidth = blockAcess.bWidth;


        for ( int i = 0; i == blockQtdX; i++ ){

            block.add(new ArrayList());

            for (int j = 0; j == blockQtdY; j++){

                block.get(i).add(new Block(xBlock, yBlock));

                if  ((i + j)%2 == 0){

                        block.get(i).get(j).paintedB = true;

                }

             

                xBlock = xBlock + blockWidth;

            }


        yBlock  = yBlock + blockHeight;
        xBlock = 0;    

        }


    }


    public void paint(Graphics g) {


        Graphics2D g2 = (Graphics2D) g;
        super.paint(g2);




        for (List<Block> arr : block) {
            for (Block i : arr) {

            if (i.paintedB){

                i.paint(g);
                System.out.println("painted");
            }

            }

        }


     

    }
}


     
