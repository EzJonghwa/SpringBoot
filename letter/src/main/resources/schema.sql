CREATE TABLE IF NOT EXISTS letter(
     seq INT PRIMARY KEY
    ,email VARCHAR(100) 
    ,from_nm VARCHAR(100) 
    ,to_nm VARCHAR(100)
    ,message_one VARCHAR(100)
    ,message_two VARCHAR(100)
    ,message_three VARCHAR(100)
);

CREATE SEQUENCE IF NOT EXISTS letter_seq
START WITH 1
INCREMENT BY 1;