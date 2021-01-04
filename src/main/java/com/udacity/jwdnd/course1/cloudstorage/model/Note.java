package com.udacity.jwdnd.course1.cloudstorage.model;

import java.math.BigInteger;

public class Note {

    private BigInteger noteId;
    private String noteTitle;
    private String noteDescription;
    private BigInteger userId;

    public Note(BigInteger noteId, String noteTitle, String noteDescription, BigInteger userId) {
        this.noteId = noteId;
        this.noteTitle = noteTitle;
        this.noteDescription = noteDescription;
        this.userId = userId;
    }

    public BigInteger getNoteId() {
        return noteId;
    }

    public void setNoteId(BigInteger noteId) {
        this.noteId = noteId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }
}
