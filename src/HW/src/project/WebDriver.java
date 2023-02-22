package HW.src.project;

//Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
//ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.
class TestingClass {
    public static void main(String[] args) {
        RemoteWebDriver[] webDrevers = {new ChromeDriver(), new SafariDriver(), new FirefoxDriver()};
        for (RemoteWebDriver drivers : webDrevers) {
            System.out.println(drivers.getTitle());
            drivers.open();
            drivers.close();
            drivers.navigate();

        }
    }

}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenShot {
    void takeScreenShot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenShot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Chrome opens");
    }

    @Override
    public void close() {
        System.out.println("Chrome closes");
    }

    @Override
    public String getTitle() {
        return "Chrome log in sign up";
    }

    @Override
    public void takeScreenShot() {
        System.out.println("Chrome takes screenshots");
    }

    @Override
    public void navigate() {
        System.out.println("www.chrome.com");
    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Firefox opens");

    }

    @Override
    public void close() {
        System.out.println("Firefox closes");
    }

    @Override
    public String getTitle() {
        return "Firefox log in";
    }

    @Override
    public void takeScreenShot() {
        System.out.println("Firefox takes a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("www.firefox.com");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Safari opens");
    }

    @Override
    public void close() {
        System.out.println("Safari closes");
    }

    @Override
    public String getTitle() {
        return "Safari log in";
    }

    @Override
    public void takeScreenShot() {
        System.out.println("Safari takes a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("www.safari.com");
    }
}
