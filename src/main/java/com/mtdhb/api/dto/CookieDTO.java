package com.mtdhb.api.dto;

import java.sql.Timestamp;

import com.mtdhb.api.constant.ThirdPartyApplication;

import lombok.Data;

/**
 * @author i@huangdenghe.com
 * @date 2018/03/03
 */
@Data
public class CookieDTO {

    private Long id;
    private String nickname;
    private String headImgUrl;
    private ThirdPartyApplication application;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;

}
