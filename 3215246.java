import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


//The Class representing the HTTP Request
class HttpRequest {

	//Request line   
	String Mtd;
	String URL;
	String Ver; 
	
	// Header Line
	Map<String,String> headers = new HashMap<>();
	
	//Entity body 
	String body;
}

//The Class Representing of a HTTP Response 
class HttpResponse {
	
	//Status Line 
	String vers; 
	int stsCode; 
	String phrase; 
	
	//Header line
	Map<String, String> headers= new HashMap<>();
	
	//Entity body
	String body; 
	
}

//class representing a DNS message
class DNSMessage{
	
	//12 byte field
	int identifier; 
	int flags;
	int numofQuestions;
	int numofAnswersRRs;
	int numofAutoritiyRRs; 
	int numofAdditionalRRs;

	//DNS question: Name, type fields for a query
	List<String> ques = new ArrayList<>();
	
	//DNS answer: RRs in response to query
	List<String> answer = new ArrayList<>();
	
	//DNS authority: Records for authoritative servers
	List<String> authority = new ArrayList<>();
	
	//DNS Additional information: Additional "helpful" info that may be used
	List<String> addiInfo = new ArrayList<>();

}
	
	
