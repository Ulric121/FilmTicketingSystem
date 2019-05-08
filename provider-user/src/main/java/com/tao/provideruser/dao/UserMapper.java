package com.tao.provideruser.dao;

import com.tao.provideruser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 *
 * @author yangtao
 * @version 0.0.1
 * @since 2019/3/23
 */
@Mapper
public interface UserMapper {

    User getOne(@Param("id") int id);
}
