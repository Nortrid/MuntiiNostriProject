package generalObject;

import java.util.Map;

public class LogInObjects {

    private String emailFieldValue;

    private String passwordFieldValue;

    public LogInObjects (Map<String, String> testData) {buildObject(testData);}

    private void buildObject(Map<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "emailFieldValue":
                    setEmailFieldValue(testData.get(key));
                    break;
                case "passwordFieldValue":
                    setPasswordFieldValue(testData.get(key));
                    break;
            }
        }
    }

    public String getEmailFieldValue() {
        return emailFieldValue;
    }

    public void setEmailFieldValue(String emailFieldValue) {
        this.emailFieldValue = emailFieldValue;
    }

    public String getPasswordFieldValue() {
        return passwordFieldValue;
    }

    public void setPasswordFieldValue(String passwordFieldValue) {
        this.passwordFieldValue = passwordFieldValue;
    }
}
