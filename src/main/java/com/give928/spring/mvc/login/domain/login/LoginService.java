package com.give928.spring.mvc.login.domain.login;

import com.give928.spring.mvc.login.domain.member.Member;
import com.give928.spring.mvc.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    /**
     * @return null이면 로그인 실패
     */
    public Member login(String loginId, String password) {
        return memberRepository.findByLoginId(loginId)
                .filter(m -> {
                    log.info("m = {}", m);
                    log.info("password = {}", password);
                    return m.getPassword().equals(password);
                })
                .orElse(null);
//                .orElseThrow(RuntimeException::new);
    }
}
