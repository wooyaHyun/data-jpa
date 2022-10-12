package study.datajpa.repository;

/**
 * packageName : study.datajpa.repository
 * fileName : UsernameOnlyDto
 * author : SHW
 * date : 2022-10-12
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-12   SHW     최초 생성
 */

public class UsernameOnlyDto {

    private final String username;

    /*중요: 생성자의 파라미터 이름으로 프로젝션 생성*/
    public UsernameOnlyDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
