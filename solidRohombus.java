class first {
    int numberone = 34;
}

class second {
    first fs = new first();
    int numbertwo = 42;
    int sum = fs.numberone + numbertwo;

}

public class solidRohombus {
    public static void main(String[] args) {
        second sn = new second();
        System.out.println(sn.sum);
    }
}
