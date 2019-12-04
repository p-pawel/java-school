package programator.katowice;

import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.text.similarity.LevenshteinDistance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer x = new LevenshteinDistance().apply("pies", "wydra");
        System.out.println(x);

        System.out.println(LocaleUtils.availableLocaleList());
    }
}
