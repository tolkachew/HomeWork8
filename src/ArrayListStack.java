import java.util.ArrayList;

public class Task4{
    private ArrayList lst;

    public Task4() {
        lst = new ArrayList();
    }
    public void push(Object e) {
        lst.add(e);
    }
    public Object peak() {
        return lst.get(lst.size()-1);
    }
    public Object pop() {
        Object obj = peak();
        lst.remove(lst.size()-1);
        return obj;
    }
    public String toString() {
        return lst.toString();
    }

    public static void main(String[]args) {
        Task4 stack = new Task4();
        stack.push("macos");
        stack.push("linux");
        stack.push("window");
        System.out.println(stack);

        String data = (String)stack.pop();
        System.out.println(stack);
    }
}