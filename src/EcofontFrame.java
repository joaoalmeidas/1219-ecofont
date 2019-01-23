import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EcofontFrame extends JFrame{
	
	JPanel panelBotoes;
	
	JButton botaoAumentar;
	JButton botaoDiminuir;
	JTextArea campoEcofont;
	Font ecofont;
	
	public EcofontFrame() {
		
		super("Ecofont");
		setLayout(new BorderLayout());
		
		panelBotoes = new JPanel(new GridLayout(1, 2));
		add(panelBotoes, BorderLayout.NORTH);
		panelBotoes.setLayout(new FlowLayout());
		
		botaoAumentar = new JButton("Aumentar fonte");
		botaoDiminuir = new JButton("Diminuir fonte");
		panelBotoes.add(botaoAumentar);
		panelBotoes.add(botaoDiminuir);
		
		ecofont = new Font("Serif", Font.BOLD, 15);
		
		campoEcofont = new JTextArea();
		campoEcofont.setFont(ecofont);
		
		add(campoEcofont);
		add(campoEcofont, BorderLayout.CENTER);
	}
	
}
