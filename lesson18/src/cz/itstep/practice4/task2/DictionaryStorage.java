package cz.itstep.practice4.task2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DictionaryStorage {
    private Map<String, String> dictionaryStorageEnCz;
    private Map<String, String> dictionaryStorageCzEn;
    private Map<String, Integer> requestCountOfWords;

    public DictionaryStorage() {
        this.dictionaryStorageEnCz = new HashMap<>();
        this.dictionaryStorageCzEn = new HashMap<>();
        this.requestCountOfWords = new HashMap<>();
    }

    public void put(String enWord, String czWord) {
        dictionaryStorageEnCz.put(enWord, czWord);
        dictionaryStorageCzEn.put(czWord, enWord);
        requestCountOfWords.put(enWord, 0);
        requestCountOfWords.put(czWord, 0);
    }

    public Map<Integer, List<Map.Entry<String, Integer>>> getByRequests() {
        return requestCountOfWords.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue));

    }

    public List<Map.Entry<String, Integer>> getTopTenKeywords() {
        return requestCountOfWords.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(10)
                .collect(Collectors.toList());
    }

    public Optional<String> searchWord(String keyword) {
        final String translation;

        if (dictionaryStorageCzEn.containsKey(keyword)) {
            translation = dictionaryStorageCzEn.get(keyword);
        } else if (dictionaryStorageEnCz.containsKey(keyword)) {
            translation = dictionaryStorageEnCz.get(keyword);
        } else {
            translation = null;
        }

        requestCountOfWords.compute(keyword, (key, oldValue) ->
                oldValue != null ? oldValue + 1 : 1
        );

        return Optional.ofNullable(translation);
    }

    public void replace(String oldWord, String newWord) {
        if (dictionaryStorageCzEn.containsKey(oldWord) || dictionaryStorageEnCz.containsKey(oldWord)) {
            this.dictionaryStorageCzEn.replace(oldWord, newWord);
            this.dictionaryStorageEnCz.replace(oldWord, newWord);
        } else {
            System.out.println("Vybrané slovo ve slovníku nebylo nalezeno.");
        }
    }

    public void remove(String removingWord) {
        if (dictionaryStorageCzEn.containsKey(removingWord) || dictionaryStorageEnCz.containsKey(removingWord)) {
            this.dictionaryStorageCzEn.remove(removingWord);
            this.dictionaryStorageEnCz.remove(removingWord);
        } else {
            System.out.println("Vybrané slovo ve slovníku nebylo nalezeno.");
        }
    }


    @Override
    public String toString() {
        return "DictionaryStorage{" +
                "dictionaryStorageEnCz=" + dictionaryStorageEnCz +
                ", dictionaryStorageCzEn=" + dictionaryStorageCzEn +
                ", requestCountOfWords=" + requestCountOfWords +
                '}';
    }
}
