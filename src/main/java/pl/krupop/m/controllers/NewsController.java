package pl.krupop.m.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.krupop.m.dao.EventRepository;
import pl.krupop.m.dao.NewsRepository;
import pl.krupop.m.entity.Event;
import pl.krupop.m.entity.News;

@RestController
@RequestMapping(value = "/news")
public class NewsController {

    private static final Logger logger = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    NewsRepository newsRepository;

    @Autowired
    EventRepository eventRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public void addNews(@RequestBody News news) {
        logger.info("Saving news with title: {} and body: {} to database", news.getTitle(), news.getBody());
        newsRepository.save(news);
        for (Event event : news.getEvents()) {
            event.setNewsId(news.getId());
            logger.info("Saving event {} {} to database", event.getTitle(), event.getBody());
            eventRepository.save(event);
        }
    }

}
