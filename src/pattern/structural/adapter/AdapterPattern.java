package pattern.structural.adapter;

interface WebDriver {
    void getElement();
    void selectElement();
}


class ChromeDriver implements WebDriver {
    @Override
    public void getElement() {
        System.out.println("Get element from ChromeDriver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from ChromeDriver");
    }
}

class IEDriver {
    public void findElement() {
        System.out.println("Find element from IEDriver");
    }

    public void clickElement() {
        System.out.println("Click element from IEDriver");
    }
}

class WebDriverAdapter implements WebDriver {

    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        ChromeDriver a = new ChromeDriver();
        a.getElement(); //Get element from ChromeDriver
        a.selectElement();  //Select element from ChromeDriver

        IEDriver e = new IEDriver();
        e.findElement();    //Find element from IEDriver
        e.clickElement();   //Click element from IEDriver

        WebDriver wID = new WebDriverAdapter(e);
        wID.getElement();   //Find element from IEDriver
        wID.selectElement();    //Click element from IEDriver
    }
}