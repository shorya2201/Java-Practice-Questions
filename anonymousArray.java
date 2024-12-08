class Test {
    public int add(int arr[]) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }
}

public class anonymousArray {

    // Anonymous array are used when we only want to use array once
    // they cant be used multiple times
    // they dont have any name
    // they are used for an instance only
    // advantage is less variable management

    // To create an anonymous array:
    // int result = tst.add(new int[] { 1, 2, 3, 4 });

    public static void main(String[] args) {
        Test tst = new Test();
        int result = tst.add(new int[] { 1, 2, 3, 4 });
        System.out.println(result);
    }
}
