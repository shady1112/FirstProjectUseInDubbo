package com.res.mapper;

import com.res.entity.request.UserInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface ResolverLoginMapper {

    int userLogin(@Param("userInfo") UserInfoDTO userInfoDTO);
}
