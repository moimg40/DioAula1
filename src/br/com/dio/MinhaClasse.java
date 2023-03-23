package br.com.dio;

public class MinhaClasse {

	public static void main(String[] args) {
		String primeiroNome = "Paulo";
		String segundoNome = "Henrique";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println("Resuldado do método: " + nomeCompleto);
	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
}
