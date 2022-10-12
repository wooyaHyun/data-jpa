package study.datajpa.repository;

/**
 * packageName : study.datajpa.repository
 * fileName : MemberProjection
 * author : SHW
 * date : 2022-10-12
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-12   SHW     최초 생성
 */

public interface MemberProjection {
    Long getId();
    String getUsername();
    String getTeamName();
}
