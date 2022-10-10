package study.datajpa.repository;

import study.datajpa.entity.Member;

import java.util.List;

/**
 * packageName : study.datajpa.repository
 * fileName : MemberRepositoryCustom
 * author : SHW
 * date : 2022-10-10
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-10   SHW     최초 생성
 */

public interface MemberRepositoryCustom {

    List<Member> findMemberCustom();
}
