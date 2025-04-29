//NOSONAR
package principal;

import javax.swing.JOptionPane;
import model.Calculadora;

@SuppressWarnings("all") 
public class Principal {
    public static void main(String[] args) {
        String opcao = "";
        Calculadora calculadora = new Calculadora();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Adicao \n3 - Subtracao \n4 - Multiplicação \n5 - Divisao \n9 - Sair");
            if (opcao == null) { 
                break;
            }
            try {
                int escolha = Integer.parseInt(opcao);
                switch (escolha) {
                    case 1:
                        calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                        calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getSoma());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Diferenca: " + calculadora.getDiferenca());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Quociente: " + calculadora.getQuociente());
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Saindo...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número válido.");
            }
        }
    }
}
