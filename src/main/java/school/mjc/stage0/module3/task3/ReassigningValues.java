package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        linkToFirst = 15;
        linkToSecond = 6;
        linkToThird = 4;
        System.out.printf("%d %n%d %n%d %n%d %n%d %n%d %n", first,second,third,linkToFirst,linkToSecond,linkToThird);
    }
}
