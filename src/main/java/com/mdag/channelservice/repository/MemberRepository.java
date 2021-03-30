package com.mdag.channelservice.repository;

import com.mdag.channelservice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
