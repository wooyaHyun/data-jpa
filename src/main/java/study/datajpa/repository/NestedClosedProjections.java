package study.datajpa.repository;

/**
 * packageName : study.datajpa.repository
 * fileName : NestedClosedProjections
 * author : SHW
 * date : 2022-10-12
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-12   SHW     최초 생성
 */

public interface NestedClosedProjections {

    String getUsername();
    TeamInfo getTeam();

    interface  TeamInfo{
        String getName();
    }
}
