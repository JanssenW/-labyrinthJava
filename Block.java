
public class Block extends Elements {



int blockQtdX = 100;
int blockQtdY = 100;
static int blockHeight = Game.alturaTela/100;
static int blockWidth = Game.larguraTela/100;

int bHeight = blockHeight;
int bWidth = blockWidth;

boolean paintedB;



    public Block(double x, double y) {
        super(x, y, blockWidth, blockHeight);
        
        this.paintedB = false;
    }

    




}