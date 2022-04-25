package practice2;

/*
内部クラスは、外部クラスのフィールドを直接参照することが可

public class Outer {

    private String greeting = "こんにちは";

    public class Inner {

        public String hello() {
            return greeting;
        }
    }
}

※内部クラスInnerがstaticな場合は、参照できすにコンパイルエラー

参照されるフィールドもstaticな場合は、staticな内部クラスからも参照可

public class Outer {

  // staticなフィールドgreeting
    private static String greeting = "こんにちは";

  // staticな内部クラスInner
    public static class Inner {

        public String hello() {
      // 外部クラスOuterのフィールドgreetingはstaticなので、参照可能
            return greeting;
        }
    }

}
 */
