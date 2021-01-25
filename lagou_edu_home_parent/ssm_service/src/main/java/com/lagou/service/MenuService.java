package com.lagou.service;

import com.lagou.domain.Menu;

import java.util.List;

public interface MenuService {

    /**
     * 查询所有父子菜单信息
     */
    List<Menu> findSubMenuListByPid(int pid);

    /**
     * 查询所有菜单列表
     */
    List<Menu> findAllMenu();

    /**
     *  回显所有menu信息
     */
    Menu findMenuById(Integer id);
}
