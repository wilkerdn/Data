package numero1;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
		dia = 0;
		mes = 0;
		ano = 0;
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if((dia>=1)&&(dia<=31)) {
			this.dia = dia;
		}else {
			this.dia = 0;
		}
	}
    
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		if((mes>=1)&&(mes<=12)) {
			this.mes = mes;
		}else {
			this.mes = 0;
		}
	}

	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
}