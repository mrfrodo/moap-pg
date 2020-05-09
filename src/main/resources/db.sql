create schema if not exists moap;

create table moap.person
(
  id  serial  primary key,
  username  text  unique  not null,
  firstname  text  not null,
  lastname text  not null
);

create index person_username_idx on moap.person (username);
