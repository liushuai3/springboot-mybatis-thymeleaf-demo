select a.*,rowid from person a;
DROP TABLE person;
CREATE TABLE person(
  ID number(14),
  PSNAME varchar(20),
  CARDNO varchar(30)
);
DROP SEQUENCE person$seq;
CREATE SEQUENCE person$seq start with 1 increment by 1;
