package Chapter5.Cp53_enum;

import java.util.Calendar;

public class p208_EnumWeek {
    public static void main(String[] args) {
        p205_week today = null; // 열거 타입 변수 선언

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)까지의 숫자를 리턴

        switch(week) {
            case 1:
                today = p205_week.SUNDAY; break;
            case 2:
                today = p205_week.MONDAY; break;
            case 3:
                today = p205_week.TUESDAY; break;
            case 4:
                today = p205_week.WEDNESDAY; break;
            case 5:
                today = p205_week.THURSDAY; break;
            case 6:
                today = p205_week.FRIDAY; break;
            case 7:
                today = p205_week.SATURDAY; break;
        }

        System.out.println("오늘 요일: " + today);

        if(today == p205_week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부합니다.");
        }
    }
}
