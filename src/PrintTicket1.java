import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintTicket1 extends JFrame
{
	public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime)
	{   Color mycolor= new Color(247,209,200);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());


		JPanel Panel2 = new JPanel(null);

		Panel2.setPreferredSize(new Dimension(500,200));

		JLabel LTitle = new JLabel("<html><font color=\"#C71585\",size=\"16\">PSG AirLines</font></html>");
		JLabel LFrom = new JLabel("<html><b><font color=\"#000000\",size=\"4\">From &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></b><font color=\"#4535DA\",size=\"4\">"+ sFrom+"</font></html>" );
		JLabel LTo = new JLabel("<html><font color=\"#000000\",size=\"4\">To &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#4535DA\",size=\"4\">"+sTo+"</font></html>");
		JLabel LClass = new JLabel("<html><font color=\"#000000\",size=\"4\">Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#4535DA\",size=\"4\">"+sClass+"</font></html>" );
		JLabel LBookingDate = new JLabel("<html><font color=\"#000000\",size=\"4\">Traveling Date &nbsp;&nbsp;  &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#4535DA\",size=\"4\">"+ sBookingDate+"</font></html>" );
		JLabel LPrice = new JLabel("<html><font color=\"#000000\",size=\"4\">Total Price &nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#4535DA\",size=\"4\">"+ iPrice+"</font></html>" );
		JLabel LTime = new JLabel("<html><font color=\"#000000\",size=\"4\">DepatureTime  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;:&nbsp;</font><font color=\"#4535da\",size=\"4\">"+ sTime+"</font></html>" );
		JLabel LAdult = new JLabel("<html><font color=\"#000000\",size=\"4\">Adult &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#4535DA\",size=\"4\">"+iAdult+"</font></html>" );
		JLabel LChildren = new JLabel("<html><font color=\"#000000\",size=\"4\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#4535DA\",size=\"4\">"+ iChildren+"</font></html>" );
		JLabel LInfant = new JLabel("<html><font color=\"#000000\",size=\"4\">Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#4535DA\",size=\"4\">"+iInfant+"</font></html>" );
		JLabel LWishes = new JLabel("<html><body><I><font color=\"#D2B48C\",size=\"5\">Wish you a happy journey</font></I></body></html>");


	

		


		LTitle.setBounds(170,15,500,45);
		LFrom.setBounds(20,80,300,20);
		LTo.setBounds(20,125,300,20);
		LClass.setBounds(20,170,300,20);
		LBookingDate.setBounds(20,215,300,20);
		LPrice.setBounds(20,260,300,20);
		LTime.setBounds(20,305,300,20);
		LAdult.setBounds(20,345,300,20);
		LChildren.setBounds(20,385,300,20);
		LInfant.setBounds(20,430,300,20);
		LWishes.setBounds(400,435,300,20);


		

		Panel2.add(LTitle);
		Panel2.add(LFrom);
		Panel2.add(LTo);
		Panel2.add(LClass);
		Panel2.add(LBookingDate);
		Panel2.add(LAdult);
		Panel2.add(LChildren);
		Panel2.add(LInfant);
		Panel2.add(LPrice);
		Panel2.add(LTime);
		Panel2.add(LWishes);
        Panel2.setBackground(mycolor);

		c.add(Panel2, BorderLayout.CENTER);
		setSize(700,650);
		setVisible(true);
	}
}
