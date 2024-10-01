public class Main {


    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        String str = null;
        try {
            System.out.println(a[3]);
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("строки нет");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("элемент не найдет");
        } finally {
            System.out.println("готово");
        }

    }
}