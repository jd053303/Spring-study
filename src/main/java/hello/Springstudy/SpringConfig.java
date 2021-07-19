package hello.Springstudy;

import hello.Springstudy.repository.MemberRepository;
import hello.Springstudy.repository.MemoryMemberRepository;
import hello.Springstudy.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
