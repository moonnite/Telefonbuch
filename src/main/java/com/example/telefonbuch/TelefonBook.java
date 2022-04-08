package com.example.telefonbuch;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.util.ArrayList;
import java.util.List;

public class TelefonBook {

    private final ObservableList<TelefonEntry> entries = FXCollections.observableList((new ArrayList<>()));
    private final FilteredList<TelefonEntry> filteredList = new FilteredList<>(entries);

    public TelefonBook(){

        entries.add(new TelefonEntry("readString","lol","efs"));
        entries.add(new TelefonEntry("Test","Eintrag","123"));
        entries.add(new TelefonEntry("Toller","Name","684"));
        entries.add(new TelefonEntry("Noch Besserer","Vorname","5772 5534"));
        entries.add(new TelefonEntry("Jetzt","Reichts","45 544543"));
    }

    public ObservableList<TelefonEntry> getEntries() {
        return entries;
    }

    public void filter(String str) {
        filteredList.setPredicate(telefonEntry -> {
            return telefonEntry.match(str);
        });
    }

    public ObservableList<TelefonEntry> getFilteredEntries() {
        return filteredList;
    }

    public void removeAll(List<TelefonEntry> selectedEntries) {
        entries.removeAll(selectedEntries);
    }

    public void addEmpty() {
        entries.add(new TelefonEntry("<empty>","<empty>","<empty>"));
    }
}