package homeworkClasses;

public class PhoneObject {
    public static void main(String[] args) {

        homeworkClasses.ClassPhone iPhone = new homeworkClasses.ClassPhone();
        iPhone.turnOnOff();
        iPhone.brand="American";
        iPhone.abilityToCall=true;
        iPhone.memory=120;
        iPhone.operatingSystem="mac ios";
        iPhone.batteryLife=17;
        iPhone.ring();

        homeworkClasses.ClassPhone Pixel = new homeworkClasses.ClassPhone();
        iPhone.turnOnOff();
        iPhone.brand="American";
        iPhone.abilityToCall=true;
        iPhone.memory=90;
        iPhone.operatingSystem="Android";
        iPhone.batteryLife=30;
        iPhone.ring();

        homeworkClasses.ClassPhone Samsung = new homeworkClasses.ClassPhone();
        iPhone.turnOnOff();
        iPhone.brand="Korean";
        iPhone.abilityToCall=true;
        iPhone.memory=50;
        iPhone.operatingSystem="Android";
        iPhone.batteryLife=5;
        iPhone.ring();


    }
}
