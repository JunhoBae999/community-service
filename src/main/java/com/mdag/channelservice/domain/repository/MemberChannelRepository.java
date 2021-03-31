package com.mdag.channelservice.domain.repository;

import com.mdag.channelservice.domain.MemberChannel;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.Entity;
import java.util.List;

public interface MemberChannelRepository extends JpaRepository<MemberChannel,Long> {

    @EntityGraph(attributePaths = {"channel"})
    @Query("select mc from MemberChannel mc where mc.channel.title =:title")
    List<MemberChannel> findMembersOfChannel(@Param("title") String title);

    @EntityGraph(attributePaths = {"member"})
    @Query("select mc from MemberChannel mc where mc.member.nickname =:nickname")
    List<MemberChannel> findChannelsOfMember(@Param("nickname") String nickname);


}
