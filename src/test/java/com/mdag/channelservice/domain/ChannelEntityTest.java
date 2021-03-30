package com.mdag.channelservice.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ChannelEntityTest {

    @Test
    @DisplayName("채널 엔티티 생성 및 공개 설정 테스트")
    public void createAndSetPrivateChannelEntityTest() {
        final String title = "사진";
        final String introduction = "사진을 좋아하는 모임";

        Channel channel = Channel.builder()
                .introduction(introduction)
                .title(title)
                .isPrivate(false)
                .build();

        assertThat(channel.getIntroduction()).isEqualTo(introduction);
        assertThat(channel.getTitle()).isEqualTo(title);
        assertThat(channel.isPrivate()).isFalse();

        channel.changePrivate(true);
        assertThat(channel.isPrivate()).isTrue();
    }



}