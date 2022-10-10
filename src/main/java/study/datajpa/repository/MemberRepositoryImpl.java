package study.datajpa.repository;

import lombok.RequiredArgsConstructor;
import study.datajpa.entity.Member;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * packageName : study.datajpa.repository
 * fileName : MemberRepositoryImpl
 * author : SHW
 * date : 2022-10-10
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-10   SHW     최초 생성
 */
//구현체는 스프링 데이터JPA인터페이스명+Impl로 꼭 사용 해야 한다 (이름 명명 규칙!)
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom{

    private final EntityManager em;

    @Override
    public List<Member> findMemberCustom() {
        return em.createQuery("select m from Member m").getResultList();
    }
}
