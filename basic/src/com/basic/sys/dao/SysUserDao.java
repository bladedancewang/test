package com.basic.sys.dao;

import java.util.List;
import java.util.Map;

import com.basic.sys.entity.SysUserEntity;

/**
 * 系统用户
 * 
 * @author bladedance
 * @email bladedance@vip.qq.com
 * @date 2017年7月18日 上午9:34:11
 */
public interface SysUserDao extends BaseDao<SysUserEntity> {
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(Long userId);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long userId);
	
	/**
	 * 根据用户名，查询系统用户
	 */
	SysUserEntity queryByUserName(String username);
	
	/**
	 * 修改密码
	 */
	int updatePassword(Map<String, Object> map);
}
