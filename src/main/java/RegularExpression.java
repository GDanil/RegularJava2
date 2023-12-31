import java.util.regex.Pattern;

public class RegularExpression
{
    boolean ip_Check(String s)
    {
        String regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        if(Pattern.matches(regex,s)) return true;
        else return false;
    }
    boolean GUID_Check(String s)
    {
        String regex = "^([0-9a-fA-F]{8})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{12})$";
        if(Pattern.matches(regex,s)) return true;
        else return false;
    }
    boolean url_Check(String s)
    {
        String regex = "^(https?\\:\\/\\/)?(\\w+\\.)*[0-9A-Za-z][0-9A-Za-z]+\\.\\w{1,3}(\\:\\d+)?((\\/\\w+)+\\.\\w+)?(\\?\\w+=\\w+(&\\w+=\\w+)*)?(\\#\\w+)?$";
        if(Pattern.matches(regex,s)) return true;
        else return false;
    }
    boolean pass_is_diff(String s)
    {
        String regex = "(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[0-9A-Za-z_]{8,}";
        if(Pattern.matches(regex,s)) return true;
        else return false;
    }
}
