// Java03.java
public class Java03 {
    public static void main(String[] args) {

            /*
                [ 자바 연산자 ] 
                : 변수와 값에 대한 연산을 수행하는데 사용됨

                [1.산술 연산자] : 일반적인 수학 연산을 수행하는 데 사용

                +   더하기   x + y   
                -   빼기   x - y   
                *   곱하기   x * y   
                /   나누기   x / y   
                %   나머지   x % y   
                ++   1씩증가   ++x   
                --   1씩감소   --x
            */
            System.out.println("[1.산술 연산자]");
            System.out.println("사칙연산:");
            System.out.println("3 + 7 * 9 / 20 -5 = " + (3+7*9/20-5));
            System.out.println("나머지연산자:");
            System.out.println("500을 7로 나눈 나머지는? " + (500%7));

            System.out.println("증감연산자:");
            int worldNum = 72;
            System.out.println("현재 세계인구는 " + worldNum + "억이다. 5년뒤 10억명이 더 늘어난다고 한다. 1억명만 더 늘려봐라. " + (worldNum++) + "억명");

            // ++이 뒤에 있으면 출력이 먼저되고 증가
            // ++이 앞에 있으면 먼저 증가되고 출력
            System.out.println("worldNum변수값: " + worldNum);





    // [2. 할당연산자] : = 오른쪽의 값을 왼쪽에 할당함!

    // [3. 대입연산자] : 기존값에 연산을 중첩함
    // -> += , -=, *=, /=, %=

    System.out.println("현재인구수 조정: " + (--worldNum));

    System.out.println();
    System.out.println("[3. 대입연산자]");
    System.out.println("5년뒤 인구는 몇명인가" + (worldNum += 10) + "억명");

    // [4. 비교연산자] : >,<,==,!=,>=,<=
    // -> 조건문에 값을 비교하여 true / false의 결과가 나옴
    System.out.println();
    System.out.println("[4. 비교연산자]");
    int broAge = 18;
    int myAge = 19;
    System.out.println("내가 알던 형은 형인가?" +
    (broAge>myAge));
    System.out.println("내가 알던 형은 형인가?" +
    (broAge>myAge?"응, 형 맞아":"아니, 동생이었어"));

    // [5. 논리연산자] : &&(논리곱), ||(논리합), !(논리부정)
    // &&(논리곱) -> 모두 true이면 true
    // ||(논리합) -> 하나만 true이면 true
    // !(논리부정) -> true / false 결과 반대로 출력
    System.out.println();
    System.out.println("[5. 논리연산자]");
    String man = "남자";
    int age = 20;
    System.out.println("한 사람의 성별이 남자이고 나이가 각각 남자이고 20세 이상이면 회원자격을 준다. 이 사람은 회원인가?" + (man=="남자"&&age>=20));
    // 논리합
    System.out.println((man=="남자"||age>=20));
    // 논리부정
    System.out.println("회원이 아니면 나가세요 라고 말한다");
    System.out.println(!(man=="남자"&&age>=20));
        
    // [자바 문자열 : String형]
    System.out.println();
    System.out.println("[자바 문자열 : String형]");

    // 1. 문자열은 텍스트를 저장하는 데 사용

    // 2. String변수에는 큰따옴표로 묶인 문자열임!
    String myFace = "I Am Very umm";

    // 3. 문자열 길이
    //     length()메소드 - 공백도 셈
    System.out.println(("출력:" + myFace));
    System.out.println("문자열 길이는? " + myFace.length());

    // 4.문자열 메서드
    // toUpperCase() - 모두 대문자 변환
    System.out.println("모두 대문자: " + myFace.toUpperCase());
    // toLowerCase() - 모두 소문자 변환
    System.out.println("모두 대문자: " + myFace.toLowerCase());

    // 5. 문자열 시작순번 : 
    // indexOf()메서드 
    // - 문자열(공백 포함)에서 지정된 텍스트가 처음 나타나는 인덱스순번 숫자리턴
    // 대소문자를 구분, 찾는문자열 없으면 -1리턴, 0부터셈
    System.out.println("문자열시작위치: " + myFace.indexOf("umm"));
    System.out.println("문자열시작위치: " + myFace.indexOf("Umm")); // 없으면 -1

    // substring(시작순번, 끝순번다음순번)
    System.out.println("umm만 잘라서 가져와봐: " + myFace.substring(10, 13));

    // 7. 문자열 바꾸기
    // replace(바꿀 문자열, 바뀔 문자열)
    System.out.println("umm을 Smart로 변경: " + myFace.replace("umm", "Smart"));

    // 8. 문자열 반복하기
    // repeat(반복횟수)
    var nayana = "나야나";
    // var로 선언하면 왼쪽의 데이터 형에 따라
    // 자동으로 형을 정해주는 선언방법(Java10부터 도입)
    System.out.println("나야나 열번반복하기: " + nayana.repeat(10));

    // 9. 문자열 연결
    // + 연산자를 문자열 사이에 사용하여 결합

    // 10. 문자열 연결 메서드 : concat()
    // ex)
    String name = "유";
    String name2 = "룡";
    String familyname = "공";
    System.out.println(familyname.concat(name)); // "공유"
    System.out.println(familyname.concat(name2));

    // 11. 특수문자 이스케이프 하기 (앞에 역슬래쉬사용!)
    // \'	'	홑따옴표
    // \"	"	쌍따옴표
    // \\	\	역슬래쉬
    System.out.println("쌍따옴표안에 \"쌍따옴표\"쓰기 ");
    System.out.println("홑따옴표 특수문자처리: It\'s mine!");
    System.out.println("역슬래쉬\\아");
    System.out.println("개행은 \n아");
    System.out.println("엔터는 \r아 엔터는 여기서 다시 실행함");
    System.out.println("탭은\t아");
    System.out.println("백스페이스는\b 아");

    // 참고) 기타 이스케이프 시퀀스
    // \n	개행	
    // \r	엔터
    // \t	탭	
    // \b	백스페이스	


    // [ 수학 메서드 ] - Math 클래스 (정적객체)

    // 1.Math.max( x,y ) - x 와 y 중 최대값
    // : 다음 형들 중 같은 것 끼리 비교함
    // int, long, float, double
    System.out.println("10.1과 10.11 중 큰것은? " + Math.max(10.1, 10.11));
    // 2.Math.min( x,y ) -  x 와 y 중 최소값
    System.out.println(Math.min(10, 6));
    // 3. Math.sqrt( x ) - 제곱근값
    System.out.println(Math.sqrt(2));
    // 4. Math.abs(x) - 절대값
    System.out.println(Math.abs(-10));
    // 5. Math.random() - 0.0(포함)과 1.0(제외) 사이의 난수
    // ceil() 올림, floor() 내림, round() 반올림
    System.out.println("1~5 사이의 난수는? " + Math.ceil(Math.random() * 5));


    }
}

