/* Exercicio Proposto: 
 Crie uma hierarquia de classes conforme abaixo com os seguintes 
atributos e comportamentos (observe a tabela), utilize os seus 
conhecimentos e distribua as características de forma que tudo o que 
for comum a todos os animais fique na classe Animal: 
 */
package ExercicioHeranca.Animal;

public class MainAnimal {

	public static void main(String[] args) {
	
		Cachorro co = new Cachorro();
		Cavalo ca = new Cavalo();
		Preguica pr = new Preguica();
		
		co.setNome("Pluto");
		co.setIdade(10);
		co.setSom("Sim");
		co.setCorrer("Sim");
		
		
		System.out.println("Nome: " + co.getNome());
		System.out.println("Idade: " + co.getIdade());
		System.out.println("Emite som: "  + co.getSom());
		System.out.println("Corre: " + co.getCorrer());
		System.out.println();
		
		ca.setNome("Nevasca");
		ca.setIdade(12);
		ca.setSom("Sim");
		ca.setCorrer("Sim");
		
		
		System.out.println("Nome: " + ca.getNome());
		System.out.println("Idade: " + ca.getIdade());
		System.out.println("Emite Som: " + ca.getSom());
		System.out.println("Corre: " + ca.getCorrer());
		System.out.println();
		
		pr.setNome("Zoo");
		pr.setIdade(5);
		pr.setSom("Sim");
		pr.setSubirArvore("Sim");
		
		
		System.out.println("Nome: " + pr.getNome());
		System.out.println("Idade: " + pr.getIdade());
		System.out.println("Emite som: " + pr.getSom());
		System.out.println("Sobe em Árvore: " + co.getCorrer());
		System.out.println();
	}
}


