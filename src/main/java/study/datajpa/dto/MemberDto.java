package study.datajpa.dto;

import lombok.Data;
import study.datajpa.entity.Member;

/**
 * packageName : study.datajpa.dto
 * fileName : MemberDto
 * author : SHW
 * date : 2022-10-09
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-09   SHW     최초 생성
 */

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    public MemberDto(Member member){
        this.id = member.getId();
        this.username = member.getUsername();

    }
}
