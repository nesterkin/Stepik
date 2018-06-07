package org.stepik.java.module2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String role : roles) {
            map.put(role, new ArrayList<>());
        }

        String role, roleText;
        for (int i = 1; i <= textLines.length; i++) {
            String currentTextLine = textLines[i - 1];
            int pos = currentTextLine.indexOf(":");
            role = currentTextLine.substring(0, pos);
            roleText = i + ")" + currentTextLine.substring(pos + 1);
            List<String> tempList = map.getOrDefault(role, new ArrayList<>());
            tempList.add(roleText);
            map.put(role, tempList);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            role = entry.getKey().toString();
            stringBuilder.append(role).append(":\n");
            List<String> list = map.getOrDefault(role, Collections.emptyList());
            for (String aList : list) {
                stringBuilder.append(aList).append("\n");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}