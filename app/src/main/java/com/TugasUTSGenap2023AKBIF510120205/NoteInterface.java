package com.TugasUTSGenap2023AKBIF510120205;

import android.database.Cursor;

import com.TugasUTSGenap2023AKBIF510120205.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}


// 10120205 - Raya Adhary - IF5

