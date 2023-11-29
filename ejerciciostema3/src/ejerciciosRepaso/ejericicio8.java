package ejerciciosRepaso;

public class ejericicio8 {
	public static void main(String[] args) {
		String html = "<html><head/><body><h1>Mi página web</h1><h2>Ej 8 de Programación</h2><br/><br/><p>Funciona?</p><p>Sí!!</p></body></html>";
		String[] htmlDv = html.split("");
		Boolean entra = false;
		for (int i = 0; i < htmlDv.length; i++) {
			if (htmlDv[i].equals("<")) {
				entra = true;
			} else if (htmlDv[i].equals(">")) {
				entra = false;
			} else if (!entra) {
				System.out.print(htmlDv[i]);
			} if (htmlDv[i].equals(">") && i+1!=htmlDv.length && !htmlDv[i+1].equals("<")) {
				System.out.println();
			}
			
		}
	}
}
