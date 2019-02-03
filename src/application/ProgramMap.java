package application;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class ProgramMap {
	public static void main(String[] args) {
		
		// criando um map para armazenar cookies
		// tipo da chave e valor String String
		Map<String, String> cookies  = new TreeMap<>(); // tree map ordena
		
		cookies.put("username", "Dolores");
		cookies.put("email", "dol@gmail.com");
		cookies.put("phone", "+55119881528");
		
		cookies.remove("email");
		cookies.put("phone", "+5511876656"); // por nao aceitar repetição ele sobrepoe o anterior	
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone")); // pesquisando pela chave
		System.out.println("Email: " + cookies.get("email")); // se nao encontrar retorna null (removeu email)
		System.out.println("Size: " + cookies.size());
		
		
		System.out.println();
		System.out.println("ALL COOKIES:");
//		for (int i=0; i<=  cookies.size(); i++) {
		// para cada String key no meu conjunto de chaves key.set	
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
