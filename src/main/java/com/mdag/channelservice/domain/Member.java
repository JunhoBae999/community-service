package com.mdag.channelservice.domain;

import com.mdag.channelservice.domain.base.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id","nickname","age"})
public class Member extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String nickname;

    private String email;

    private Integer age;

    @Column(name = "profile_imgae_url")
    private String profileImageUrl;

    private String role;

    private String gender;

    @OneToMany(mappedBy = "member")
    private List<MemberChannel> channelList = new ArrayList<>();

    @Builder
    public Member(String nickname) {
        this.nickname = nickname;
    }


}
