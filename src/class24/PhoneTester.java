package class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone[] phone = {new IPhone(), new Samsung(), new Google()};
        for (Phone array : phone) {
            array.displayPictures();
            array.unlockPhone();
        }
    }
}
