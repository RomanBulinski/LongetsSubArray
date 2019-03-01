import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongest {

    @Test
    public void testGetLongestSubarr(){
        Longest longestSubArr = new Longest();
        String testString = "aabbbhcccck";
        assertEquals(4,longestSubArr.getLongestSubarr( testString ));
    }
    @Test
    public void testGetLongestSubarr2(){
        Longest longestSubArr = new Longest();
        String testString = "aab1111111111bbhcccck";
        assertEquals(10,longestSubArr.getLongestSubarr( testString ));
    }

    @Test
    public void testGetLongestSubarr3(){
        Longest longestSubArr = new Longest();
        String testString = "kk";
        assertEquals(2,longestSubArr.getLongestSubarr( testString ));
    }

}
