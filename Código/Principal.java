package numero1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Data d = new Data();
		d.setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia")));
		d.setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o mês")));
		d.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")));
		
		if((d.getDia()!=0)&&(d.getMes()!=0)) {
			JOptionPane.showMessageDialog(null,"Data válida: "+d.getDia()+"/"+d.getMes()+"/"+d.getAno());
		}else {
			JOptionPane.showMessageDialog(null,"Data inválida!");
		}
	}

}
