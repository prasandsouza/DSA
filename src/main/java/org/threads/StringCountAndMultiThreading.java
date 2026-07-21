package org.threads;

import java.util.*;
import java.util.stream.Collectors;

public class StringCountAndMultiThreading {

    public List<String> logsLimiter(List<String> logs){

        Map<String, Long> topLogs = logs.stream().collect(Collectors.groupingBy(domain->domain,Collectors.counting()));
        System.out.println(topLogs);

        List<String> tops = topLogs.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).limit(2).map(Map.Entry::getKey).toList();;
        System.out.println(tops);

        return null;

    }
}
