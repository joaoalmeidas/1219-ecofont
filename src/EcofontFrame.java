import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EcofontFrame extends JFrame{
	
	JPanel panelBotoes;
	
	JButton botaoAumentar;
	JButton botaoDiminuir;
	JTextArea campoEcofont;
	
	JLabel labelTamanho;
	
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
		
		labelTamanho = new JLabel();
		
		add(campoEcofont, BorderLayout.CENTER);
		add(labelTamanho, BorderLayout.SOUTH);
		
		botaoAumentar.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						campoEcofont.setFont(new Font("Serif", Font.BOLD, campoEcofont.getFont().getSize() + 1));
						labelTamanho.setText("Tamanho da fonte: " +campoEcofont.getFont().getSize());
						
						repaint();
					}
					
					
				}
				
		);
		
		botaoDiminuir.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						campoEcofont.setFont(new Font("Serif", Font.BOLD, campoEcofont.getFont().getSize() - 1));
						labelTamanho.setText("Tamanho da fonte: " +campoEcofont.getFont().getSize());
						
						repaint();
					}
					
					
				}
				
		);
		
	}
	
	
}
