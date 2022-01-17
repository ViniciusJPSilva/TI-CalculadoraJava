package vjps.calculadora.gui;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showInternalMessageDialog;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import vjps.calculadora.Calculadora;

public class IgCalculadora extends JDialog {
	
	private JLabel displayLabel;
	private JLabel displayCalculoLabel;

	/**
	 * Cria e exibe a GUI da Calculadora.
	 */
	public IgCalculadora() {
		//Finaliza a janela e a execução do programa.
		addWindowListener(
			new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			}
		);
		
		setTitle("Calculadora"); //Define o título da janela.
		
		setBounds(100, 100, 320, 460); //Define as dimensões da janela.
		getContentPane().setLayout(null);
		
		//Display da calculadora.
		displayLabel = new JLabel("0");
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 35));
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setToolTipText("Display principal");
		displayLabel.setBounds(12, 32, 280, 41);
		getContentPane().add(displayLabel);
		
		//Painel do teclado.
		JPanel tecladoPanel = new JPanel();
		tecladoPanel.setBounds(5, 75, 294, 334);
		getContentPane().add(tecladoPanel);
		tecladoPanel.setLayout(new GridLayout(6, 4, 5, 5));
		
		//Botões da calculadora.
		JButton porcentagemButton = new JButton("%");
		porcentagemButton.setToolTipText("Porcentagem (%)");
		porcentagemButton.setBorder(null);
		porcentagemButton.setBackground(SystemColor.text);
		porcentagemButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(porcentagemButton);
		
		JButton ceButton = new JButton("CE");
		ceButton.setToolTipText("Limpa o número exibido");
		ceButton.setBorder(null);
		ceButton.setBackground(SystemColor.text);
		ceButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(ceButton);
		
		JButton cButton = new JButton("C");
		cButton.setToolTipText("Limpa o cálculo atual");
		cButton.setBorder(null);
		cButton.setBackground(SystemColor.text);
		cButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(cButton);
		
		JButton backspaceButton = new JButton("<<");
		backspaceButton.setToolTipText("Backspace");
		backspaceButton.setBorder(null);
		backspaceButton.setBackground(SystemColor.text);
		backspaceButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(backspaceButton);
		
		JButton reciprocaButton = new JButton("¹/x");
		reciprocaButton.setToolTipText("Recíproca");
		reciprocaButton.setBorder(null);
		reciprocaButton.setFont(new Font("Arial", Font.PLAIN, 20));
		reciprocaButton.setBackground(SystemColor.text);
		tecladoPanel.add(reciprocaButton);
		
		JButton elevarQuadradoButton = new JButton("x²");
		elevarQuadradoButton.setToolTipText("Elevar ao quadrado");
		elevarQuadradoButton.setBorder(null);
		elevarQuadradoButton.setFont(new Font("Arial", Font.PLAIN, 20));
		elevarQuadradoButton.setBackground(SystemColor.text);
		tecladoPanel.add(elevarQuadradoButton);
		
		JButton raizQuadradaButton = new JButton("²√x");
		raizQuadradaButton.setToolTipText("Raíz quadrada");
		raizQuadradaButton.setBorder(null);
		raizQuadradaButton.setBackground(SystemColor.text);
		raizQuadradaButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(raizQuadradaButton);
		
		JButton divisaoButton = new JButton("÷");
		divisaoButton.setToolTipText("Dividir");
		divisaoButton.setBorder(null);
		divisaoButton.setBackground(SystemColor.text);
		divisaoButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(divisaoButton);
		
		JButton seteButton = new JButton("7");
		seteButton.setToolTipText("Sete");
		seteButton.setBorder(null);
		seteButton.setBackground(SystemColor.text);
		seteButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(seteButton);
		
		JButton oitoButton = new JButton("8");
		oitoButton.setToolTipText("Oito");
		oitoButton.setBorder(null);
		oitoButton.setBackground(SystemColor.text);
		oitoButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(oitoButton);
		
		JButton noveButton = new JButton("9");
		noveButton.setToolTipText("Nove");
		noveButton.setBorder(null);
		noveButton.setBackground(SystemColor.text);
		noveButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(noveButton);
		
		JButton multiplicacaoButton = new JButton("x");
		multiplicacaoButton.setToolTipText("Multiplicar");
		multiplicacaoButton.setBorder(null);
		multiplicacaoButton.setBackground(SystemColor.text);
		multiplicacaoButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(multiplicacaoButton);
		
		JButton quatroButton = new JButton("4");
		quatroButton.setToolTipText("Quatro");
		quatroButton.setBorder(null);
		quatroButton.setBackground(SystemColor.text);
		quatroButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(quatroButton);
		
		JButton cincoButton = new JButton("5");
		cincoButton.setToolTipText("Cinco");
		cincoButton.setBorder(null);
		cincoButton.setBackground(SystemColor.text);
		cincoButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(cincoButton);
		
		JButton seisButton = new JButton("6");
		seisButton.setToolTipText("Seis");
		seisButton.setBorder(null);
		seisButton.setBackground(SystemColor.text);
		seisButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(seisButton);
		
		JButton subtracaoButton = new JButton("-");
		subtracaoButton.setToolTipText("Subtrair");
		subtracaoButton.setBorder(null);
		subtracaoButton.setBackground(SystemColor.text);
		subtracaoButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(subtracaoButton);
		
		JButton umButton = new JButton("1");
		umButton.setToolTipText("Um");
		umButton.setBorder(null);
		umButton.setBackground(SystemColor.text);
		umButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(umButton);
		
		JButton doisButton = new JButton("2");
		doisButton.setToolTipText("Dois");
		doisButton.setBorder(null);
		doisButton.setBackground(SystemColor.text);
		doisButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(doisButton);
		
		JButton tresButton = new JButton("3");
		tresButton.setToolTipText("Três");
		tresButton.setBorder(null);
		tresButton.setBackground(SystemColor.text);
		tresButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(tresButton);
		
		JButton adicaoButton = new JButton("+");
		adicaoButton.setToolTipText("Somar");
		adicaoButton.setBorder(null);
		adicaoButton.setBackground(SystemColor.text);
		adicaoButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(adicaoButton);
		
		JButton inverterSinalButton = new JButton("+/-");
		inverterSinalButton.setToolTipText("Módulo");
		inverterSinalButton.setBorder(null);
		inverterSinalButton.setBackground(SystemColor.text);
		inverterSinalButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(inverterSinalButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.setToolTipText("Zero");
		zeroButton.setBorder(null);
		zeroButton.setBackground(SystemColor.text);
		zeroButton.setFont(new Font("Arial", Font.BOLD, 20));
		tecladoPanel.add(zeroButton);
		
		JButton decimalButton = new JButton(",");
		decimalButton.setToolTipText("Vírgula (Decimal)");
		decimalButton.setBorder(null);
		decimalButton.setBackground(SystemColor.text);
		decimalButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(decimalButton);
		
		JButton igualButton = new JButton("=");
		igualButton.setToolTipText("Igual");
		igualButton.setBorder(null);
		igualButton.setBackground(SystemColor.activeCaption);
		igualButton.setFont(new Font("Arial", Font.PLAIN, 20));
		tecladoPanel.add(igualButton);
		
		displayCalculoLabel = new JLabel("");
		displayCalculoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayCalculoLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		displayCalculoLabel.setToolTipText("Display do cálculo");
		displayCalculoLabel.setBounds(104, 12, 188, 20);
		getContentPane().add(displayCalculoLabel);
		
		//Ações dos botões
		zeroButton.addActionListener((e) -> adicionarDigito('0'));
		
		umButton.addActionListener((e) -> adicionarDigito('1'));
		
		doisButton.addActionListener((e) -> adicionarDigito('2'));
		
		tresButton.addActionListener((e) -> adicionarDigito('3'));
		
		quatroButton.addActionListener((e) -> adicionarDigito('4'));
		
		cincoButton.addActionListener((e) -> adicionarDigito('5'));
		
		seisButton.addActionListener((e) -> adicionarDigito('6'));
		
		seteButton.addActionListener((e) -> adicionarDigito('7'));
		
		oitoButton.addActionListener((e) -> adicionarDigito('8'));
		
		noveButton.addActionListener((e) -> adicionarDigito('9'));
		

		backspaceButton.addActionListener((e) -> apagarUltimoDigito());

		ceButton.addActionListener((e) -> limparDisplayPrincipal());
		
		cButton.addActionListener((e) ->{
			limparDisplayPrincipal();
			limparDisplayCalculo();
		});
		

		igualButton.addActionListener((e) -> finalizarCalculo());
		
		adicaoButton.addActionListener((e) -> efetuarCalculo("+"));
		
		subtracaoButton.addActionListener((e) -> efetuarCalculo("-"));
		
		multiplicacaoButton.addActionListener((e) -> efetuarCalculo("x"));
		
		divisaoButton.addActionListener((e) -> efetuarCalculo("÷"));
		
		decimalButton.addActionListener((e) -> gerarDecimal());
		
		inverterSinalButton.addActionListener((e) -> inverterSinal());
		

		reciprocaButton.addActionListener((e) -> calcularReciproca());
		
		elevarQuadradoButton.addActionListener((e) -> elevarQuadrado());
		
		raizQuadradaButton.addActionListener((e) -> raizQuadrada());
		
		porcentagemButton.addActionListener((e) -> porcentagem());
		
		setResizable(false); //Não redimensionável.
		setVisible(true); //Exibe a janela.
	}//Construtor
	
	protected void porcentagem() {
		adicionarDigito(padronizarDigito(Calculadora.multiplicar(obterNumeroDisplayCalculo(),  Calculadora.dividir(obterNumeroDisplayPrincipal(), 100))));
		finalizarCalculo();
	}

	private void raizQuadrada() {
		adicionarDigito(padronizarDigito(Calculadora.raizQuadrada(obterNumeroDisplayPrincipal())));
	}

	private void elevarQuadrado() {
		adicionarDigito(padronizarDigito(Calculadora.quadrado(obterNumeroDisplayPrincipal())));
	}

	private void calcularReciproca() {
		adicionarDigito(padronizarDigito(Calculadora.reciproca(obterNumeroDisplayPrincipal())));
	}

	private void inverterSinal() {
		Float numeroInvertido = Calculadora.inverterSinal(Float.parseFloat(displayLabel.getText().replace(',', '.')));
		adicionarDigito(padronizarDigito(numeroInvertido));
	}

	/**
	 * Adiciona um digito ao display.
	 */
	private void adicionarDigito(char digito) {
		displayLabel.setText(String.format("%s%c", (displayLabel.getText().equals("0") && digito != ',') ? "":displayLabel.getText(), digito));
	}//adicionarDigito()
	
	/**
	 * Adiciona um digito ao display.
	 */
	private void adicionarDigito(String digito) {
		displayLabel.setText(digito);
	}//adicionarDigito()
	
	/**
	 * Limpa o display principal.
	 */
	private void limparDisplayPrincipal() {
		displayLabel.setText("0");
	}//resetaDisplay()
	
	/**
	 * Limpa o display de cálculo.
	 */
	private void limparDisplayCalculo() {
		displayCalculoLabel.setText("");
	}//resetaDisplay()
	
	/**
	 *  
	 */
	private void efetuarCalculo(String operacao) {
		displayCalculoLabel.setText(String.format("%s %s", displayLabel.getText(), operacao));
		limparDisplayPrincipal();
	}//efetuarCalculo()
	
	/**
	 * 
	 */
	private void finalizarCalculo() {
		String textoDisplayCalculo = displayCalculoLabel.getText();
		if(!textoDisplayCalculo.isBlank()) {
			Float resultado = 0F,
					primeiroDigito = obterNumeroDisplayCalculo(),
					segundoDigito = obterNumeroDisplayPrincipal();
		
			String operacao = textoDisplayCalculo.substring(textoDisplayCalculo.indexOf(' ') + 1);
			
			switch(operacao) {
			case "+":
				resultado = Calculadora.somar(primeiroDigito, segundoDigito);
				break;
			case "-":
				resultado = Calculadora.subtrair(primeiroDigito, segundoDigito);
				break;
			case "x":
				resultado = Calculadora.multiplicar(primeiroDigito, segundoDigito);
				break;
			case "÷":
				if(segundoDigito == 0)
					showInternalMessageDialog(getContentPane(), "Não é possível dividir por zero", "Calculadora", ERROR_MESSAGE);
				else
					resultado = Calculadora.dividir(primeiroDigito, segundoDigito);
				break;
			}
		
			limparDisplayCalculo();
			limparDisplayPrincipal();
			
			adicionarDigito(padronizarDigito(resultado));
		}
	}//finalizarCalculo()
	
	private Float obterNumeroDisplayCalculo() {
		String textoDisplayCalculo = displayCalculoLabel.getText();
		return Float.parseFloat(textoDisplayCalculo.substring(0, textoDisplayCalculo.indexOf(' ')).replace(',', '.'));
	}

	private Float obterNumeroDisplayPrincipal() {
		return Float.parseFloat(displayLabel.getText().replace(',', '.'));
	}

	/**
	 * Padroniza um valor float para representa-lo no display obedecendo a forma padrão das calculadoras.
	 */
	private String padronizarDigito(Float digito) {
		return (digito != (int) ((double) digito)) ? (Float.toString(digito)).replace('.', ','):Integer.toString((int) Math.ceil(digito));
	}

	/**
	 * Apaga o último dígito do display principal.
	 */
	private void apagarUltimoDigito() {
		String textoDisplay = displayLabel.getText();
		displayLabel.setText((textoDisplay.length() > 1) ? textoDisplay.substring(0, textoDisplay.length() - 1):"0");
	}//apagarUltimoDigito()

	/**
	 * 
	 */
	private void gerarDecimal() {
		String digitosDisplay = displayLabel.getText();
		
		if(digitosDisplay.indexOf(',') != -1) return;
		
		adicionarDigito(',');
	}//gerarDecimal()
	
}//class IgCalculadora
