// Adaptee
class JSONAnalyticsTool {
    private String pJsonData;

    public void setJsonData(String jsonData) {
        this.pJsonData = jsonData;
    }

    public void analyzeData() {
        if (pJsonData.contains("json")) {
            System.out.println("Analysing JSON Data - " + pJsonData);
        } else {
            System.out.println("Not correct format. Can't analyse!");
        }
    }
}

// Target (Interface)
interface AnalyticsTool {
    void analyzeData();
}

// Adapter
class XMLToJSONAdapter implements AnalyticsTool {
    private JSONAnalyticsTool jsonTool;

    public XMLToJSONAdapter(String xmlData) {
        System.out.println("Converting the XML Data '" + xmlData + "' to JSON Data!");
        String newData = xmlData + " in json";
        jsonTool = new JSONAnalyticsTool();
        jsonTool.setJsonData(newData);
    }

    @Override
    public void analyzeData() {
        jsonTool.analyzeData();
    }
}

// Main Class (Client)
public class AdapterPatternDemo {
    public static void main(String[] args) {
        String xmlData = "Sample Data";

        // Using JSON tool directly with wrong format
        JSONAnalyticsTool tool1 = new JSONAnalyticsTool();
        tool1.setJsonData(xmlData); // Not JSON format
        tool1.analyzeData();

        System.out.println("----------------------------------------------");

        // Using adapter
        AnalyticsTool tool2 = new XMLToJSONAdapter(xmlData);
        tool2.analyzeData();
    }
}
