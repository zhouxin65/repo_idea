package com.lagou.dao;

import com.lagou.domain.*;

import java.util.List;

public interface UserMapper {

    /**
     * 用户分页&多条件组合查询
     */
    List<User> findAllUserByPage(UserVo userVo);

    /**
     * 用户登录（根据用户名查询具体用户信息）
     */
    User login(User user);

    /**
     * 根据用户ID清空中间表
     */
    void deleteUserContextRole(Integer userId);

    /**
     * 分配角色
     */
    void userContextRole(User_Role_relation user_role_relation);

    /**
     * 1、根据用户Id查询关联的角色信息
     */
    List<Role> findUserRelationRoleById(Integer id);

    /**
     * 2、根据角色Id 查询角色所拥有的顶级角色菜单（-1）
     */
    List<Menu> findParentMenuByRoleId(List<Integer> ids);

    /**
     * 3、根据pid 查询子菜单信息
     */
    List<Menu> findSubMenuByPid(Integer pid);

    /**
     * 4、获取用户拥有的资源权限信息
     */
    List<Resource> findResourceByRoleId(List<Integer> ids);

    /**
     * 5、获取用户拥有的资源权限信息2
     */
    List<Resource> findResourceByRoleId2(List<Integer> ids);
    
    
    public void test11();
    public void test21();
    public void test31();
    public void test41();
    public void test51();
    public void test61();
    public void test71();


}
