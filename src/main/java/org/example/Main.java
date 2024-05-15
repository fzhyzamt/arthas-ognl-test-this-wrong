package org.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    private final List<String[]> list;

    public Main() {
        list = new java.util.ArrayList<>();
        list.add(new String[]{"a", "b", "c"});
        list.add(new String[]{"d", "e", "f"});
        list.add(new String[]{"g", "h", "i"});
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        while (true) {
            main.test();
        }
    }

    private void test() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    }
}