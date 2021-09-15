import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class CBSConstant {

	public static final int DSP_LENGTH = 312;
	public static final int MBASE_LENGTH = 381;
	public static final int ABCS_LENGTH = 106;

	public static final int START_CONTENT_INDEX = DSP_LENGTH + MBASE_LENGTH;

	public static final TimeZone TIME_ZONE_ASIA_BANGKOK = TimeZone.getTimeZone("Asia/Bangkok");
	public static final TimeZone TIME_ZONE_UTC = TimeZone.getTimeZone("UCT");
	
	public static final String CBS_DATE_FORMAT = "yyyyMMdd";
	public static final String CBS_DATETIME_FORMAT = "yyyy-MM-dd-HH.mm.ss.SSS000";
	public static final String CBS_DATETIME_FORMAT_23CHR = "yyyy-MM-dd-HH.mm.ss.SSS";
	public static final String CBS_TIME_FORMAT = "HHmmss";
	public static final String CBS_EMPTY_DATE = "00000000";
	public static final String CBS_EMPTY_TIME = "000000";
	public static final String CBS_EMPTY_DATETIME = "0000-00-00-00.00.00.000000";
	//public static final String CBS_CHARSET = "cp838";
	public static final String CBS_CHARSET = "cp874";
	
	public static final int CBS_DATE_LENGTH = 8;
	public static final int CBS_DATETIME_LENGTH = 26;
	public static final int CBS_TIME_LENGTH = 6;
	
	public static final String MDX_DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
//	public static final String SEND_SMS_DATETIME_FORMAT_ = "yyy-MM-dd"
	
//	public static final String MDX_DATE_FORMAT = "yyyyMMdd";
//	public static final String MDX_DATETIME_FORMAT = "yyyyMMddHHmmssSSS";
//	public static final String MDX_TIME_FORMAT = "HHmmssSSS";

//	public static final String TRANSACTION_LOG = "TRANSACTIONLOG";
	
	public static final String ERROR_ACCOUNT_TYPE = "Error from Account Type";

	public static final String CHAR_Y = "Y";
	public static final String CHAR_N = "N";

	public static final String CBS_EXCEPTION = "Error from CBS";
	public static final String MDX_EXCEPTION = "Error from MDX";

	public static final String RESPONSE_SUCCESS_PREFIX = "/";
	public static final String RESPONSE_DSP_PREFIX = ".DSP";
	public static final String RESPONSE_ERROR_PREFIX = ".";

	public static final String RESPONSE_CODE_DEFAILT = "NA";
	public static final String RESPONSE_CODE_AA = "AA";
	public static final String RESPONSE_CODE_AB = "AB";
	public static final String RESPONSE_CODE_AC = "AC";
	public static final String RESPONSE_CODE_AV = "AC";

	public static final String RESPONSE_DESC_DEFAILT = "Undefined Error (See. transaction log for more.)";
	public static final String RESPONSE_DESC_AA = "Success";
	public static final String RESPONSE_DESC_AB = "Error from Host";
	public static final String RESPONSE_DESC_AV = "Hit validation from Host";

	public static final String RESPONSE_CODE_SUCCESS = "AA";
	public static final String RESPONSE_DESC_SUCCESS = "Success";

	public static final String ERROR_INVALID_REQUEST = "50002";//"MDWE400";
	public static final String ERROR_INVALID_RESPONSE = "50003";
	public static final String ERROR_UNSUPPORTED_ENCODING = "MDWE801";
	//public static final String ERROR_SOCKET_TIMEOUT = "MDWE093";
	public static final String ERROR_SOCKET_TIMEOUT = "50400";
	public static final String ERROR_INTERNAL = "50002";//"MDWE500";
	//public static final String ERROR_UNDEFINED = "MDWE999";50002
	public static final String ERROR_UNDEFINED = "59900";
	
	public static final String ERROR_OUTBOUND_SL = "Error Message from SL-CBS on";
	public static final String INCOMING_OUTBOUND_SL = "Receive Message from SL-CBS on";
	
	public static final String SYNC_PROFILE_DEFAULT_VALUE = "-";
	public static final String SYNC_PROFILE_DEFAULT_DATE = "";
	
	public static final String LOG_NODE_OUTBOUND_1 = "SL-CBS1";
	public static final String LOG_NODE_OUTBOUND_2 = "SL-CBS2";
	public static final String LOG_NODE_OUTBOUND_3 = "SL-CBS3";
	public static final String LOG_NODE_OUTBOUND_4 = "SL-CBS4";
	
	public static final String ERROR_DATE_TIME_JAVA = "Invalid DateTime";
	
	public static final Map<String,String> CBS_OUT_BOUND_TC;
	static{
		CBS_OUT_BOUND_TC = new HashMap<>();
		
		
		CBS_OUT_BOUND_TC.put("AXC804000", "AXC804000");//SMG : send sms
		CBS_OUT_BOUND_TC.put("AXC805000", "AXC805000");//SMG : send email
		
	}
	
	public static final Map<String,String> CBS_OUT_BOUND_TC_TRIGGER;
	static{
		CBS_OUT_BOUND_TC_TRIGGER = new HashMap<>();
		CBS_OUT_BOUND_TC_TRIGGER.put("INT10130", "INT10130");//ats
	}
	
	
	public static final Map<String,String> dspErrorDesc;
	static {
		dspErrorDesc = new HashMap<>();
		dspErrorDesc.put(".DSP0001", "SIBS: Internal system error");
		dspErrorDesc.put(".DSP0002", "SIBS: Route name not found");
		dspErrorDesc.put(".DSP0003", "SIBS: Transaction Timeout");
		dspErrorDesc.put(".DSP0004", "SIBS: Program exception error");
		dspErrorDesc.put(".DSP0005", "SIBS: Auto reversal was rejected");
		dspErrorDesc.put(".DSP0006", "SIBS: System is not ready to process");
		dspErrorDesc.put(".DSP0007", "SIBS: Duplicate application key");
		dspErrorDesc.put(".DSP0008", "SIBS: Unknow data format");
		dspErrorDesc.put(".DSP0009", "SIBS: Conversion not found");
		dspErrorDesc.put(".DSP0010", "SIBS: Host not logged on");
		dspErrorDesc.put(".DSP0011", "SIBS: System watchdog failed to start job");
		dspErrorDesc.put(".DSP0012", "SIBS: Invalid source id");
		dspErrorDesc.put(".", "SIBS: Unknow error");
	}
	
	
	

}
