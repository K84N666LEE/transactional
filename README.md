 상태
------------------------
 
 MySQL => InnoDB 인 경우만 가능.
 Oracle/DB2 => AutoCommit=false

 1) autocommit = true 인 상태
 2) @Transactional 사용
 3) xml 설정 파일로 제어
 4) ****serviceImpl class에 @Transactional 제어
