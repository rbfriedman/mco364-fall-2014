package rubinstein.chat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIPanel extends JPanel {
	private JPanel panel;
	private JTextField chatBox;
	private JButton sendButton;
	
	public GUIPanel(){
		panel = new JPanel();
		chatBox = new JTextField();
		chatBox.setPreferredSize(new Dimension(300, 50)); 
		sendButton = new JButton("SEND");
		add(panel);
		panel.add(chatBox, BorderLayout.CENTER);
		panel.add(sendButton, BorderLayout.EAST);
		
		sendButton.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    //send data to panel
			  }
			});

	}
	
	
	

}
