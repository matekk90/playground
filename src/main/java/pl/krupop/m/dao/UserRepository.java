package pl.krupop.m.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.krupop.m.entity.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {

}
