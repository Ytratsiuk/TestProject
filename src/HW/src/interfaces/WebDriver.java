package HW.src.interfaces;
//Create a WebDriver Interface that will have the following unimplemented behaviour:
// openBrowser(), closeBrowser(), maximizeWindow(), findElement().
// Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
public interface WebDriver {
void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}

