package Phone;

import Phone.OSs.*;

public class OperatingSystemFactory {
    
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
