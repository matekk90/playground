package pl.krupop.m.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.krupop.m.entity.News;

@Repository("newsRepository")
public interface NewsRepository extends CrudRepository <News, Long> {

}
