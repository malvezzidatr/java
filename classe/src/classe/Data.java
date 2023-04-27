package classe;

public class Data {
	String dia;
	String mes;
	String ano;
	
	String formattedDate() {
		return String.format("%s/%s/%s", dia, mes, ano);
	}
}
