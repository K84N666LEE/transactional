------------------------
 상태
------------------------

1) 전체 Database 종류에 상관없이 autocommit = true(1) 인 상태
2) @Transactional 만을 사용하여 제어
3) xml 설정 파일을 annotation을 설정하여 제어
4) ****serviceImpl class에 @Transactional 제어
5) Controller, Service, ServiceImpl, Mapper 어느 곳이든 해당 클래스 최상단 또는 해당 클래스에 설정하면 제어 가능.
