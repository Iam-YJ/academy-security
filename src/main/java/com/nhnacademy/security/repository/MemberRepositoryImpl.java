package com.nhnacademy.security.repository;

import com.nhnacademy.security.entity.Members;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class MemberRepositoryImpl extends QuerydslRepositorySupport implements MemberRepositoryCustom {
    public MemberRepositoryImpl() {
        super(Members.class);
    }


}
