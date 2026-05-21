package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<String> data = new ArrayList<>(
                Arrays.asList("H", "B", "D","A", "B", "J", "B","A", "C", "A")
        );
        System.out.println("原始列表: " + data);

        moveABeforeFirstB(data);
        System.out.println("处理结果: " + data);
        System.out.println("ldw");
    }

    /**
     * 操作：将所有 A 移动到 第一个 B 之前
     */
    public static void moveABeforeFirstB(List<String> list) {
        if (list == null || list.isEmpty()) return;

        int firstB = list.indexOf("B");
        if (firstB == -1) return;

        int countA = 0;
        // 一次遍历统计所有A
        for (String s : list) {
            if ("A".equals(s)) countA++;
        }
        if (countA == 0) return;

        // 原地移除所有A
        list.removeIf("A"::equals);
        // 批量插入所有A（仅一次插入）
        list.addAll(firstB, Collections.nCopies(countA, "A"));
    }
}
