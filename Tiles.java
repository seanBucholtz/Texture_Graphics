/**
 * This class creates graphical patterns
 * 
 * Grading Level: Minimum
 * 
 * @author Sean Bucholtz
 * @version Assignment 11: Tiling
 */
public class Tiles {
  // Constant Fields
  public static final int WIDTH = 200;
  public static final int HEIGHT = 150;
  
  /**
   * Method displays a basket weave pattern
   */
  public void basketWeave() {
    DrawingPanel win = new DrawingPanel(WIDTH, HEIGHT);
    win.setTitle("Basket Weave");
    java.awt.Color horzC = new java.awt.Color(185,122,87);
    java.awt.Color vertC = new java.awt.Color(255,201,14);
    java.awt.Graphics g = win.getGraphics();
    for(int y = -5; y < HEIGHT; y += 80) {
      for(int x = -5; x < WIDTH; x += 80) {
        g.setColor(vertC);
        g.fillRect(x,y,40,40);
        g.setColor(java.awt.Color.BLACK);
        g.drawRect(x,y,20,40);
        g.drawRect(x+20,y,20,40);
        g.setColor(horzC);
        g.fillRect(x+40,y,40,40);
        g.setColor(java.awt.Color.BLACK);
        g.drawRect(x+40,y,40,20);
        g.drawRect(x+40,y+20,40,20);
      }
      for(int x = -5; x < WIDTH; x += 80) {
        g.setColor(horzC);
        g.fillRect(x,y+40,40,40);
        g.setColor(java.awt.Color.BLACK);
        g.drawRect(x,y+40,40,20);
        g.drawRect(x,y+60,40,20);
        g.setColor(vertC);
        g.fillRect(x+40,y+40,40,40);
        g.setColor(java.awt.Color.BLACK);
        g.drawRect(x+40,y+40,20,40);
        g.drawRect(x+60,y+40,20,40);
      }
    }
  }
  
  /**
   * Method displays a Mediterranean pattern.
   */
  public void Mediterranean1() {
    DrawingPanel win = new DrawingPanel(WIDTH, HEIGHT);
    win.setTitle("Med. 1");
    java.awt.Color octC = new java.awt.Color(255,255,64);
    java.awt.Graphics g = win.getGraphics();
    int[] octX = new int[8];
    int[] octY = new int[8];
    int[] sqX = new int[4];
    int[] sqY = new int[4];
    for(int y = -10; y < HEIGHT; y += 24) {
      for(int x = -10; x < WIDTH; x += 24) {
        octX[0] = x+7;
        octX[1] = x;
        octX[2] = x;
        octX[3] = x+7;
        octX[4] = x+17;
        octX[5] = x+24;
        octX[6] = x+24;
        octX[7] = x+17;
        octY[0] = y;
        octY[1] = y+7;
        octY[2] = y+17;
        octY[3] = y+24;
        octY[4] = y+24;
        octY[5] = y+17;
        octY[6] = y+7;
        octY[7] = y;
        g.setColor(octC);
        g.fillPolygon(octX,octY,8);
        g.setColor(java.awt.Color.BLACK);
        g.drawPolygon(octX,octY,8);
        sqX[0] = x+7;
        sqX[1] = x;
        sqX[2] = x-7;
        sqX[3] = x;
        sqY[0] = y;
        sqY[1] = y-7;
        sqY[2] = y;
        sqY[3] = y+7;
        g.setColor(java.awt.Color.red);
        g.fillPolygon(sqX,sqY,4);
        g.setColor(java.awt.Color.BLACK);
        g.drawPolygon(sqX,sqY,4);
      }
    }
  }
  
  /**
   * Method displays another version of the Mediterranean pattern 
   */
  public void Mediterranean2() {
    DrawingPanel win = new DrawingPanel(WIDTH, HEIGHT);
    win.setTitle("Med. 2");
    java.awt.Color octC = new java.awt.Color(192,192,128);
    java.awt.Color sqC = new java.awt.Color(0,112,192);
    java.awt.Graphics g = win.getGraphics();
    int sqSide = (int)Math.sqrt(Math.pow(7,2)+Math.pow(7,2));
    int octHeight = (int)(Math.sqrt(24*24+24*24)-(2*(7*(Math.sqrt(3)/2))));
    int[] sqX = new int[4];
    int[] sqY = new int[4];
    g.setColor(octC);
    g.fillRect(0,0,WIDTH,HEIGHT);
    for(int y = -5; y < HEIGHT; y += sqSide+octHeight) {
      for(int x = -5; x < WIDTH; x += 24) {
        sqX[0] = x;
        sqX[1] = x;
        sqX[2] = x+sqSide;
        sqX[3] = x+sqSide;
        sqY[0] = y;
        sqY[1] = y+sqSide;
        sqY[2] = y+sqSide;
        sqY[3] = y;
        g.setColor(sqC);
        g.fillPolygon(sqX,sqY,4);
        g.setColor(java.awt.Color.BLACK);
        g.drawPolygon(sqX,sqY,4);
        sqX[0] = x+12;
        sqX[1] = x+12;
        sqX[2] = x+sqSide+12;
        sqX[3] = x+sqSide+12;
        sqY[0] = y+(int)(octHeight);
        sqY[1] = y+sqSide+(int)(octHeight);
        sqY[2] = y+sqSide+(int)(octHeight);
        sqY[3] = y+(int)(octHeight);
        g.setColor(sqC);
        g.fillPolygon(sqX,sqY,4);
        g.setColor(java.awt.Color.BLACK);
        g.drawPolygon(sqX,sqY,4);
//        g.drawLine(x,y,x-(int)(10*Math.cos(Math.PI/4)), y-(int)(10*Math.sin(Math.PI/4)));
//        g.drawLine(x,y+sqSide,x-(int)(10*Math.cos(Math.PI/4)),(y+sqSide)+(int)(10*Math.sin(Math.PI/4)));
//        g.drawLine(x+sqSide,y+sqSide,(x+sqSide)+(int)(10*Math.cos(Math.PI/4)),(y+sqSide)+(int)(10*Math.sin(Math.PI/4)));
      }
    }
  }
  
  /**
   * Application Method
   * 
   * @params args the command line arguments.
   */
  public static void main(String[] args) {
    Tiles go = new Tiles();
    go.basketWeave();
    go.Mediterranean1();
    go.Mediterranean2();
  }

}