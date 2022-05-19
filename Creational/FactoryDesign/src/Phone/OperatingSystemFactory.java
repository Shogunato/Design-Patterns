package Phone;

import Phone.OSs.*;

//Factory itself
public class OperatingSystemFactory {
    
    //Creation itself
    public OS getInstance(String type) {

        switch(type) {

            case("Open"): {
                return new Android();
            }

            case("Closed"): {
                return new IOS();
            }

            default: {
                return new Windows();
            }

        }

    }
    
}
