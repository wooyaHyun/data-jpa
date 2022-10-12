package study.datajpa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import study.datajpa.dto.MemberDto;
import study.datajpa.entity.Member;
import study.datajpa.repository.MemberRepository;

import javax.annotation.PostConstruct;

/**
 * packageName : study.datajpa.controller
 * fileName : MemberController
 * author : SHW
 * date : 2022-10-10
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-10   SHW     최초 생성
 */

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;


    @GetMapping("/members/{id}")
    public String findMember(@PathVariable("id") Long id){
        Member member = memberRepository.findById(id).get();
        return member.getUsername();
    }

    //도메인 클래스 컨버터 -> 스프링이 파라미터로 넘어온 객체의 값을 인젝션 해주는 것 -> 권장X(간단간단하게만, 조회용으로만 사용해야한다.)
    @GetMapping("/members2/{id}")
    public String findMember2(@PathVariable("id") Member member){
        return member.getUsername();
    }

    @GetMapping("/members")
    public Page<MemberDto> list(@PageableDefault(size=5) Pageable pageable){

        return memberRepository.findAll(pageable).map(MemberDto::new);
    }


    //@PostConstruct
    public void init() {
        //memberRepository.save(new Member("userA"));
        for(int i = 0; i < 100; i++){
            memberRepository.save(new Member("user" + i, i));
        }
    }
}
