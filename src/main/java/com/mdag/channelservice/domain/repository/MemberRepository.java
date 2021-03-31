package com.mdag.channelservice.domain.repository;

import com.mdag.channelservice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findMemberById(Long id);

    Member findMemberByNickname(String nickname);

}
