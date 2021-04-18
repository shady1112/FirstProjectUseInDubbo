package com.res.api;

import com.res.entity.request.UserInfoDTO;
import com.res.entity.response.ResolverResponse;

public interface ResolverLoginApi {

    ResolverResponse userLogin(UserInfoDTO userInfoDTO);

}
