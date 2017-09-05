import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="MouseEven" width=1500 height=950></applet>*/
public class MouseEven extends Applet implements MouseListener,MouseMotionListener
{
	
	String msg=" ";
	Image I;
	int mouseX=0,mouseY=0;
	public void init()
	{
		I=getImage(getCodeBase(),"M.jpg");
		BackGroundPanel bgp = new BackGroundPanel();
        bgp.setLayout(new FlowLayout());
        bgp.setBackGroundImage(I);
		setLayout(new BorderLayout());      add(bgp);
		bgp.addMouseListener(this);
		bgp.addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="Mouse Clicked";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="Exited";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		mouseX=0;
		mouseY=10;
		msg="Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Down";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Up";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="*";
		showStatus("Dragging mouse at"+me.getX()+","+me.getY());
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		showStatus("moving mouse at"+me.getX()+","+me.getY());
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
	}
}
class BackGroundPanel extends Panel {
     Image backGround;

     BackGroundPanel() {
          super();
     }

     public void paint(Graphics g) {

          // get the size of this panel (which is the size of the applet),
          // and draw the image
          g.drawImage(getBackGroundImage(), 0, 0,
              (int)getBounds().getWidth(), (int)getBounds().getHeight(), this);
     }

     public void setBackGroundImage(Image backGround) {
          this.backGround = backGround;    
     }

     private Image getBackGroundImage() {
          return backGround;    
     }
}