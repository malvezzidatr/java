package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data date = new Data();
		date.ano = "1999";
		date.dia = "03";
		date.mes = "12";
		String dataFormatada = date.formattedDate();
		System.out.println(dataFormatada);
	}
}
