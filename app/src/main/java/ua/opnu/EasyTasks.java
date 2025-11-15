package ua.opnu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EasyTasks {

    public static void main(String[] args) {
    }

    public List<Integer> doubling(List<Integer> nums) {
        if (nums == null) return null;
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        if (nums == null) return null;
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        if (strings == null) return null;
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        if (nums == null) return null;
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        if (nums == null) return null;
        return nums.stream()
                .filter(n -> Math.abs(n) % 10 != 9)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        if (strings == null) return null;
        return strings.stream()
                .filter(s -> s == null || !s.toLowerCase().contains("z"))
                .collect(Collectors.toList());
    }

    public List<String> refinedStrings(List<String> strings) {
        if (strings == null) return null;
        return strings.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .collect(Collectors.toList());
    }

    public List<String> flatten(List<String> strings) {
        if (strings == null) return null;
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
    }
}
