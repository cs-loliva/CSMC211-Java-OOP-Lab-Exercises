class SmartDevice{
    protected String name; //name of smartdevice
    protected boolean isOn; //saves current state pf smartdevice
};

SmartDevice(){
    protected void power() {
        /*changes the state of the smart device for every method call. After changing the state, it prints the following:

            Switched on: [Name] is now ON.
            Switched off: [Name] is now OFF.
        */
    };
};

class SmartLight extends SmartDevice{
    private int brightness; //an int from 0-100
};

SmartLight(){
    /*Constructor with one parameter: name of device. this should call the parent class/ constructor to init the name and init the brihgtness of this class to 100*/
    public void power() {
        /* an overridden void method that changes the state of the smart device:
            After changing the state, it prints the ff:

            i. Swithced on: [Name] is now ON. Brightness level is at [brihgtness]%.
            ii. Switched off: [Name] isnow OFF.
        */
    };

    public void adjustBrightness(int) {
        //if inputted level is INVALID print:
        System.out.println("Invalid brightness level. Please enter a value between 0 and 100.")
        
        //if inputted level is valid print this:
        System.out.println("Brihtness adjusted to [brightness].")
    };
};