// 예제 4-22: 재정의된 메서드를 포함하는 빈 클래스

public class MyBean {
    public void perform(String task1, String task2) { ..... }
    public void perform(String task) { ..... }
    public void perform(my.Task task) { ..... }
}
