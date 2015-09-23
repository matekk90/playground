drop table if exists event;
drop table if exists news;

create table news
(
    id bigserial not null primary key,
    title text,
    body text
);

create table event
(
    id bigserial not null primary key,
    title text,
    body text,
    news_id bigserial references news(id) on delete cascade
);