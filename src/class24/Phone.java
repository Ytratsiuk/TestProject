package class24;

public abstract class Phone {
    abstract void displayPictures();

    abstract void unlockPhone();
}

class IPhone extends Phone {
    void displayPictures() {
        System.out.println("Apple quality");
    }

    @Override
    void unlockPhone() {
        System.out.println("Apple faceID");

    }
}

class Samsung extends Phone {
    void displayPictures() {
        System.out.println("Samsung pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung under screen fingerprint");
    }
}

class Google extends Phone {
    void displayPictures() {
        System.out.println("google pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Google Finger print");
    }

}

