package com.spring.base.dao;

import com.spring.base.domain.User;
import com.spring.base.provider.UserDaoProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author FUDIAN
 */
@Mapper
@Repository
public interface UserDao {
    /**查询所有用户
     * @return
     */
    @Select("select * from \"user\"")
    public List<User> selectAll();

    /**通过id查找用户
     * @param id
     * @return
     */
    @Select("select * from \"user\" where id=#{id}")
    public User getUserById(@Param("id") String id);

    /**插入新用户
     * @param user
     * @return
     */
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    @Insert("insert into \"user\"(id,name,gender,age) values(#{id},#{name},#{gender},#{age)")
    public int insert(User user);


    @UpdateProvider(type = UserDaoProvider.class,method ="updateIgnoreNullByPrimaryKey")
    public int updateUserIgnoreNullByPrimaryKey();
}
