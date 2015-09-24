drop table if exists event;
drop table if exists news;
drop table if exists account2;
drop table if exists account;

create table account
(
    id bigserial not null primary key,
    username text,
    email text,
    password text
);

create table account2
(
    id bigserial not null primary key,
    username text,
    email text
);

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