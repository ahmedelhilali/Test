package constructor;

public class Main {

    public static void main(String[] args) {

        DataType dataType = new DataType();
        dataType.setaBoolean(false);
        System.out.println(dataType.getaFloat());
        System.out.println(dataType.getaFloat());
        System.out.println(dataType.getaFloat());
        System.out.println(dataType.getaFloat());
        int[] array = new int[5];
        System.out.println(absoluteValue(-5));
        Math.abs(5);

    }

    public static int absoluteValue(int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }
}
