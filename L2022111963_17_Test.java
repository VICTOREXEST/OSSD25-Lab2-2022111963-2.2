import java.util.*;
import org.junit.*;

public class L2022111963_17_Test {
    /**
     * 总体原则：等价类划分
     */
    @Test
    public void test1() {
        /**
         * 使用的测试用例：AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT
         * 等价类：存在出现多次长度为10的DNA序列，且碱基种类大于1
         */
        Solution17 sol = new Solution17();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> res = sol.findRepeatedDnaSequences(s);
        Set<String> expected = new HashSet<>(Arrays.asList("AAAAACCCCC", "CCCCCAAAAA"));
        Assert.assertEquals(new HashSet<>(res), expected);
    }

    @Test
    public void test2() {
        /**
         * 使用的测试用例：AAAAAAAAAAAAA
         * 等价类：存在出现多次长度为10的DNA序列，且只有一种碱基
         */
        Solution17 sol = new Solution17();
        String s = "AAAAAAAAAAAAA";
        List<String> res = sol.findRepeatedDnaSequences(s);
        Set<String> expected = new HashSet<>(Arrays.asList("AAAAAAAAAA"));
        Assert.assertEquals(new HashSet<>(res), expected);
    }

    @Test
    public void test3() {
        /**
         * 使用的测试用例：ACGTACGT
         * 等价类：不存在出现多次长度为10的DNA序列
         */
        Solution17 sol = new Solution17();
        String s = "ACGTACGT";
        List<String> res = sol.findRepeatedDnaSequences(s);
        Set<String> expected = new HashSet<>();
        Assert.assertEquals(new HashSet<>(res), expected);
    }

    @Test
    public void test4() {
        /**
         * 使用的测试用例：""
         * 等价类：空字符串
         */
        Solution17 sol = new Solution17();
        String s = "";
        List<String> res = sol.findRepeatedDnaSequences(s);
        Set<String> expected = new HashSet<>();
        Assert.assertEquals(new HashSet<>(res), expected);
    }
}