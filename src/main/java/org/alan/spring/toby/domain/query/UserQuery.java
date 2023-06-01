package org.alan.spring.toby.domain.query;

public interface UserQuery {
    String INSERT = "insert into user(id, name, password) values (?,?,?)";
    String FIND = "select * from user where id = ?";
}
