package hellojpa;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.annotations.common.reflection.XMember;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class JpaMain {
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

//        Member member = new Member();
//        member.setId(2L);
//        member.setName("HelloB");
//
//        em.persist(member);
//
//        tx.commit();
//
//        em.close();
//
//        emf.close();
        //리팩 토링 (정석 코드)
        
        try {
            //저장
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HelloB");   
//            em.persist(member);X

            //찾기
//            Member findMember = em.find(Member.class,1L);

            //수정
//            Member findMember = em.find(Member.class,1L);
//            findMember.setName("HelloJPA");                 //JPA가 트랜젝션을 커밋하는 시점에서 체크해서 업데이트

            //쿼리 조회
//            List<Member> result = em.createQuery("select m from Member as m",Member.class)
//                    .getResultList();

//            //페이징추가
//            List<Member> result = em.createQuery("select m from Member as m",Member.class)
//                    .setFirstResult(5)                  //추가 하면 limit 를 자동 추가
//                    .setMaxResults(8)
//                    .getResultList();
//
//            for(Member member : result){
//                System.out.println("member.name = " + member.getName());
//            }
            
//            //비영속
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA");
//
//            //영속
//            System.out.println("===BEFORE===");
//            em.persist(member);
//            System.out.println("===AFTER===");
//
//            Member findMember = em.find(Member.class, 101L);
//
//            System.out.println("findMember = " + findMember.getId());
//            System.out.println("findMember = " + findMember.getName());

//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);
//
//            //1차 캐시에서 가져오기 때문에 같은 값이 나옴
//            // result = true
//            System.out.println("result = "+(findMember1 == findMember2) );

//              //영속
//              Member member1 = new Member(150L, "A");
//              Member member2 = new Member(160L, "B");
//
//              em.persist(member1);
//              em.persist(member2);
//
//              System.out.println("============================");
            
            //수정
//            Member member = em.find(Member.class, 150L);
//            member.setName("ZZZZZ");
            
            //플러시발생
//            Member member = new Member(200L,"member200");
//            em.persist(member);    // 영속성 컨텍스트 저장소에 담기고
//
//            em.flush();   //플러시 발생생
            
            //준영속
//            Member member = em.find(Member.class, 150L);
//            member.setName("AAAA");   // 영속 상태
//
//            //em.clear();  -> 영속성 초기화
//
//            em.detach(member);  //영속에서 분리 -> 준영속 상태
//
//            System.out.println("====================");

//            //엔티티 매핑 실습
//            Member member = new Member();
//            member.setUsername("C");
//
//            em.persist(member);

            //단방향 연관관계
//            Team team = new Team();
//            team.setName("TeamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.setTeam(team);
//
//            em.persist(member);

            //영속성 컨텍스트를 통한 초기화
//            em.flush();
//            em.clear();

//            Member findMember = em.find(Member.class, member.getId());
//
//            Team findTeam = findMember.getTeam();
//            System.out.println("findTeam = "+findTeam.getName());
//
//            Team newTeam = em.find(Team.class, 100L);
//            findMember.setTeam(newTeam);
            
//            //양방향 연관관계
//            Team team = new Team();
//            team.setName("TeamA");
////            team.getMembers().add(Member);
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member1");
////            member.changeTeam(team);
//
//            em.persist(member);
//
////            team.getMembers().add(member);
//
//            team.addMember(member);
//
//            em.flush();
//            em.clear();
//
////            Member findMember = em.find(Member.class, member.getId());
//            Team findTeam = em.find(Team.class, team.getId()); //1차 캐시
//            List<Member> members = findTeam.getMembers();
//
//
//            System.out.println("=====================");
//            for (Member m : members) {
//                System.out.println("m="+m.getUsername());
//            }
//            System.out.println("=====================");

//            //상속관계 매핑
//            Movie movie = new Movie();
//            movie.setDirector("aaaa");
//            movie.setActor("bbbb");
//            movie.setName("바람과함께사라지다");
//            movie.setPrice(10000);
//
//            em.persist(movie);
//
//            em.flush();
//            em.clear();
//
//            Movie findMove = em.find(Movie.class, movie.getId());
//            //스스로 조인에서 가져옴
//            System.out.println("findMove = "+ findMove);

//            Member member = new Member();
//            member.setCreatedBy("kim");
//            member.setCreatedDate(LocalDateTime.now());
//            member.setUsername("user1");
//
//            em.persist(member);
//
//            em.flush();
//            em.clear();


//            emMember member = em.find(Member.class, 1L);
//            printMember(member);
            
            //printMemberAndTeam(member);

//            Member member = new Member();
//            member.setUsername("hello");
//
//            em.persist(member);
//
//            em.flush();
//            em.clear();

//            Member findMember = em.find(Member.class, member.getId());
//
//            System.out.println("findMember.id = "+ findMember.getId());
//            System.out.println("findMember.userName = "+findMember.getUsername());

//            Member findMember = em.getReference(Member.class, member.getId());
//
//            System.out.println("findMember.id = "+ findMember.getId());
//            System.out.println("findMember.userName = "+findMember.getUsername());
//            Member member1 = new Member();
//            member1.setUsername("hello");
//
//            em.persist(member1);
//
//            em.flush();
//            em.clear();
//            Member refMember = em.getReference(Member.class, member1.getId());
//            System.out.println("reference = " + refMember.getClass());

            //프록시 초기화 확인 (초기화 됐으면 true)
//            refMember.getUsername();          // 강제 초기화
//            System.out.println("isLoaded = " + emf.getPersistenceUnitUtil().isLoaded(refMember));

//            Hibernate.initialize(refMember);        //하이버네이트가 제공하는 강제 초기화

            //즉시로딩과 지연로딩
//            Team team = new Team();
//            team.setName("teamA");
//            em.persist(team);
//
//            Member member1 = new Member();
//            member1.setUsername("hello");
//            member1.setTeam(team);
//            em.persist(member1);
//
//
//            em.flush();
//            em.clear();
//            Member m = em.find(Member.class, member1.getId());
//
//            System.out.println("m.getTeam().getClass() = " + m.getTeam().getClass());
//
//
//            System.out.println("==============");
//            m.getTeam().getName();      //초기화
//            System.out.println("==============");

            //영속성 전이

//            Child child1 = new Child();
//            Child child2 = new Child();
//
//            Parent parent = new Parent();
//            parent.addChild(child1);
//            parent.addChild(child2);
//
//            em.persist(parent);
//            em.persist(child1);           // cascade = CascadeType.ALL 를 선언하여 이걸 선언하지 않아도 Child 에 대한 쿼리가 나감
//            em.persist(child2);

            //고아 객체
//            Child child1 = new Child();
//            Child child2 = new Child();
//
//            Parent parent = new Parent();
//            parent.addChild(child1);
//            parent.addChild(child2);
//
//            em.persist(parent);
//
//            em.flush();
//            em.clear();
//
//            Parent findParent = em.find(Parent.class, 1L);
//            findParent.getChildList().remove(0);

            //커밋을 하는 시점에 데이터베이스로 전송(쿼리 실행)

            //임베디드 타입
//            Member member = new Member();
//            member.setUsername("hello");
//            member.setHomeAddress(new Address("city","street","10000"));
//            member.setWorkPeriod(new Period());
//
//            em.persist(member);

//            Address address = new Address("city","street","10000");
//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.setHomeAddress(address);
//            em.persist(member);
//
//            Address copyAddress = new Address(address.getCity(), address.getStreet(), address.getZipcode());
//
//            Member member2 = new Member();
//            member2.setUsername("member2");
//            member2.setHomeAddress(copyAddress);
//            em.persist(member2);
//
//            member.getHomeAddress().setCity("newCity");
//
//            member.getHomeAddress().setCity("newCity");

            //값 타입 컬렉션
            Member member = new Member();
            member.setUsername("member1");
            member.setHomeAddress(new Address("homeCity","street","1000"));

            member.getFavoriteFoods().add("치킨");
            member.getFavoriteFoods().add("족발");
            member.getFavoriteFoods().add("피자");

            member.getAddressHistory().add(new Address("old1","street","1000"));
            member.getAddressHistory().add(new Address("old2","street","1000"));

            em.persist(member);

            em.flush();
            em.clear();

            System.out.println("=====================START=============================");
            Member findMember = em.find(Member.class, member.getId());

//            List<Address> addressHistory = findMember.getAddressHistory();
//            for (Address address : addressHistory) {
//                System.out.println("address.getCity() = " + address.getCity());
//            }
//
//            Set<String> favoriteFoods = findMember.getFavoriteFoods();
//            for (String favoriteFood : favoriteFoods) {
//                System.out.println("favoriteFood = " + favoriteFood);
//            }

            //homeCity -> newCity
//            Address a = findMember.getHomeAddress();
//            findMember.setHomeAddress(new Address("newCity",a.getStreet(),a.getZipcode()));

            //치킨 -> 한식 (컬렉션 수정)
//            findMember.getFavoriteFoods().remove("치킨");
//            findMember.getFavoriteFoods().add("한식");

//            //완전 똑같은걸 넣어서 지워준다
//            findMember.getAddressHistory().remove(new Address("old1","street","1000"));
//            findMember.getAddressHistory().add(new Address("newCity1","street","1000"));
//
//             //JPQL
//            em.createQuery(
//                    "select m From Member m where m.username like '%kim%'",Member.class
//            ).getResultList();

            //Criteria
//            CriteriaBuilder cb = em.getCriteriaBuilder();
//            CriteriaQuery<Member> query = cb.createQuery(Member.class);
//
//            Root<Member> m = query.from(Member.class);
//
//            CriteriaQuery<Member> cq = query.select(m).where(cb.equal(m.get("username"),"kim"));
//            List<Member> resultList = em.createQuery(cq).getResultList();

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
