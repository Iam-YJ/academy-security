package com.nhnacademy.security.repository;

import com.nhnacademy.security.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Members, String>, MemberRepositoryCustom  {
    // select * from Members
    List<Members> findAllBy();

    // select * from Members where member_id=id and pwd = pwd
    Members findByMemberIdAndPwd(String id, String pwd);

}
