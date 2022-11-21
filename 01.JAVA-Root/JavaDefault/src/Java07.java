// JAVA07. 클래스와 객체 그리고 속성과 메서드
// + 접근한정자(Modifier) + 캡슐화 + 팩키지

/************************************************************************** 

    Java07. 클래스와 객체 그리고 속성과 메서드
    클래스명과 동일한 이름의 파일에는 단 하나의 public 클래스를 가질 수 있다

    그래서 하나의 java파일안에는 다른 클래스도 만들 수 있다
    단, 다른 추가클래스는 public 접근한정자를 쓸 수 없다
    접근한정자(Modifier)를 한쓰면 default라고 부른다

    -> bin폴더에 생성된 class파일은 class단위로
    개별적으로 생성된다 (꼭 확인해 볼것)
    ________________________________________________

    [ 클래스에서 사용하는 접근한정ㅈ(Modifier) ]
    -> public을 쓰거나 안쓰거나 둘 중 하나
    1. public : 모든 다른 클래스에서 접근허용
    2. default : 앞에 아무것도 안쓴 경우
                -> 같은 팩키지 안에서만 접근 가능
                (팩키지는 폴더라고 생각하면 됨)

    [ 클래스의 구성요소를 위한 접근한정자 ]
    -> 속성과 메서드를 위한 한정자
    1. public -> 다른 클래스에서 접근가능
    2. private(프라이빗-> 어떤느낌?) -> 다른클래스에서 접근불가
        -> 선언된 클래스안에서만 접근됨!
        -> 프라이빗 속성일 경우 Getter/Setter를 통해 접근한다
        이런방법을 캡슐화라고 한다!
    3. protected(프로텍티드-> 어떤느낌?) -> 다른클래스에서 접근불가
        -> 하위클래스(상속받은 클래스)에서 접근됨
    4. default -> 아무것도 안쓴경우
        -> 같은 패키지(같은폴더)안에서만 접근가능함!

**************************************************************************/
public class Java07 {
    // public Java07(){}
    //  -> 안만들어도 클래스와 같은 이름의 메서드 -> 생성자가 만들어짐
    public static void main(String[] args) {
        /* 
         * [ 클래스란? ]
         * - 객체를 만들기 위한 템플릿이다
         * -> 반대로 보면 객체는 클래스의 실물이다(인스턴스)
         * -> 컴파일시 하나의 java파일안에 여러개의 class를 만들어도
         * 별도의 class를 모두 따로 생성한다
         * -> 클래스는 기본 모듈의 단위(bin폴더 확인)
         * 
         * [ 클래스의 구성 ]
         * - 속성과 메서드로 구성된다
         * 1. 속성 - 클래스내에 선언된 변수다
         * 2. 메서드 - 클래스내에 생성된 함수다
         * 
         * [ 객체지향프로그래밍 이란? ]
         * - OOP(Object-Oriented Programming)
         * -> 기능별로 구분하여 클래스를 만들고
         *    그 클래스는 객체를 생성하여 모듈별
         *    기능별로 나눠진 모듈화 프로그래밍 방식
         */

        // 1. 클래스 생성
        // 과일 클래스 생성 및 클래스 호출, 속성변경하기
        Fruits fruits = new Fruits("딸기", "빨간색", "상큼", 0.005);

        // 2. 메서드 호출
        // 과일의 정의를 찍는 메서드 호출
        fruits.defineFruit();

        // 3. 속성값 변경
        fruits.name = "수박";
        fruits.color = "초록 검정";
        fruits.flavor = "달달";
        fruits.weigth = 0.6;

        // 프라이빗 속성(변수) 변경시도
        // fruits.price = 20000;
        // 프라이빗 속성은 직접 변경이 불가

        // 어떻게 셋팅하고 값을 불러올까?(겟터/셋터)

        // 가격설정하기 : setPrice()
        fruits.setPrice(12000);
        // 가격가져오기 : getPrice()
        System.out.println(fruits.name + "의 가격은 " + fruits.getPrice() + "원 입니다");
        
        // 다시 과일속성 찍기 메서드 호출
        fruits.fruitsFn();
        
        // 과일정의 속성 변경하기
        // fruits.definition = "과일은 채소와 같다";

        // 과일의 정의 찍기 메서드 호출
        // fruits.defineFruit();


        // 사과 클래스 메서드 호출하기 ///
        Apple apple = new Apple();
        apple.appleFn("맛있는");
        apple.appleFn("빛나는");

        // 바나나 클래스 메서드 호출하기
        Banana banana = new Banana();
        banana.bananaFn("바나나");
        banana.bananaFn("바나나바나나");

        ABC abc = new ABC();
        abc.abcFn("D E F G H I J");



    } //// main 메서드
} //// Java07 클래스 ///////

