package com.mdag.channelservice.domain;

import com.mdag.channelservice.domain.base.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "introduction", "isPrivate"})
public class Channel extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "channel_id")
    private Long id;

    private String introduction;

    private  String title;

    private boolean isPrivate = false;

    @OneToMany(mappedBy = "channel")
    private List<MemberChannel> memberList = new ArrayList<>();

    @Builder
    public Channel(String introduction,String title,boolean isPrivate) {
        this.introduction = introduction;
        this.isPrivate = isPrivate;
        this.title = title;
    }

    public void changePrivate(boolean option) {
        this.isPrivate = option;
    }

}
