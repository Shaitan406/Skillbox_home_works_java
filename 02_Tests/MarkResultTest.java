import org.junit.Assert;
import org.junit.Test;

public class MarkResultTest {
    @Test
    public void markTest1() {
        var actualResult = getMarkResult(0);
        Assert.assertEquals("2", actualResult);

    }
    @Test
    public void markTest2() {
        var actualResult = getMarkResult(35);
        Assert.assertEquals("2", actualResult);
    }
    @Test
    public void markTest3() {
        var actualResult = getMarkResult(36);
        Assert.assertEquals("3", actualResult);
    }
    @Test
    public void markTest4() {
        var actualResult = getMarkResult(56);
        Assert.assertEquals( "3", actualResult);
    }
    @Test
    public void markTest5() {
        var actualResult = getMarkResult(57);
        Assert.assertEquals( "4" , actualResult);
    }
    @Test
    public void markTest6() {
        var actualResult = getMarkResult(71);
        Assert.assertEquals("4", actualResult);
    }
    @Test
    public void markTest7() {
        var actualResult = getMarkResult(72);
        Assert.assertEquals("5" , actualResult);
    }
    @Test
    public void markTest8() {
        var actualResult = getMarkResult(100);
        Assert.assertEquals("5" , actualResult);
    }
    @Test
    public void markTest9() {
        var actualResult = getMarkResult(-1);
        Assert.assertEquals("no mark result" , actualResult);
    }
    @Test
    public void markTest10() {
        var actualResult = getMarkResult(110);
        Assert.assertEquals("no mark result" , actualResult);
    }

    private String getMarkResult(Integer mark) {
        if (mark >= 0 && mark <= 35) return "2";
        if (mark >= 36 && mark <= 56) return "3";
        if (mark >= 56 && mark <= 71) return "4";
        if (mark >= 72 && mark <= 100) return "5";
        return "no mark result";
    }
}
