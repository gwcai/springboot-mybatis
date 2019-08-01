package com.spring.base.provider;

import com.spring.base.domain.User;
import org.springframework.util.StringUtils;

import java.util.Map;

public class UserDaoProvider {
    public String updateIgnoreNullByPrimaryKey(Map<String,Object> map) throws Exception {
        User user = (User) map.get("user");
        if(null == user || StringUtils.isEmpty(user.getId())){
            throw new Exception("the primaryKey cannot be null");
        }
        StringBuilder sql = new StringBuilder("update \"user\" set ");
        StringBuilder setSql = new StringBuilder();
        if(!StringUtils.isEmpty(user.getName())){
            setSql.append("name=#{user.name},");
        }
        if(!StringUtils.isEmpty(user.getGender())){
            setSql.append("gender=#{user.gender},");
        }
        if(null != user.getAge()){
            setSql.append("age = #{user.age},");
        }
        if(setSql.length() > 0){
            sql.append(setSql.substring(0,setSql.length() - 1)).append("where id=#{user.id)");
        }else{
            throw new Exception("none element to update");
        }
        return sql.toString();
    }
}
