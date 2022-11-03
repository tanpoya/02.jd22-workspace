public class Javafor {
    public static void main(String[] args) {

        // 무지개색을 배열변수에 넣고 for문 돌리기
        String[] rainbow = { "빨강", "주황", "노랑", "초록", "파랑", "남", "보라" };
        System.out.println("#무지개색 종류는 순서대로 ");
        for (int i = 0; i < rainbow.length; i++) {
            System.out.print(rainbow[i] + "색");
            if (i == rainbow.length - 1) { // 마지막 배열일때
                System.out.print("입니다");
            } ///// if /////
            else {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println();

        String[] rainbow2 = { "빨강", "주황", "노랑", "초록", "파랑", "남", "보라" };
        for (String i : rainbow2) {
            System.out.print(i + "색 \n\n");
        }


        String player[] = {
            "김기춘",
            "홍서범",
            "하준상",
            "이종학",
            "예비: 이병준",
            "예비: 서이룡"
        };
        System.out.println("#축구 한국 대표팀 선수 전체명단");
                        // for-each문
                        for(String mem : player) {
                            System.out.println(mem);
                        } //////// for Each ////////////




    }
}
