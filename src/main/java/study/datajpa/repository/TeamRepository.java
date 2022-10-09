package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Team;

/**
 * packageName : study.datajpa.repository
 * fileName : TeamRepository
 * author : SHW
 * date : 2022-10-09
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-09   SHW     최초 생성
 */

public interface TeamRepository extends JpaRepository<Team, Long> {
}
