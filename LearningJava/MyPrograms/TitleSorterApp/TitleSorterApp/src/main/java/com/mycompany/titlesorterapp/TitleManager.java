/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.titlesorterapp;

/**
 *
 * @author Paxton.Clark
 */
import java.io.*;
import java.util.*;

public class TitleManager {
    private final List<Title> titles;
    private final File file;

    public TitleManager(String fileName) {
        this.titles = new ArrayList<>();
        this.file = new File(fileName);
        loadTitles();
    }

    public void addTitle(String titleName) {
        for (Title title : titles) {
            if (title.getName().equalsIgnoreCase(titleName)) {
                return;
            }
        }
        titles.add(new Title(titleName));
        saveTitles();
    }

    public void addTagsToTitle(String titleName, String tagsInput) {
        for (Title title : titles) {
            if (title.getName().equalsIgnoreCase(titleName)) {
                String[] tags = tagsInput.split(",");
                for (String tag : tags) {
                    title.addTag(tag.trim());
                }
                saveTitles();
                return;
            }
        }
    }

    public void removeTagFromTitle(String titleName, String tag) {
        for (Title title : titles) {
            if (title.getName().equalsIgnoreCase(titleName)) {
                title.removeTag(tag);
                saveTitles();
                return;
            }
        }
    }

    public void deleteTitle(String titleName) {
        titles.removeIf(title -> title.getName().equalsIgnoreCase(titleName));
        saveTitles();
    }

    public List<Title> getTitlesSortedByName() {
        titles.sort(Comparator.comparing(Title::getName));
        return titles;
    }

    public List<Title> getTitlesSortedByTag(String tag) {
        List<Title> sortedTitles = new ArrayList<>();
        for (Title title : titles) {
            if (title.getTags().contains(tag)) {
                sortedTitles.add(title);
            }
        }
        sortedTitles.sort(Comparator.comparing(Title::getName));
        return sortedTitles;
    }

    public void saveTitles() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Title title : titles) {
                writer.write(title.getName() + ";" + String.join(",", title.getTags()) + "\n");
            }
        } catch (IOException e) {
        }
    }

    private void loadTitles() {
        if (!file.exists()) return;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                Title title = new Title(parts[0]);
                if (parts.length > 1 && !parts[1].isEmpty()) {
                    String[] tags = parts[1].split(",");
                    for (String tag : tags) {
                        title.addTag(tag);
                    }
                }
                titles.add(title);
            }
        } catch (IOException e) {
        }
    }
}
