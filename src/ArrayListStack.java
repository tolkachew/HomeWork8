import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList list;

    public ArrayListStack() {
        list = new ArrayList();
    }
    public void push(Object e) {
        list.add(e);
    }
    public Object peak() {
        return list.get(list.size()-1);
    }
    public Object pop() {
        Object obj = peak();
        list.remove(list.size()-1);
        return obj;
    }
    public String toString() {
        return list.toString();
    }

    public static void main(String[]args) {
        ArrayListStack stack = new ArrayListStack();
        stack.push("macos");
        stack.push("linux");
        stack.push("window");
        System.out.println(stack);

        String data = (String)stack.pop();
        System.out.println(stack);
    }
}