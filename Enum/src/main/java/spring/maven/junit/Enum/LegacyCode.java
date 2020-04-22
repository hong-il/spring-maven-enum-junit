package spring.maven.junit.Enum;

public class LegacyCode {

    public String StringToString(String value) {
        
        if ("Y".equals(value)) {
            return "1";
        } else { 
            return "0";
        }
    }
}
