package jpql;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();


        try {

//            Member member = new Member();
//            member.setUsername("member1");
//            member.setAge(10);
//            em.persist(member);

//            TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
////            Query query2 = em.createQuery("select m.username, m.age from Member m");
            //결과가 하나일때
//            Member result = query.getSingleResult();
//            System.out.println("result = " + result);

            //프로젝션

//            em.flush();
//            em.clear();

//            List<Member> result = em.createQuery("select m from Member m", Member.class).getResultList();
//            Member findMember = result.get(0);
//            findMember.setAge(20);

//            List<Team> result = em.createQuery("select t from Member m join m.team t", Team.class).getResultList();

//            List<Team> result = em.createQuery("select t from Member m join m.team t", Team.class).getResultList();

//            List<MemberDTO> resultList = em.createQuery("select new jpql.MemberDTO(m.username, m.age) from Member m", MemberDTO.class).getResultList();
//
//            MemberDTO memberDTO = resultList.get(0);
//            System.out.println("memberDTO.getUsername() = " + memberDTO.getUsername());
//            System.out.println("memberDTO.getAge() = " + memberDTO.getAge());
//
            //페이징
//            for(int i=0; i < 100; i++){
//
//                Member member = new Member();
//                member.setUsername("member"+i);
//                member.setAge(i);
//                em.persist(member);
//
//            }
//
//            em.flush();
//            em.clear();
//
//
//            List<Member> result = em.createQuery("select m from Member m order by m.age desc", Member.class)
//                    .setFirstResult(1)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            System.out.println("result.size() = " + result.size());
//            for (Member member1 : result) {
//                System.out.println("member1 = " + member1);
//            }

            //조인

            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("member1");
            member.setAge(10);
            member.setTeam(team);

            em.persist(member);

            em.flush();
            em.clear();

//            String query = "select m from Member m inner join m.team t";          //이너 조인
//            String query = "select m from Member m left join m.team t";             //아웃터 조인
//            String query = "select m from Member m , Team t where m.username = t.name";             //세타 조인

            String query = "select m from Member m left join m.team t on t.name= 'teamA'";          //ON 절 사용
            List<Member> result = em.createQuery(query,Member.class)
                    .getResultList();


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
