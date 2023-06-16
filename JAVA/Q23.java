// 23. Design a java program to handle keyboard events.

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Q23" width=400 height=200> </applet>*/
public class Q23 extends Applet implements KeyListener {
    String data="";
    int x,y,px,py;
    public void init() {
        px=0;
        py=0;
        x=px;
        y=py;
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent k) {
        int code=k.getKeyCode();
        if(code==KeyEvent.VK_LEFT) {
            x-=20;
        }
        if(code==KeyEvent.VK_RIGHT) {
            x+=20;
        }
        if(code==KeyEvent.VK_UP) {
            y-=20;
        }
        if(code==KeyEvent.VK_DOWN) {
            y+=20;
        }
        Graphics g=getGraphics();
        g.drawLine(px,py,x,y);
        px=x;
        py=y;
    }
    public void keyTyped(KeyEvent k) {}
    public void keyReleased(KeyEvent k) {}
}
