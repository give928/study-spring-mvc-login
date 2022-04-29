package com.give928.spring.mvc.login;

import com.give928.spring.mvc.login.domain.item.Item;
import com.give928.spring.mvc.login.domain.item.ItemRepository;
import com.give928.spring.mvc.login.domain.member.Member;
import com.give928.spring.mvc.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {
    private final ItemRepository itemRepository;

    private final MemberRepository memberRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));

        memberRepository.save(Member.builder().loginId("test").password("test").name("테스터").build());
    }
}
