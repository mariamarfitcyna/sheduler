package NoteStrusture;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.List;

/*
 * Класс представляющий собой заметку на день
 * Хранит несколько Task'ов - дел на этот день
 */
public class Note {
    //private List<Task> tasksList;

    /*public Note(){
        tasksList = new ArrayList<>();
    }*/

    private String note;
    public Note(){
        note = "";
        System.out.println("note - " + note);
    }

    public void addText(String text){
        note = text;
        System.out.println("text - " + text);
    }

    public String getText(){
        return note;
    }


}
