package org.threads;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringCountAndMultiThreading Stringcount = new StringCountAndMultiThreading();
        Stringcount.logsLimiter( List.of("aaaaaa","aaaaaa","bbbbb","bbbbb","ccccc","ccccc","aaaaaa","aaaaaa","aaaaaa","ccccc","ccccc","aaaaaa","aaaaaa","aaaaaa","ccccc","ccccc","aaaaaa"));
    }
}
