package com.jinqianl.invite.dao;

import com.jinqianl.invite.domain.Invite;
import com.jinqianl.invite.domain.InviteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InviteMapper {
    int countByExample(InviteExample example);

    int deleteByExample(InviteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Invite record);

    int insertSelective(Invite record);

    List<Invite> selectByExample(InviteExample example);

    Invite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Invite record, @Param("example") InviteExample example);

    int updateByExample(@Param("record") Invite record, @Param("example") InviteExample example);

    int updateByPrimaryKeySelective(Invite record);

    int updateByPrimaryKey(Invite record);
}