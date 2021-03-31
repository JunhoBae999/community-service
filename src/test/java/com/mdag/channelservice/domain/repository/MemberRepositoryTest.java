package com.mdag.channelservice.domain.repository;

import com.mdag.channelservice.domain.Member;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@RequiredArgsConstructor
class MemberRepositoryTest {

    private final MemberRepository memberRepository;

    @Test
    @DisplayName("MemberRepository CRUD 테스트")
    public void memberRepositoryCRUDTest() {

        Member member = Member.builder()
                .nickname("junho")
                .build();

        memberRepository.save(member);

        Member findMember = memberRepository.findMemberByNickname("junho");

        assertAll(
                () -> assertThat(findMember.getId()).isEqualTo(member.getId()),
                () -> assertThat(findMember.getNickname()).isEqualTo(member.getNickname())
        );



    }


}