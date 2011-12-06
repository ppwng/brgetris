import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Geometrical extends Applet implements KeyListener {

	int width, height, color;
	int itype[][][] = {
			// 0 0 0 0
			// 0 0 x 0
			// 0 x x x "T Stein"
			// 0 0 0 0
			{ { 0, 0, 1, 0 }, { 0, 1, 1, 1 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } },

			// 0 0 0 0
			// 0 0 x 0
			// 0 x x x "T Stein"
			// 0 0 0 0
			{ { 0, 0, 1, 0 }, { 0, 0, 1, 1 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } },
			// x
			// x "I Stein"
			// x
			// x
			{ { 0, 1, 1, 1 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } },

			// 0 0 0 0
			// 0 0 x 0
			// 0 x x x "T Stein"
			// 0 0 0 0
			{ { 0, 0, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } }, };
	int posX;
	int posY;

	public void init() {
		height = getSize().height;
		width = getSize().width;
		setBackground(Color.BLACK);
		posX = 0;
		posY = 0;
		addKeyListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(Color.ORANGE);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (itype[0][i][j] == 1) { //0 durch Variable ersetzen
					g.fill3DRect(posX + j * 10, posY + i * 10, 10, 10, true);
				}
			}

		}
		// g.fill3DRect(width / 2, height / 2, 10, 10, true);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			posX += 10;
			repaint();
			arg0.consume();
		} else if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			posX -= 10;
			repaint();
			arg0.consume();
		}
		if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			posX -= 10;
			repaint();
			arg0.consume();
		} else if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			posX += 10;
			repaint();
			arg0.consume();
		}
	
	}
}
