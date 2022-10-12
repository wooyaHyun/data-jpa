package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

/**
 * packageName : study.datajpa.repository
 * fileName : UsernameOnly
 * author : SHW
 * date : 2022-10-12
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-12   SHW     최초 생성
 */

public interface UsernameOnly {

    @Value("#{target.username + ' ' + target.age}") // 오픈 프로젝션 -> value 이거 없으면 크로즈 프로젝션
    String getUsername();
}
