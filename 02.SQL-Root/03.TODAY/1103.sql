/* 
[ 테이블 컬럼 추가하기 ]

ALTER TABLE `테이블명`
ADD `컬럼명` 데이터형;
*/

-- 숫자항목 추가후 새로 데이터 추가하기
INSERT INTO `todolist`(`title`, `cont`, `mynum`)
VALUES ("금요일준비일정","금요일엔 불금,놀자",10);