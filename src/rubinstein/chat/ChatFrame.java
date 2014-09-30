package rubinstein.chat;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class ChatFrame extends JFrame {
	private ChatServer server;
	private GUIPanel guiPanel;
	private JTextPane jPane;
	private JPanel containerPanel;
	private JScrollPane areaScrollPane;
	private StringBuilder myMessage;

	public ChatFrame(GUIPanel guiPanel) {
		
		this.guiPanel = guiPanel;
		guiPanel.setSize(getWidth(), 100);
		this.jPane = new JTextPane();
		myMessage = new StringBuilder();
		jPane.setText(myMessage.toString());
		areaScrollPane = new JScrollPane(jPane);
		areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane.setPreferredSize(new Dimension(400, 250));
		

		jPane.setPreferredSize(new Dimension(400, 150));
		this.containerPanel = new JPanel();
		add(containerPanel);
		this.setTitle("My Chat");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		containerPanel.add(areaScrollPane);
		containerPanel.add(guiPanel);
		setVisible(true);
		server = new ChatServer(this);

	}

	public static void main(String[] args) {
		ChatFrame c = new ChatFrame(new GUIPanel());
		
	}
	
	public void appendMessage(String message){
		jPane.setText(myMessage.append(message).append("\n").toString());
		jPane.repaint();
		
	}

}
