package estatistica;

import javax.swing.JOptionPane;

public class Estatistica {

    public static void main(String[] args) {
        faz();
    }
    
    
    public static void faz(){
        int qv = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de variáveis"));
        String[] nv = new String[qv];
        for(int i = 0; i<qv; i++){
            nv[i] = JOptionPane.showInputDialog("Digite o nome da "+(i+1)+"ª variável.");
        }
        int qi = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de indivíduos"));
        String [][] tabela = new String[qv+1][qi];
        for(int i = 0; i<qi; i++){
            
            for(int j = 0; j<qv+1; j++){
                if(j == 0){
                    tabela[j][i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"º indivíduo.");
                }
                else{
                    tabela[j][i] = JOptionPane.showInputDialog("Digite o valor da variável "+nv[j-1]+" do indivíduo "+tabela[0][i]);
                }                
            }
        }
    }
}
