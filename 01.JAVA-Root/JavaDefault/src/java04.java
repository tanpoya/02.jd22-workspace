import java.text.DecimalFormat;
import java.util.Scanner;

public class java04 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // [Java 조건 및 If 문]

        // 1. Java는 수학의 일반적인 논리 조건사용

        // (1) 미만: a < b
        // (2) 이하: a <= b
        // (3) 초과: a > b
        // (4) 이상: a >= b
        // (5) 같음: a == b
        // (6) 다름: a != b

        // Scanner 를 사용하여 입력데이터 받기
        // java.util.Scanner를 import하여 사용
        // 자동import 단축키: alt+shift+o
        // 스캐너 생성시 값으로 System.in을 설정하여
        // 입력라인이 생성되게 한다
        try (
                Scanner myObj = new Scanner(System.in)) {
            System.out.println("배우의 이름을 입력");
            // 아래쪽에 입력라인이 생김
            // 입력후 입력 데이터를 변수에 할당한다
            // nextLine() 메서드로 입력 라인 전체를 가져옴
            // next() 메서드는 단어하나를 가져옴(띄어쓰기 맨앞단어)
            String actor = myObj.nextLine();
            System.out.println();
            System.out.println("배우이름: " + actor);

            System.out.println("이 배우의 성별을 입력하시오");
            String gender = myObj.nextLine();
            System.out.println();
            System.out.println("성별: " + gender);
            System.out.println();

            // 입력창으로 받은 데이터는 엔터기호등 다른
            // 데이터가 포함되어 있어서 == 비교연산자말고
            // 변수.equals(내용) 메서드로 비교하면
            // 정확히 입력된 데이터만 비교한다

            // 배우 이름에 해당하는 대표작으로 표시하는 if문
            if (actor.equals("로버트 다우니 주니어") && gender.equals("남자")) {
                System.out.println("대표작: 아이언맨");
            } else if (actor.equals("김수현") && gender.equals("남자")) {
                System.out.println("대표작: 해품달");
            } else if (actor.equals("김수현") && gender.equals("여자")) {
                System.out.println("대표작: 어벤져스 - 에이지 오브 울트론");
            } else {
                System.out.println("?");
            }

            System.out.println();

            // 2. if문
            // : 조건이 true일때 실행할 코드를 제어함

            // if (조건문) {
            // // 실행코드
            // } else if (조건문) {
            // // 실행코드
            // } else {
            // // 실행코드
            // }

            // if : 지정된 조건이 true인 경우 실행할 코드
            // else if : 상단 조건이 false인 경우 새로운 조건 추가
            // else : 모든 조건에 해당없을 경우 실행할 코드

            System.out.println("오늘은 당신의 생일인가요?(Y/N)");
            String birth = myObj.nextLine();
            System.out.println();
            System.out.println(birth.equals("Y") ? "생일축하해" : "수고해");
            // 3. 삼항연산자(짧은 if문)
            // 변수 = (조건문) ? true시 실행문 : false시 실행문;
            // 비?집:놀이동산

            System.out.println();
            System.out.println("오늘의 점심메뉴를 선택하세요");
            System.out.println("1.마라탕");
            System.out.println("2.감자탕");
            System.out.println("3.돈까스");
            System.out.println("4.비빔밥");
            System.out.println("5.기타");

            System.out.println("#메뉴선택번호: ");
            int menu = myObj.nextInt();
            System.out.println();

            // 선택 메뉴 번호에 따라 switch문으로 출력문을 다르게함
            switch (menu) {
                case 1:
                    System.out.println("마라탕");
                    break;
                case 2:
                    System.out.println("감자탕");
                    break;
                case 3:
                    System.out.println("돈까스");
                    break;
                case 4:
                    System.out.println("비빔밥");
                    break;
                default:
                    System.out.println("기타");
            }

            // 4. switch 문

            // : 단일조건을 분류하여 실행코드를 나눔
            
            // switch(변수) {
                // case x:
                // // 실행코드
                // break;
                // case y:
                // // 실행코드
                // break;
                // default:
                // // 실행코드
                // }
                
                
                
                System.out.println();
                System.out.println("빵개수");
                System.out.println("#빵개수: ");
                int bread = myObj.nextInt();
                System.out.println();
                
                // 숫자증가변수
            int bnum = 0;
            while(bnum < bread) {
                bnum++; // 1씩 증가
                System.out.println("빵 ");
            } /////// while문 /////////
            
            System.out.println("\n");
            
            // 5. while문
            // - 조건이 true인 동안 반복실행 코드를 제어함
            
            // while (조건문) {
                // // 실행코드
                // }

                // 세자리마다 콤마찍기 방법:
                // DecimalFormat 클래스
                // 생성: DecimalFormat 변수 = new DecimalFormat(형식)
                // 사용: 변수.format(사용할변수)
                DecimalFormat df = new DecimalFormat("###,###");
                // ###,### -> 샾은 숫자자리를 의미, 3자리마다 콤마형식
                
                // 자신의 월급을 쓰고 몇번 월급 받고 싶은지 써서
                // 월급의 총액을 알아보자
                System.out.println("당신의 월급은 얼마입니까?");
                int myPay = myObj.nextInt();
                System.out.println("월급: " + df.format(myPay) + "원");
                System.out.println();
                
                System.out.println("당신은 당신의 회사에서 몇번이나 월급을 받고싶나요?");
                int payNum = myObj.nextInt();
                System.out.println("월급횟수: " + payNum);
                System.out.println();

                // 월급횟수 증가변수
                int payCycle = 1;
                

                // 일단 월급은 한번받고 시작한다
                do {
                    System.out.println("월급 " +df.format(myPay) + "원 *" + payCycle + "번 받고 \n총액: " + df.format((myPay*payCycle)) + "원");

                    // 증감필수1
                    payCycle++;
                } while(payCycle <= payNum);

                
                // 6. Do/While문
                // - 먼저 코드를 실행후 반복실행 여부를 제어함
                
                // do {
                    // // 실행코드
                    // }
                    // while (조건문);

                    System.out.println();
                    // 무지개색을 배열변수에 넣고 for문 돌리기
                    String[] rainbow = {"빨", "주", "노", "초", "파", "남", "보"};
                    for(int i = 0; i < rainbow.length; i++) {
                        System.out.println(rainbow[i]);
                    }
                    
                    // 7. for문
                    // - 지정된 횟수 만큼 코드를 반복실행하여 제어함
                    
                    // for (시작값; 한계값; 증감) {
                        // // 실행코드
                        // }
                        
                        // (1) 시작값 : 변수선언과 시작값 할당
                        // (2) 한계값 : 변수의 한계값 설정
                        // (3) 증감 : 변수의 증가 / 감소
                        
                        // ### 배열의 전체 축구선수 명단 중
                        // 올림픽경기에 나갈 선수만 표시하기(continue)
                        // 예비선수는 제외함(break)
                        String player[] = {
                            "김기춘",
                            "홍서범",
                            "하준상",
                            "이종학",
                            "예비:이병준",
                            "예비:서이룡"
                        };

                        System.out.println("#축구 한국 대표팀 선수 전체명단");
                        // for-each문
                        for(String mem : player) {
                            System.out.println(mem);
                        } //////// for Each ////////////

                        System.out.println();

                        // "하준상"은 제외, "예비: 이병준"부터 출력안함
                        System.out.println("#일림픽 경기에 참가할 축구선수 명단:");
                        System.out.println();
                        // for-each
                        for(String mem : player) {
                            // "하준상" 거르기 -> continue
                            if(mem == "하준상") continue;
                            // "예비: 이병준" 부터 빠져나감 -> break
                            if(mem == "예비:이병준") break;
                            System.out.println(mem);
                        } /////////// for-each ///////////

                        // 8. for-each 문
                        // - 배열값 만큼 자동으로 변수에 할당하면 실행코드 반복 제어함
                        
                        // for (타입선언변수 : 배열변수명) {
                            // // 실행코드
                            // }
                            
                            // 9. for문 중단,계속 옵션 키워드
                            // (1) continue 빼고 계속
                            // (2) break 중단
                            
                        } ///////// ty문 (스캐너) ////////////
                            // catch문 (에러발생시 처리 구역)
                            catch (Exception e) {
                                // e.getMessage() -> 기본 에러메시지
                                // System.out.println(e.getMessage());
                                // 결과: null -> 내용이 없는 데이터
                                System.out.println(e.getMessage());
                                // 사용자가 보여주는 메시지
                                System.out.println("숫자로 입력해주세요\n숫자로 입력해주세요\n");
                            }
                            
                        }
                    }
                    