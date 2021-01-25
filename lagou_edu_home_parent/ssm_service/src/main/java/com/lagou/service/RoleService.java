package com.lagou.service;

import com.lagou.domain.Role;
import com.lagou.domain.RoleMenuVo;

import java.util.List;

public interface RoleService {

    /**
     * 查询所有角色&条件进行查询
     */
    List<Role> findAllRole(Role role);

    /**
     * 根据角色ID查询该角色关联的菜单信息ID
     */
    List<Integer> findMenuByRoleId(Integer roleId);

    /**
     * 为角色分配菜单信息
     */
    void roleContextMenu(RoleMenuVo roleMenuVo);

    /**
     * 删除角色
     */
    void deleteRole(Integer roleId);

}