/////// 과일 클래스 //////////
class Fruits {
    // 속성 : 클래스안에 선언된 변수
    // 1. 과일이름
    String name;
    // 2. 과일색
    String color;
    // 3. 과일향
    String flavor;
    // 4. 과일개당무게
    double weigth;
    // 5. 과일에 대한 정의
    final String definition = "나무 따위를 가꾸어 얻는, 사람이 먹을 수 있는 열매";

    // 6. 프라이빗 변수 만들기!! : 과일가격속성
    private int price;
    /* 
     * [ 겟터(Getter)와 셋터(Setter) ]
     * -> 프라이빗 필드를 캡슐화하여 접근하는 방법
     * -> 장점은 속성을 직접 노출하지 않으며
     * 값을 넣고 읽는 메서드를 생성하여 속성에 대한
     * 일관된 접근방법을 제시해준다
     * 
     * {★ 겟터(Getter)}
     * 
     * 1. 필드값을 반환한다.
     * 2. 접근 제어 수식어 : public
     * 3. 겟터명은 : get필드명
     *              (필드명의 첫글자는 대문자)
     * 4. 매개변수 없음
     * 5. 내용 : return 필드
     * 
     * {★ 셋터(Setter)}
     * 
     * 1. 필드값 초기화(셋팅)
     * 2. 접근 제어 수식어 : (대부분) public
     * 3. 겟터명은 : set필드명
     *              (필드명의 첫글자는 대문자)
     * 4. 매개변수 : 필드와 동일
     * 5. 내용 : 생성자와 동일
     *          (this.필드명 = 매개변수명)
     */
    // Getter
    public int getPrice(){
        return price;
    }
    // Setter
    public void setPrice(int price){
        this.price = price;
    }


    /*********************************************
     * [ 클래스 생성자(Constructor) ]
     * 1. 클래스명과 동일한 이름의 메서드
     * 2. 클래스가 처음 생성될때 반드시 실행됨
     * 3. 객체초기화 함수다
     * 4. 안만들어도 기본 생성자가 만들어진다
     * 5. return(반환값/리턴값)을 가질 수 없다
     *      (왜냐하면 일반호출을 하는 메서드가 아니므로!)
     * 6. 직접 생성자를 만드는 경우: 초기값 
     *      초기값 셋팅 또는 처음에 실행이 필요한 코드 등
     *********************************************/
    // 이 클래스를 생성할 경우
    // 초기값 셋팅이 필요하므로 생성자를 만든다
    // 일반 메서드가 아니므로 이름이 클래스명과 동일함
    // 보통 매개변수는 속성명과 동일한 이름으로 쓴 경우가 많다
    // 그래서 속성명과 매개변수를 구분하기 위해
    // ->>> 속성명 앞에 this를 사용한다
    public Fruits(String name, String color, String flavor, double weigth) {

        // 속성값 셋팅
        this.name = name;
        this.color = color;
        this.flavor = flavor;
        this.weigth = weigth;

        // 값셋팅 후 내가만든 메서드 실행
        // 내가 호출하고 싶어서 여기에 씀
        fruitsFn();

        // 생성자에서는 내가 처음에 실행코자하는
        // 코드를 넣으면 된다 ^^

    } ///// Fruits 생성자 //////

    // 메서드 - 클래스 안에 정의된 함수
    public void fruitsFn() {
        System.out.println("과일" + name + "색" + color + "/" + flavor + "개당 무게" + weigth);
    } ////////// fruitsFn 메서드 ////////

    // 메서드2 - 과일의 정의를 찍는 메서드
    public void defineFruit() {
        System.out.println("과일의 정의는 " + definition + "이다.");
    } ////////// defineFruit 메서드 ///////////

} /////////// Fruits 클래스 ////////////

// 바나나 클래스 ///////////////
class Banana {
    public void bananaFn(String word) {
        System.out.println("나는" + word + " 바나나입니다");
    } //////// bananaFn 메서드 /////////
} //////// Banana 클래스 ////////////

// 사과 클래스 //////////////////////
class Apple {
    public void appleFn(String word) {
        System.out.println("나는" + word + " 사과입니다");
    } //////// appleFn 메서드 /////////
} //////// Apple 클래스 ////////////


// 클래스 ///////
class ABC {
    public void abcFn(String def) {
        System.out.println("A " + "B " + "C " + def);
    }
}