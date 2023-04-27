package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data date = new Data();
		date.ano = "1999";
		date.dia = "03";
		date.mes = "Dezembro";
		System.out.printf("Você nasceu dia %s de %s de %s", date.dia, date.mes, date.ano);
	}
}
