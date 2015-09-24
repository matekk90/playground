package pl.krupop.m.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.krupop.m.entity.User2;

@Repository("user2Repository")
public interface User2Repository extends CrudRepository<User2, Long> {

}
