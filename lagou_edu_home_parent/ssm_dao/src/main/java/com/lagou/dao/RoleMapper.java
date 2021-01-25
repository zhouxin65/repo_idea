package com.lagou.dao;

import com.lagou.domain.Role;
import com.lagou.domain.Role_menu_relation;

import java.util.List;

public interface RoleMapper {

    /**
     * 查询所有角色&条件进行查询
     */
    List<Role> findAllRole(Role role);

    /**
     * 根据角色ID查询该角色关联的菜单信息ID
     */
    List<Integer> findMenuByRoleId(Integer roleId);

    /**
     * 根据roleID，清空中间表的关联关系
     */
    void deleteRoleContextMenu(Integer roleId);

    /**
     * 为角色分配菜单信息
     */
    void roleContextMenu(Role_menu_relation role_menu_relation);

    /**
     * 删除角色
     */
    void deleteRole(Integer roleId);

}
