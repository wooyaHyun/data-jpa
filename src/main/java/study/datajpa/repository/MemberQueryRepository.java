package study.datajpa.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * packageName : study.datajpa.repository
 * fileName : MemberQueryRepository
 * author : SHW
 * date : 2022-10-10
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-10   SHW     최초 생성
 */

//항상 사용자 정의 리포지토리가필요한것이 아니다. 그냥 클래스로 만들고 스피링 빈드으로 등록해서 직접 사용해도 된다.
@Repository
@RequiredArgsConstructor
public class MemberQueryRepository {

    private final EntityManager em;

    List<Member> findAllMembers(){
        return em.createQuery("select m from Memberm").getResultList();
    }
}
