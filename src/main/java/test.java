import org.apache.commons.lang3.StringUtils;
import sun.security.pkcs.ParsingException;
import sun.security.provider.PolicyParser;

import javax.xml.bind.ValidationException;
import java.math.BigDecimal;
import java.util.regex.Pattern;

public class test {
    public static final String NUMBER_REGEX = "\\p{Digit}+";
    private int index = 0;
    private String content = "";
    public static void main(String[] args) throws Exception {
        test test=new test();
        BigDecimal var=new BigDecimal(5000000);
        BigDecimal var1=new BigDecimal(5000000.26);
        System.out.println(test.getMessageString("RequestTotalAmount",decimalToNumForSystemI(var,11),11));
        System.out.println(test.getMessageString("JugdeAmount",decimalToNumForSystemI(var1,11),11));
    }

    public static String decimalToNumForSystemI(BigDecimal val,int size){
        String temp=val.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        System.out.println(temp);
        String substring1 = temp.substring(0, temp.length() - 3);
        String substring2 = temp.substring(temp.length() - 2, temp.length());
        return StringUtils.leftPad(substring1 + substring2, size, "0");

    }

    private void validateMessage(String fieldName, String value, int length) throws ValidationException {
        validateMessage(fieldName, value, length, false);
    }
    public String getMessageString(String fieldName, String value, int length) throws Exception {

        validateMessage(fieldName, value, length);
        String result = "";
        value = StringUtils.isBlank(value) ? "" : value;
        value = StringUtils.trimToEmpty(value).replaceAll("\\p{Cc}", "");

        result = StringUtils.rightPad(value, length, "");
        return result;
    }
    private void validateMessage(String fieldName, String value, int length, boolean isNumeric) throws ValidationException {

        if (value != null) {

            if (isNumeric && !Pattern.compile(NUMBER_REGEX).matcher(value).matches()) {
                String errorMsg = String.format("Field '%s', should be number (%d)", fieldName, length);
                throw new ValidationException("50002", errorMsg);
            }

            if (value.length() > length) {
                String errorMsg = String.format("Field '%s', is longer than define length (%d)", fieldName, length);
                throw new ValidationException("50002", errorMsg);
            }

        }
    }


    public String getStringValue(String fieldName, int intLength) throws Exception {
        String strValue = "";
        int beginIndex = this.index;
        int endIndex = beginIndex + intLength;

        try {
            if (this.index <= this.content.length()) {
                if (endIndex > this.content.length()) {
                    strValue = StringUtils.substring(this.content, beginIndex);
                } else {
                    strValue = StringUtils.substring(this.content, beginIndex, endIndex);
                }
            }

            this.index = endIndex;
            strValue = StringUtils.trimToEmpty(strValue).replaceAll("\\p{Cc}", "");

        } catch (Exception ex) {
            throw new PolicyParser.ParsingException(50003, String.format("Invalid request %s=%s.", fieldName, strValue));
        }
        return strValue;
    }

}
