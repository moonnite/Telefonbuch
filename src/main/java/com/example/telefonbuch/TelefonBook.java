package com.example.telefonbuch;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TelefonBook {

    private final ObservableList<TelefonEntry> entries = FXCollections.observableList((new ArrayList<>()));
    private final FilteredList<TelefonEntry> filteredList = new FilteredList<>(entries);
    public TelefonBook(){
        entries.add(new TelefonEntry("Test","Eintrag","123"));
        entries.add(new TelefonEntry("Test2","Eintrag2","684"));
    }

    public ObservableList<TelefonEntry> getEntries() {
        return entries;
    }

    public void filter(String str) {
        filteredList.setPredicate(telefonEntry -> {
            return telefonEntry.match(str);
        });
    }
}
