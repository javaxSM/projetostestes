package course;

public class funcoes_string {

	public static void main(String[] args) {
		String original = "abcde FGHTIJ ABC abc DEFG";
		
		String s01 = original.toLowerCase();//Colocar letras em MINUSCULAS
		String s02 = original.toUpperCase();//Colocar letras em MAIUSCULAS
		String s03 = original.trim();//Tira os espa�os em branco
		String s04 = original.substring(2);//A partir de "tal" posi��o (inicio)
		String s05 = original.substring(2,9);//A partir de "tal" posi��o (inicio,fim)
		String s06 = original.replace('a','x'); //Substituir char
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		
		System.out.println("Original: " + original);
		System.out.println("Tolowercase: " + s01);
		System.out.println("toUPPERcase: " + s02);
		System.out.println("Trim: " + s03);
		System.out.println("SubString(2): " + s04);
		System.out.println("SubString(2,9): " + s05);
		System.out.println("replace: " + s06);
		System.out.println("Primeira posi��o: " + i);
		System.out.println("Ultima posi��o: " + j);
		
		
		
	}

}
