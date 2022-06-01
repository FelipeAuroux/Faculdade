package Calculadora;

import javax.swing.JOptionPane;

public class CalculadoraJO 
{
	public static void main(String[] args) 
	{
		String operacao;
		String entrada1;
		String entrada2;
		double valor1;
		double valor2;
		String resultado;
		
		
		operacao = JOptionPane.showInputDialog("Digite a operação que deseja realizar:"
				+ "\n 1- Soma\n 2- Subtração\n 3- Multiplicação\n 4- Divisão ");
		
		double calculo;
		calculo = Double.parseDouble(operacao); //Conversão de String pra inteiro
		
		entrada1 = JOptionPane.showInputDialog("Digite o primeiro valor para a operação: ");
		valor1 = Double.parseDouble(entrada1.replace(",", ".")); 
		
		entrada2 = JOptionPane.showInputDialog("Digite o segundo valor para a operação: ");
		valor2 = Double.parseDouble(entrada2.replace(",", "."));
		
		if(calculo == 1) 
			{
				double conta = valor1 + valor2;
				resultado = "O resultado da soma é: " + conta;
				JOptionPane.showMessageDialog(null, resultado);
			} else if (calculo ==2)
				{
					double conta = valor1 - valor2;
					resultado = "O resultado da subtração é: " + conta;
					JOptionPane.showMessageDialog(null, resultado);
				}else if (calculo == 3)
					{
						double conta = valor1 * valor2;
						resultado = "O resultado da multiplicação é: " + conta;
						JOptionPane.showMessageDialog(null, resultado);
					} else if (calculo == 4)
						{
							double conta = valor1 / valor2;
							resultado = "O resultado da divisão é: " + conta;
							JOptionPane.showMessageDialog(null, resultado);
						}
		
			
	}

}
