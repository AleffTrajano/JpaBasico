package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[]args) {
		
		
		
		//instanciando o EntityManagerFactory com o persistence-unit.
		EntityManagerFactory omf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//conexao com o banco
		EntityManager em = omf.createEntityManager();
		
		//metodo find faz uma busca no banco no caso pelo id2
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.print(p);

		
		/**persist ele pega o obj e salva no banco
		//ja que nao e apenas leitura do banco usa o  getTransaction()
		//*em.getTransaction().begin();
		//em.persist(p2);
		//em.persist(p3);
		//em.persist(p4);
		//em.getTransaction().commit();
		 * 
		 */
		
		
		System.out.println("finalizado");
		em.close();
		omf.close();
		
	}

}
