package com.lmxdawn.api.admin.entity.auth;

import lombok.Data;

/**
 * 角色表
 */
@Data
public class AuthRole {

  private Long id;
  private String name;
  private Long pid;
  private Long status;
  private String remark;
  private Long createTime;
  private Long updateTime;
  private Long listorder;
}