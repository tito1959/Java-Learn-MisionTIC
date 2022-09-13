import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {

	public static void main(String[] args) {

		JFrame marco = new MarcoRebote();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class multiPelota implements Runnable {

	private Pelota pelota;
	private Component componente;

	public multiPelota(Pelota pelota, Component componente) {
		this.pelota = pelota;
		this.componente = componente;
	}

	public void run() {

		while (!Thread.interrupted()) {
			pelota.mueve_pelota(componente.getBounds());
			componente.paint(componente.getGraphics());

			// movimieno de la pelota lento:
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
}

// Movimiento de la
// pelota-----------------------------------------------------------------------------------------

class Pelota {

	// Mueve la pelota invirtiendo posici�n si choca con l�mites
	public void mueve_pelota(Rectangle2D limites) {

		x += dx;
		y += dy;

		if (x < limites.getMinX()) {
			x = limites.getMinX();
			dx = -dx;
		}

		if (x + TAMX >= limites.getMaxX()) {
			x = limites.getMaxX() - TAMX;
			dx = -dx;
		}

		if (y < limites.getMinY()) {
			y = limites.getMinY();
			dy = -dy;
		}

		if (y + TAMY >= limites.getMaxY()) {
			y = limites.getMaxY() - TAMY;
			dy = -dy;
		}

	}

	// Forma de la pelota en su posici�n inicial
	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, TAMX, TAMY);
	}

	private static final int TAMX = 15;
	private static final int TAMY = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 2;
	private double dy = 1;

}

// L�mina que dibuja las
// pelotas----------------------------------------------------------------------

class LaminaPelota extends JPanel {

	// A�adimos pelota a la l�mina
	public void add(Pelota b) {
		pelotas.add(b);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		for (Pelota b : pelotas) {
			g2.fill(b.getShape());
		}

		// Asegura que el objeto gráfico se actualiza
		Toolkit.getDefaultToolkit().sync();
	}

	private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
}

// Marco con l�mina y
// botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame {

	public MarcoRebote() {

		setBounds(600, 300, 600, 350);
		setTitle("Rebotes");
		lamina = new LaminaPelota();
		add(lamina, BorderLayout.CENTER);
		JPanel laminaBotones = new JPanel();

		start1 = new JButton("Thread 1");
		start1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				comienza_el_juego(event);
			}
		});
		laminaBotones.add(start1);

		start2 = new JButton("Thread 2");
		start2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				comienza_el_juego(event);
			}
		});
		laminaBotones.add(start2);

		start3 = new JButton("Thread 3");
		start3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				comienza_el_juego(event);
			}
		});
		laminaBotones.add(start3);

		stop1 = new JButton("Stop 1");
		stop1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				detener(event);
			}
		});
		laminaBotones.add(stop1);

		stop2 = new JButton("Stop 2");
		stop2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				detener(event);
			}
		});
		laminaBotones.add(stop2);

		stop3 = new JButton("Stop 3");
		stop3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				detener(event);
			}
		});
		laminaBotones.add(stop3);

		add(laminaBotones, BorderLayout.SOUTH);
	}

	// A�ade pelota y la bota 1000 veces
	public void comienza_el_juego(ActionEvent event) {

		Pelota pelota = new Pelota();
		lamina.add(pelota);

		// llama la multitarea:
		Runnable runn1 = new multiPelota(pelota, lamina);

		if (event.getSource().equals(start1)) {
			thr1 = new Thread(runn1);
			thr1.start();
		}
		if (event.getSource().equals(start2)) {
			thr2 = new Thread(runn1);
			thr2.start();
		}
		if (event.getSource().equals(start3)) {
			thr3 = new Thread(runn1);
			thr3.start();
		}
	}

	public void detener(ActionEvent event) {
		// thr1.stop();
		if (event.getSource().equals(stop1)) {
			thr1.interrupt();
		}
		if (event.getSource().equals(stop2)) {
			thr2.interrupt();
		}
		if (event.getSource().equals(stop3)) {
			thr3.interrupt();
		}
		// Thread.currentThread().interrupt();
	}

	Thread thr1;
	Thread thr2;
	Thread thr3;

	JButton start1, start2, start3, stop1, stop2, stop3;

	private LaminaPelota lamina;

}
