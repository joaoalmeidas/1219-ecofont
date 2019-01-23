import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EcofontFrame extends JFrame{
	
	JPanel panelBotoes;
	
	JButton botaoAumentar;
	JButton botaoDiminuir;
	JTextArea campoEcofont;
	
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
		
		
		campoEcofont = new JTextArea();
		campoEcofont.setFont(new Font("Serif", Font.BOLD, 10));
		
		add(campoEcofont);
		add(campoEcofont, BorderLayout.CENTER);
		
		botaoAumentar.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						campoEcofont.setFont(new Font("Serif", Font.BOLD, campoEcofont.getFont().getSize() + 1));
						
						repaint();
					}
					
					
				}
				
		);
		
		botaoDiminuir.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						campoEcofont.setFont(new Font("Serif", Font.BOLD, campoEcofont.getFont().getSize() - 1));
						
						repaint();
					}
					
					
				}
				
		);
	}
	
	
}
