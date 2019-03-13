package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão ");
        double num1 = 0, num2 = 0, chave, resp = 0;
               
        chave = Double.parseDouble(JOptionPane.showInputDialog(null, "Nº Operador: "));
        
        if ((chave >= 5) || (chave <= 0)){
            JOptionPane.showMessageDialog(null, "DIGITE UM NÚMERO VÁLIDO");
            Calculadora.main(args);
        }
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 1:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 2:"));
        
        if (chave == 1) {
            resp = Operacoes.somaValor(num1, num2);
        } else if (chave == 2) {
            resp = Operacoes.subtraiValor(num1, num2);
        } else if (chave == 3) {
            resp = Operacoes.multiplicaValor(num1, num2);
        } else if (chave == 4) {
            resp = Operacoes.divideValor(num1, num2);
        } 
        
        Resposta.resposta(resp);
        Calculadora.Escolha(args);
        
    }
    
    public static void Escolha(String[] args) {
        double escolha = 0;
        
//        JOptionPane.showMessageDialog(null, "Deseja continuar? 5[S] / 6[N]");
        escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja continuar? 5[S] / 6[N]"));
        if ((escolha >= 7) || (escolha <= 4)){
            JOptionPane.showMessageDialog(null, "DIGITE UM NÚMERO VÁLIDO");
            Calculadora.Escolha(args);
        }
        
        if (escolha == 5) {
            Calculadora.main(args);
        } else if (escolha == 6) {
                JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
        }
    }
    
}
