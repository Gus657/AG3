
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Torre {

	public static void moverTorre(JLabel lbl, int x) 
	{
		String name =lbl.getName();
		System.out.println(name);
		lbl.setIcon(new ImageIcon(Tablero.class.getResource("/peson2.png")));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		x=0;
	}

}
