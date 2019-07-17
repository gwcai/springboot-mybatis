package com.spring.base.dao;

import com.spring.base.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @author FUDIAN
 */
@Mapper
@Repository
public interface UserDao {
    /**通过id查找用户
     * @param id
     * @return
     */
    @Select("select * from user where id=#{id}")
    public User getUserById(@Param("id") String id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user(name,gender) values(#{name},#{gender})")
    public int insert(User user);
}
