package myjunitframework.annotation;

public class Example {

    @UnitTest(value="Test 1. This test will pass.")
    public void pass() {
        int a = 1;
        if (1 == a) {
            a = 2;
        }
    }

    @UnitTest("Test 2. This test will fail.")
    public void fail() throws Exception {
        throw new Exception();
    }
    
    @UnitTest(value="Test 3. This test will pass.")
    public void pass2() {
        int a = 1;
        if (1 == a) {
            a = 2;
        }
    }

    @UnitTest("Test 4. This test will fail.")
    public void fail2() throws Exception {
        throw new Exception();
    }
    
    
    public void pass3() {
        int a = 1;
        if (1 == a) {
            a = 2;
        }
    }

}