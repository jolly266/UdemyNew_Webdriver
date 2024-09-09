package inputData;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {

	public List<HashMap<String,String>> getJsonDataToMap(String filePath) throws IOException {

		String jsonFilePath = System.getProperty("user.dir") + "/src/test/java/inputData/PurchaseOrder.json";

		// Read Json to String
		String jsonContent = FileUtils.readFileToString(new File(jsonFilePath));

		// String to HashMap
		ObjectMapper mapper = new ObjectMapper();

		List<HashMap<String, String>> data = mapper.readValue(jsonContent,new TypeReference<List<HashMap<String, String>>>() {
				});
		
		return data;

	}

}
