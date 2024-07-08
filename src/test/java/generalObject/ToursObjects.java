package generalObject;

import java.util.Map;

public class ToursObjects {

    private String TestTourValue;

    public ToursObjects (Map<String, String> testData){
        buildObject(testData);
    }

    public void buildObject(Map<String, String> testData) {
            for (String key: testData.keySet()){
                switch (key){
                    case "TestTourValue_1":
                        setTestTourValue(testData.get(key));
                        break;
                }
            }
        }

    public String getTestTourValue() {
        return TestTourValue;
    }

    public void setTestTourValue(String testTourValue) {
        TestTourValue = testTourValue;
    }
}
