package study.datajpa.entity;

import lombok.*;

import javax.persistence.*;

/**
 * packageName : study.datajpa.entity
 * fileName : Member
 * author : SHW
 * date : 2022-10-05
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-05   SHW     최초 생성
 */
@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //JPA는 무조건 기본 생성자가 필요한데 private가 아닌 Protected로 선언해야 다른곳에서 사용이 가능하다.
@ToString(of = {"id", "username", "age"})   //연관관계 필드는 toString을 사용 안하는 것이 좋다.
public class Member extends BaseEntity{

    @Id @GeneratedValue()
    @Column(name="member_id")
    private Long id;
    private String username;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    public Member(String username) {
        this.username = username;
    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Member(String username, int age, Team team) {
        this.username = username;
        this.age = age;
        if(team != null){
            changeTeam(team);
        }

    }

    public void changeTeam(Team team) {
        this.team = team;
        team.getMembers().add(this);
    }


}
