package com.res.api;

import com.res.entity.request.LoginInfoDTO;
import com.res.entity.response.ResolverResponse;

public interface ResolverLoginApi {

    ResolverResponse userLogin(LoginInfoDTO loginInfoDTO);

}
