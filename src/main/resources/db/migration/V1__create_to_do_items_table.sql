CREATE TABLE to_do_item (
  id INT(64) not NULL auto_increment primary key,
  text VARCHAR(140) NOT NULL,
  done  TINYINT(1) default 0,
  timestamp TIMESTAMP
)