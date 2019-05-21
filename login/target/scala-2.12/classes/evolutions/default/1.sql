# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table register (
  id                            bigint auto_increment not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  mobilenumber                  varchar(255),
  email_id                      varchar(255),
  password                      varchar(255),
  constraint pk_register primary key (id)
);


# --- !Downs

drop table if exists register;

