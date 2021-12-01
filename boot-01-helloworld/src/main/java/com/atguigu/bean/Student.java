package com.atguigu.bean;

/**
 * @author wuyanze
 * @create 2021-11-29 20:03
 */
public class Student{
    public Student() {
        System.out.println("Student()");
    }

    public Student(int i){
        System.out.println("Student(int i)");
    }

    /* private int x;
  private int y;

    public Student(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x,int y){
        this.x = x;
        this.y = y;
    }

    private static void modifyStudent(Student p1,Student p2){
        Student tmp = p1;
        p1 = p2;
        p2 = tmp;
        p1.setLocation(5,5);
        p2 = new Student(5,5);
    }

    public static void main(String[] args) {
        Student p1 = new Student(0, 0);
        Student p2 = new Student(0, 0);
        modifyStudent(p1,p2);
        System.out.println("["+p1.x+","+p1.y+"], ["+p2.x+","+p2.y+"]");

    }*/
}
