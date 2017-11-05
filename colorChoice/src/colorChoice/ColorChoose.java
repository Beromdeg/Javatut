package colorChoice;
import java.awt.*;	//for JPanel
import java.awt.event.*;
import javax.swing.*;	//for JFrame

//Simple gui for choosing panel color
public class ColorChoose extends JFrame{
	//defn our variables for the colorchoose
	private JButton b;
	private Color c = (Color.WHITE);	//default is white
	private JPanel p;
	
	//constructor
	public ColorChoose(){
		super("ChangeMyColor");		//JFrame title
		p = new JPanel();
		p.setBackground(c);
		b = new JButton("Color Options");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				c = JColorChooser.showDialog(null, "Color Box", c);	//popup the ColorChoooser
				if(c == null)	//nothing choose
					c = (Color.WHITE);
				p.setBackground(c);
			}
		});
		//adding the panel and button
		add(p, BorderLayout.CENTER);	//position center of the window
		add(b, BorderLayout.SOUTH);		//position bottom
	} //our constructor window ends 
}
