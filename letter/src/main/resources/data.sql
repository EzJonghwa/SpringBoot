INSERT INTO letter(seq, email, from_nm, to_nm, message_one
                  , message_two, message_three)
SELECT NEXTVAL('LETTER_SEQ')
   ,'leeapgil@gmail.com'
   ,'judy','nick'
   ,'안녕 닉 잘 지내?'
   ,'봄이야 봄'
   ,'봄이 어디 있는지 짚신이 닳도록 돌아다녔건만,. 돌아와 보니 봄은 우리 집 매화나무 가지에 걸려 있었다.' 
WHERE NOT EXISTS ( SELECT 1 FROM LETTER WHERE SEQ = 1);
