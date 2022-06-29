package jpql;

import javax.persistence.*;

public class JpaMain {
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();


        try {

            Member member = new Member();
            member.setUsername("member1");
            member.setAge(10);
            em.persist(member);

            TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
//            Query query2 = em.createQuery("select m.username, m.age from Member m");
            
            //결과가 하나일때
            Member result = query.getSingleResult();
            System.out.println("result = " + result);


            tx.commit();
        }catch (Exception e){
            tx.rollback();
            System.out.println("e = " + e);
        }finally {
            em.close();
        }

        emf.close();

    }



}
