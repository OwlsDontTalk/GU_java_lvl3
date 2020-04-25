package lesson_7;

import java.sql.SQLOutput;

public class TestLib {
    public static void start(String testClassName){
        System.out.println("Test for class " + testClassName + " initiated. Starting...");
        runBeforeSuite(testClassName);
        runTest(testClassName);
        runAfterSuite(testClassName);
    }

    private static void runAfterSuite(String testClassName) {
        System.out.println("Searching for @runAfterSuite annotation");
    }

    private static void runTest(String testClassName) {
        System.out.println("Searching for @Test annotation");
    }

    private static void runBeforeSuite(String testClassName) {
        System.out.println("Searching for @runBeforeSuite annotation");
    }
}
