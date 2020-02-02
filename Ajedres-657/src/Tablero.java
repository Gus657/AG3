import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class Tablero extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int x=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tablero() {
		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(72, 48, 54, 50);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel a8 = new JLabel("");
		a8.setHorizontalAlignment(SwingConstants.CENTER);
		a8.setIcon(new ImageIcon(Tablero.class.getResource("/torre.png")));
		a8.setBounds(0, 0, 54, 50);
		panel.add(a8);
		
		JLabel lblNewLabel_2 = new JLabel("8");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setBounds(-63, 22, 130, 28);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(126, 48, 54, 50);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel b8 = new JLabel("");
		b8.setIcon(new ImageIcon(Tablero.class.getResource("chess.png")));
		b8.setHorizontalAlignment(SwingConstants.CENTER);
		b8.setBounds(0, 0, 54, 50);
		panel_1.add(b8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(181, 48, 54, 50);
		panel_2.setBackground(Color.BLACK);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel c8 = new JLabel("");
		c8.setIcon(new ImageIcon(Tablero.class.getResource("/alfil.png")));
		c8.setHorizontalAlignment(SwingConstants.CENTER);
		c8.setBounds(0, 0, 54, 50);
		panel_2.add(c8);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(343, 48, 54, 50);
		panel_2_1.setBackground(Color.WHITE);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel f8 = new JLabel("");
		f8.setIcon(new ImageIcon(Tablero.class.getResource("/alfil.png")));
		f8.setHorizontalAlignment(SwingConstants.CENTER);
		f8.setBounds(0, 0, 54, 50);
		panel_2_1.add(f8);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(288, 48, 54, 50);
		panel_1_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel e8 = new JLabel("");
		e8.setIcon(new ImageIcon(Tablero.class.getResource("/yomero.png")));
		e8.setHorizontalAlignment(SwingConstants.CENTER);
		e8.setBounds(0, 0, 54, 50);
		panel_1_1.add(e8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(234, 48, 54, 50);
		panel_3.setBackground(Color.WHITE);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel d8 = new JLabel("");
		d8.setHorizontalAlignment(SwingConstants.CENTER);
		d8.setIcon(new ImageIcon(Tablero.class.getResource("/reina.png")));
		d8.setBounds(0, 0, 54, 50);
		panel_3.add(d8);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(451, 48, 54, 50);
		panel_1_1_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel h8 = new JLabel("");
		h8.setHorizontalAlignment(SwingConstants.CENTER);
		h8.setIcon(new ImageIcon(Tablero.class.getResource("/torre.png")));
		h8.setBounds(0, 0, 54, 50);
		panel_1_1_1.add(h8);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(397, 48, 54, 50);
		panel_3_1.setBackground(Color.BLACK);
		contentPane.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel g8 = new JLabel("");
		g8.setIcon(new ImageIcon(Tablero.class.getResource("/chess.png")));
		g8.setHorizontalAlignment(SwingConstants.CENTER);
		g8.setBounds(0, 0, 54, 50);
		panel_3_1.add(g8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(72, 98, 54, 50);
		panel_4.setBackground(Color.WHITE);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel a7 = new JLabel("");
		a7.setIcon(new ImageIcon(Tablero.class.getResource("/peon.png")));
		a7.setHorizontalAlignment(SwingConstants.CENTER);
		a7.setBounds(0, 0, 54, 50);
		panel_4.add(a7);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(126, 98, 54, 50);
		panel_1_2.setBackground(Color.BLACK);
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel b7 = new JLabel("");
		b7.setHorizontalAlignment(SwingConstants.CENTER);
		b7.setIcon(new ImageIcon(Tablero.class.getResource("/peon.png")));
		b7.setBounds(0, 0, 54, 50);
		panel_1_2.add(b7);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(181, 98, 54, 50);
		panel_2_2.setBackground(Color.WHITE);
		contentPane.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel c7 = new JLabel("");
		c7.setHorizontalAlignment(SwingConstants.CENTER);
		c7.setIcon(new ImageIcon(Tablero.class.getResource("/peon.png")));
		c7.setBounds(0, 0, 54, 50);
		panel_2_2.add(c7);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(234, 98, 54, 50);
		panel_3_2.setBackground(Color.BLACK);
		contentPane.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel d7 = new JLabel("");
		d7.setHorizontalAlignment(SwingConstants.CENTER);
		d7.setIcon(new ImageIcon(Tablero.class.getResource("/peon.png")));
		d7.setBounds(0, 0, 54, 50);
		panel_3_2.add(d7);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(288, 98, 54, 50);
		panel_1_1_2.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		
		JLabel e7 = new JLabel("");
		e7.setHorizontalAlignment(SwingConstants.CENTER);
		e7.setIcon(new ImageIcon(Tablero.class.getResource("/peon.png")));
		e7.setBounds(0, 0, 54, 50);
		panel_1_1_2.add(e7);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(343, 98, 54, 50);
		panel_2_1_1.setBackground(Color.BLACK);
		contentPane.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel f7 = new JLabel("");
		f7.setHorizontalAlignment(SwingConstants.CENTER);
		f7.setIcon(new ImageIcon(Tablero.class.getResource("/peon.png")));
		f7.setBounds(0, 0, 54, 50);
		panel_2_1_1.add(f7);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBounds(397, 98, 54, 50);
		panel_3_1_1.setBackground(Color.WHITE);
		contentPane.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel g7 = new JLabel("");
		g7.setHorizontalAlignment(SwingConstants.CENTER);
		g7.setIcon(new ImageIcon(Tablero.class.getResource("/peon.png")));
		g7.setBounds(0, 0, 54, 50);
		panel_3_1_1.add(g7);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(451, 98, 54, 50);
		panel_1_1_1_1.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JLabel h7 = new JLabel("");
		h7.setHorizontalAlignment(SwingConstants.CENTER);
		h7.setIcon(new ImageIcon(Tablero.class.getResource("/peon.png")));
		h7.setBounds(0, 0, 54, 50);
		panel_1_1_1_1.add(h7);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(72, 147, 54, 50);
		panel_5.setBackground(Color.BLACK);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel a6 = new JLabel("");
		a6.setBounds(0, 0, 54, 50);
		panel_5.add(a6);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(126, 147, 54, 50);
		panel_1_3.setBackground(Color.WHITE);
		contentPane.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel b6 = new JLabel("");
		b6.setBounds(0, 0, 54, 50);
		panel_1_3.add(b6);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBounds(181, 147, 54, 50);
		panel_2_3.setBackground(Color.BLACK);
		contentPane.add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JLabel c6 = new JLabel("");
		c6.setBounds(0, 0, 54, 50);
		panel_2_3.add(c6);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBounds(234, 147, 54, 50);
		panel_3_3.setBackground(Color.WHITE);
		contentPane.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JLabel d6 = new JLabel("");
		d6.setBounds(0, 0, 54, 50);
		panel_3_3.add(d6);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setBounds(288, 147, 54, 50);
		panel_1_1_3.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_3);
		panel_1_1_3.setLayout(null);
		
		JLabel e6 = new JLabel("");
		e6.setBounds(0, 0, 54, 50);
		panel_1_1_3.add(e6);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBounds(343, 147, 54, 50);
		panel_2_1_2.setBackground(Color.WHITE);
		contentPane.add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		
		JLabel f6 = new JLabel("");
		f6.setBounds(0, 0, 54, 50);
		panel_2_1_2.add(f6);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBounds(397, 147, 54, 50);
		panel_3_1_2.setBackground(Color.BLACK);
		contentPane.add(panel_3_1_2);
		panel_3_1_2.setLayout(null);
		
		JLabel g6 = new JLabel("");
		g6.setBounds(0, 0, 54, 50);
		panel_3_1_2.add(g6);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBounds(451, 147, 54, 50);
		panel_1_1_1_2.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1_2);
		panel_1_1_1_2.setLayout(null);
		
		JLabel h6 = new JLabel("");
		h6.setBounds(0, 0, 54, 50);
		panel_1_1_1_2.add(h6);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(72, 198, 54, 50);
		panel_6.setBackground(Color.WHITE);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel a5 = new JLabel("");
		a5.setBounds(0, 0, 54, 50);
		panel_6.add(a5);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(126, 198, 54, 50);
		panel_1_4.setBackground(Color.BLACK);
		contentPane.add(panel_1_4);
		panel_1_4.setLayout(null);
		
		JLabel b5 = new JLabel("");
		b5.setBounds(0, 0, 54, 50);
		panel_1_4.add(b5);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBounds(181, 198, 54, 50);
		panel_2_4.setBackground(Color.WHITE);
		contentPane.add(panel_2_4);
		panel_2_4.setLayout(null);
		
		JLabel c5 = new JLabel("");
		c5.setBounds(0, 0, 54, 50);
		panel_2_4.add(c5);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBounds(234, 198, 54, 50);
		panel_3_4.setBackground(Color.BLACK);
		contentPane.add(panel_3_4);
		panel_3_4.setLayout(null);
		
		JLabel d5 = new JLabel("");
		d5.setBounds(0, 0, 54, 50);
		panel_3_4.add(d5);
		
		JPanel panel_1_1_4 = new JPanel();
		panel_1_1_4.setBounds(288, 198, 54, 50);
		panel_1_1_4.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_4);
		panel_1_1_4.setLayout(null);
		
		JLabel a6_5 = new JLabel("");
		a6_5.setBounds(0, 0, 54, 50);
		panel_1_1_4.add(a6_5);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setBounds(343, 198, 54, 50);
		panel_2_1_3.setBackground(Color.BLACK);
		contentPane.add(panel_2_1_3);
		panel_2_1_3.setLayout(null);
		
		JLabel f5 = new JLabel("");
		f5.setBounds(0, 0, 54, 50);
		panel_2_1_3.add(f5);
		
		JPanel panel_3_1_3 = new JPanel();
		panel_3_1_3.setBounds(397, 198, 54, 50);
		panel_3_1_3.setBackground(Color.WHITE);
		contentPane.add(panel_3_1_3);
		panel_3_1_3.setLayout(null);
		
		JLabel g5 = new JLabel("");
		g5.setBounds(0, 0, 54, 50);
		panel_3_1_3.add(g5);
		
		JPanel panel_1_1_1_3 = new JPanel();
		panel_1_1_1_3.setBounds(451, 198, 54, 50);
		panel_1_1_1_3.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_1_3);
		panel_1_1_1_3.setLayout(null);
		
		JLabel h5 = new JLabel("");
		h5.setBounds(0, 0, 54, 50);
		panel_1_1_1_3.add(h5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(72, 247, 54, 50);
		panel_7.setBackground(Color.BLACK);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel a4 = new JLabel("");
		a4.setBounds(0, 0, 54, 50);
		panel_7.add(a4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBounds(126, 247, 54, 50);
		panel_1_5.setBackground(Color.WHITE);
		contentPane.add(panel_1_5);
		panel_1_5.setLayout(null);
		
		JLabel b4 = new JLabel("");
		b4.setBounds(0, 0, 54, 50);
		panel_1_5.add(b4);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBounds(181, 247, 54, 50);
		panel_2_5.setBackground(Color.BLACK);
		contentPane.add(panel_2_5);
		panel_2_5.setLayout(null);
		
		JLabel c4 = new JLabel("");
		c4.setBounds(0, 0, 54, 50);
		panel_2_5.add(c4);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setBounds(234, 247, 54, 50);
		panel_3_5.setBackground(Color.WHITE);
		contentPane.add(panel_3_5);
		panel_3_5.setLayout(null);
		
		JLabel d4 = new JLabel("");
		d4.setBounds(0, 0, 54, 50);
		panel_3_5.add(d4);
		
		JPanel panel_1_1_5 = new JPanel();
		panel_1_1_5.setBounds(288, 247, 54, 50);
		panel_1_1_5.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_5);
		panel_1_1_5.setLayout(null);
		
		JLabel e4 = new JLabel("");
		e4.setBounds(0, 0, 54, 50);
		panel_1_1_5.add(e4);
		
		JPanel panel_2_1_4 = new JPanel();
		panel_2_1_4.setBounds(343, 247, 54, 50);
		panel_2_1_4.setBackground(Color.WHITE);
		contentPane.add(panel_2_1_4);
		panel_2_1_4.setLayout(null);
		
		JLabel f4 = new JLabel("");
		f4.setBounds(0, 0, 54, 50);
		panel_2_1_4.add(f4);
		
		JPanel panel_3_1_4 = new JPanel();
		panel_3_1_4.setBounds(397, 247, 54, 50);
		panel_3_1_4.setBackground(Color.BLACK);
		contentPane.add(panel_3_1_4);
		panel_3_1_4.setLayout(null);
		
		JLabel g4 = new JLabel("");
		g4.setBounds(0, 0, 54, 50);
		panel_3_1_4.add(g4);
		
		JPanel panel_1_1_1_4 = new JPanel();
		panel_1_1_1_4.setBounds(451, 247, 54, 50);
		panel_1_1_1_4.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1_4);
		panel_1_1_1_4.setLayout(null);
		
		JLabel h4 = new JLabel("");
		h4.setBounds(0, 0, 54, 50);
		panel_1_1_1_4.add(h4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(72, 296, 54, 50);
		panel_8.setBackground(Color.WHITE);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel a3 = new JLabel("");
		a3.setBounds(0, 0, 54, 50);
		panel_8.add(a3);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBounds(126, 296, 54, 50);
		panel_1_6.setBackground(Color.BLACK);
		contentPane.add(panel_1_6);
		panel_1_6.setLayout(null);
		
		JLabel b3 = new JLabel("");
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(x==0)
				{
					x=1;
				}else {
					if(x==1) {
						Torre.moverTorre(b3,x);
						}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				b3.setOpaque(true);
				b3.setBackground(new Color(162,252, 186));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				b3.setOpaque(false);
				b3.setBackground(new Color(16,25, 86));
			}
		});
		b3.setBounds(0, 0, 54, 50);
		panel_1_6.add(b3);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setBounds(181, 296, 54, 50);
		panel_2_6.setBackground(Color.WHITE);
		contentPane.add(panel_2_6);
		panel_2_6.setLayout(null);
		
		JLabel c3 = new JLabel("");
		c3.setBounds(0, 0, 54, 50);
		panel_2_6.add(c3);
		
		JPanel panel_3_6 = new JPanel();
		panel_3_6.setBounds(234, 296, 54, 50);
		panel_3_6.setBackground(Color.BLACK);
		contentPane.add(panel_3_6);
		panel_3_6.setLayout(null);
		
		JLabel d3 = new JLabel("");
		d3.setBounds(0, 0, 54, 50);
		panel_3_6.add(d3);
		
		JPanel panel_1_1_6 = new JPanel();
		panel_1_1_6.setBounds(288, 296, 54, 50);
		panel_1_1_6.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_6);
		panel_1_1_6.setLayout(null);
		
		JLabel e3 = new JLabel("");
		e3.setBounds(0, 0, 54, 50);
		panel_1_1_6.add(e3);
		
		JPanel panel_2_1_5 = new JPanel();
		panel_2_1_5.setBounds(343, 296, 54, 50);
		panel_2_1_5.setBackground(Color.BLACK);
		contentPane.add(panel_2_1_5);
		panel_2_1_5.setLayout(null);
		
		JLabel a6_9_3_7 = new JLabel("");
		a6_9_3_7.setBounds(0, 0, 54, 50);
		panel_2_1_5.add(a6_9_3_7);
		
		JPanel panel_3_1_5 = new JPanel();
		panel_3_1_5.setBounds(397, 296, 54, 50);
		panel_3_1_5.setBackground(Color.WHITE);
		contentPane.add(panel_3_1_5);
		panel_3_1_5.setLayout(null);
		
		JLabel g3 = new JLabel("");
		g3.setBounds(0, 0, 54, 50);
		panel_3_1_5.add(g3);
		
		JPanel panel_1_1_1_5 = new JPanel();
		panel_1_1_1_5.setBounds(451, 296, 54, 50);
		panel_1_1_1_5.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_1_5);
		panel_1_1_1_5.setLayout(null);
		
		JLabel h3 = new JLabel("");
		h3.setBounds(0, 0, 54, 50);
		panel_1_1_1_5.add(h3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(72, 347, 54, 50);
		panel_9.setBackground(Color.BLACK);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel a2 = new JLabel("");
		a2.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		a2.setHorizontalAlignment(SwingConstants.CENTER);
		a2.setBounds(0, 0, 54, 50);
		panel_9.add(a2);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setBounds(126, 347, 54, 50);
		panel_1_7.setBackground(Color.WHITE);
		contentPane.add(panel_1_7);
		panel_1_7.setLayout(null);
		
		JLabel b2 = new JLabel("");
		
		

		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(x==0)
				{
					x=1;
					b2.setIcon(new ImageIcon(Tablero.class.getResource("/limpio.png")));
					
				}else {
					if(x==1) {
						Torre.moverTorre(b2,x);
						
						}
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				b2.setOpaque(true);
				b2.setBackground(new Color(162,252, 186));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				b2.setOpaque(false);
				b2.setBackground(new Color(12,25, 86));
			}
		});
		
		
		b2.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		b2.setBounds(0, 0, 54, 50);
		panel_1_7.add(b2);
		
		JPanel panel_2_7 = new JPanel();
		panel_2_7.setBounds(181, 347, 54, 50);
		panel_2_7.setBackground(Color.BLACK);
		contentPane.add(panel_2_7);
		panel_2_7.setLayout(null);
		
		JLabel c2 = new JLabel("");
		c2.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setBounds(0, 0, 54, 50);
		panel_2_7.add(c2);
		
		JPanel panel_3_7 = new JPanel();
		panel_3_7.setBounds(234, 347, 54, 50);
		panel_3_7.setBackground(Color.WHITE);
		contentPane.add(panel_3_7);
		panel_3_7.setLayout(null);
		
		JLabel d2 = new JLabel("");
		d2.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		d2.setHorizontalAlignment(SwingConstants.CENTER);
		d2.setBounds(0, 0, 54, 50);
		panel_3_7.add(d2);
		
		JPanel panel_1_1_7 = new JPanel();
		panel_1_1_7.setBounds(288, 347, 54, 50);
		panel_1_1_7.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_7);
		panel_1_1_7.setLayout(null);
		
		JLabel e2 = new JLabel("");
		e2.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		e2.setHorizontalAlignment(SwingConstants.CENTER);
		e2.setBounds(0, 0, 54, 50);
		panel_1_1_7.add(e2);
		
		JPanel panel_2_1_6 = new JPanel();
		panel_2_1_6.setBounds(343, 347, 54, 50);
		panel_2_1_6.setBackground(Color.WHITE);
		contentPane.add(panel_2_1_6);
		panel_2_1_6.setLayout(null);
		
		JLabel f2 = new JLabel("");
		f2.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		f2.setHorizontalAlignment(SwingConstants.CENTER);
		f2.setBounds(0, 0, 54, 50);
		panel_2_1_6.add(f2);
		
		JPanel panel_3_1_6 = new JPanel();
		panel_3_1_6.setBounds(397, 347, 54, 50);
		panel_3_1_6.setBackground(Color.BLACK);
		contentPane.add(panel_3_1_6);
		panel_3_1_6.setLayout(null);
		
		JLabel g2 = new JLabel("");
		g2.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		g2.setHorizontalAlignment(SwingConstants.CENTER);
		g2.setBounds(0, 0, 54, 50);
		panel_3_1_6.add(g2);
		
		JPanel panel_1_1_1_6 = new JPanel();
		panel_1_1_1_6.setBounds(451, 347, 54, 50);
		panel_1_1_1_6.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1_6);
		panel_1_1_1_6.setLayout(null);
		
		JLabel h2 = new JLabel("");
		h2.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		h2.setHorizontalAlignment(SwingConstants.CENTER);
		h2.setBounds(0, 0, 54, 50);
		panel_1_1_1_6.add(h2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(72, 397, 54, 50);
		panel_10.setBackground(Color.WHITE);
		contentPane.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel a1 = new JLabel("");
		a1.setIcon(new ImageIcon(Tablero.class.getResource("/torre2.png")));
		a1.setHorizontalAlignment(SwingConstants.CENTER);
		a1.setBounds(0, 0, 54, 50);
		panel_10.add(a1);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setBounds(126, 397, 54, 50);
		panel_1_8.setBackground(Color.BLACK);
		contentPane.add(panel_1_8);
		panel_1_8.setLayout(null);
		
		JLabel b1 = new JLabel("");
		b1.setIcon(new ImageIcon(Tablero.class.getResource("/caballo2.png")));
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setBounds(0, 0, 54, 50);
		panel_1_8.add(b1);
		
		JPanel panel_2_8 = new JPanel();
		panel_2_8.setBounds(181, 397, 54, 50);
		panel_2_8.setBackground(Color.WHITE);
		contentPane.add(panel_2_8);
		panel_2_8.setLayout(null);
		
		JLabel c1 = new JLabel("");
		c1.setIcon(new ImageIcon(Tablero.class.getResource("/alfil2.png")));
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setBounds(0, 0, 54, 50);
		panel_2_8.add(c1);
		
		JPanel panel_3_8 = new JPanel();
		panel_3_8.setBounds(234, 397, 54, 50);
		panel_3_8.setBackground(Color.BLACK);
		contentPane.add(panel_3_8);
		panel_3_8.setLayout(null);
		
		JLabel d1 = new JLabel("");
		d1.setIcon(new ImageIcon(Tablero.class.getResource("/reina2.png")));
		d1.setHorizontalAlignment(SwingConstants.CENTER);
		d1.setBounds(0, 0, 54, 50);
		panel_3_8.add(d1);
		
		JPanel panel_1_1_8 = new JPanel();
		panel_1_1_8.setBounds(288, 397, 54, 50);
		panel_1_1_8.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_8);
		panel_1_1_8.setLayout(null);
		
		JLabel e1 = new JLabel("");
		e1.setIcon(new ImageIcon(Tablero.class.getResource("/yomero2.png")));
		e1.setHorizontalAlignment(SwingConstants.CENTER);
		e1.setBounds(0, 0, 54, 50);
		panel_1_1_8.add(e1);
		
		JPanel panel_2_1_7 = new JPanel();
		panel_2_1_7.setBounds(343, 397, 54, 50);
		panel_2_1_7.setBackground(Color.BLACK);
		contentPane.add(panel_2_1_7);
		panel_2_1_7.setLayout(null);
		
		JLabel f1 = new JLabel("");
		f1.setIcon(new ImageIcon(Tablero.class.getResource("/alfil2.png")));
		f1.setHorizontalAlignment(SwingConstants.CENTER);
		f1.setBounds(0, 0, 54, 50);
		panel_2_1_7.add(f1);
		
		JPanel panel_3_1_7 = new JPanel();
		panel_3_1_7.setBounds(397, 397, 54, 50);
		panel_3_1_7.setBackground(Color.WHITE);
		contentPane.add(panel_3_1_7);
		panel_3_1_7.setLayout(null);
		
		JLabel g1 = new JLabel("");
		g1.setIcon(new ImageIcon(Tablero.class.getResource("/caballo2.png")));
		g1.setHorizontalAlignment(SwingConstants.CENTER);
		g1.setBounds(0, 0, 54, 50);
		panel_3_1_7.add(g1);
		
		JPanel panel_1_1_1_7 = new JPanel();
		panel_1_1_1_7.setBounds(451, 397, 54, 50);
		panel_1_1_1_7.setBackground(Color.BLACK);
		contentPane.add(panel_1_1_1_7);
		panel_1_1_1_7.setLayout(null);
		
		JLabel h1 = new JLabel("");
		h1.setIcon(new ImageIcon(Tablero.class.getResource("/torre2.png")));
		h1.setHorizontalAlignment(SwingConstants.CENTER);
		h1.setBounds(0, 0, 54, 50);
		panel_1_1_1_7.add(h1);
		
		JLabel lblNewLabel = new JLabel("Ajedr\u00E9s 657");
		lblNewLabel.setBounds(234, 11, 130, 28);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("8");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3.setBounds(16, 70, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("7");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(16, 113, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("6");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_2.setBounds(16, 165, 46, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("5");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_3.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_3.setBounds(16, 217, 46, 14);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("4");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_4.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_4.setBounds(16, 268, 46, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("3");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_5.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_5.setBounds(16, 317, 46, 14);
		contentPane.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("2");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_6.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_6.setBounds(16, 366, 46, 14);
		contentPane.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("1");
		lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7.setBounds(16, 415, 46, 14);
		contentPane.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("A");
		lblNewLabel_3_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7_1.setBounds(64, 459, 46, 14);
		contentPane.add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_3_7_2 = new JLabel("B");
		lblNewLabel_3_7_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7_2.setBounds(110, 458, 46, 14);
		contentPane.add(lblNewLabel_3_7_2);
		
		JLabel lblNewLabel_3_7_3 = new JLabel("C");
		lblNewLabel_3_7_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7_3.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7_3.setBounds(166, 458, 46, 14);
		contentPane.add(lblNewLabel_3_7_3);
		
		JLabel lblNewLabel_3_7_4 = new JLabel("D");
		lblNewLabel_3_7_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7_4.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7_4.setBounds(222, 458, 46, 14);
		contentPane.add(lblNewLabel_3_7_4);
		
		JLabel lblNewLabel_3_7_5 = new JLabel("E");
		lblNewLabel_3_7_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7_5.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7_5.setBounds(267, 458, 46, 14);
		contentPane.add(lblNewLabel_3_7_5);
		
		JLabel lblNewLabel_3_7_6 = new JLabel("F");
		lblNewLabel_3_7_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7_6.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7_6.setBounds(323, 458, 46, 14);
		contentPane.add(lblNewLabel_3_7_6);
		
		JLabel lblNewLabel_3_7_7 = new JLabel("G");
		lblNewLabel_3_7_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7_7.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7_7.setBounds(379, 458, 46, 14);
		contentPane.add(lblNewLabel_3_7_7);
		
		JLabel lblNewLabel_3_7_8 = new JLabel("H");
		lblNewLabel_3_7_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_7_8.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3_7_8.setBounds(435, 459, 46, 14);
		contentPane.add(lblNewLabel_3_7_8);
	}
}
