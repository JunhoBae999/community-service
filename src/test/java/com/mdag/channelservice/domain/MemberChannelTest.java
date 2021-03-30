package com.mdag.channelservice.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberChannelTest {

    private final Member member = Member.builder()
            .nickname("박승호").build();

    private final Channel channel = Channel.builder()
            .isPrivate(false)
            .introduction("승호의 은밀한 취향 채널")
            .title("승은취")
            .build();


    @Test
    @DisplayName("멤버 채널 엔티티 생성 테스트")
    public void CreateMemberChannelEntityTest() {
        MemberChannel memberChannel = MemberChannel.builder()
                .channel(channel)
                .member(member).build();

        assertThat(memberChannel.getMember().getNickname()).isEqualTo("박승호");
        assertThat(memberChannel.getChannel().getTitle()).isEqualTo("승은취");

    }

}