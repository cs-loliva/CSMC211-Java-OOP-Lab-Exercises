class SmartDevice{
    protected String name; //name of smartdevice
    protected boolean isOn; //saves current state pf smartdevice


    public SmartDevice(String name){

        this.name = name;
        this.isOn = false;
    }  

    protected void power() {
        /*changes the state of the smart device for every method call. After changing the state, it prints the following:

            Switched on: [Name] is now ON.
            Switched off: [Name] is now OFF.
        */
       isOn = !isOn;
       System.out.println(name + " is now " + (isOn ? "ON." : " OFF."));
    }
};

class SmartLight extends SmartDevice{ /*Constructor with one parameter: name of device. this should call the parent class/constructor to init the name and init the brihgtness of this class to 100*/
    private int brightness; //an int from 0-100

    public SmartLight(String name) {
        brightness = 100;
        super(name);
        //inherit here super???
    }

    //idk na here lamawwwfadsfa
    
@Override // decorator used for readability sabi ni jetbrains and pass4sure 
    public void power() {
        /* an overridden void method that changes the state of the smart device:
            After changing the state, it prints the ff:

            i. Swithced on: [Name] is now ON. Brightness level is at [brihgtness]%.
            ii. Switched off: [Name] isnow OFF.
        */
       isOn = !isOn;
       if (isOn) {
        System.out.println(name + "is now ON. Brightness level is at " + brightness + "%.");
       } else {
        System.out.println(name + "is now OFF.");
       }
    }

    public void adjustBrightness(int brightness) {
        //if inputted level is INVALID print:
        if (brightness < 0 || brightness > 100) {
        System.out.println("Invalid brightness level. Please enter a value between 0 and 100.");
        return;
        }
        
        this.brightness = brightness;
        //if inputted level is valid print this: 
        System.out.println("Brihtness adjusted to " + brightness + "%.");
    }
};

/* AI USE DECLARATION:

I used the google AI search for the hint on pattern matching. It also returned sources from SAP: https://engineering.leanix.net/blog/pattern-matching-vs-polymorphism/ though here it uses Kotlin. 
I looked up more resources and got: https://blog.jetbrains.com/idea/2024/02/easy-hacks-how-to-implement-polymorphism-in-java/.
This was less used and just skimmed thorugh: https://www.cs.cornell.edu/courses/cs3110/2014fa/lectures/5/lec05.html.

After trial and error on the code, and a crude implementation I asked from the same google ai search chat how my snippet looked.
It returned sggestions on imporving readability by using decorators (also found in the jetbrains resource) as well as fixed syntax issues.

I used the cleaned up version from google search ai.
    
    