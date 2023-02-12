package class23;

//there can be only one public class
public class WebDriver {
    public void startBrowser() {
        System.out.println("starting the browser");
    }

    public void openURL() {
        System.out.println("opening URL");
    }

    public void testLoginPage() {
        System.out.println("checking if login page works");
    }

    public void closeBrowser() {
        System.out.println("closing the Browser");
    }
}

class Chrome extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("starting the Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("opening Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if Chrome Login page works");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Chrome");
    }
}

class Safari extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("starting Safari");
    }

    @Override
    public void openURL() {
        System.out.println("opening URL");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page works");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Safari");
    }
}

class FireFox extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("starting the FireFox");
    }

    @Override
    public void openURL() {
        System.out.println("opening FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if FireFox Login page works");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the FireFox");
    }
}