package com.Game.TicTacToeSpringBoot;

public class Game {

    private final String space = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
    private final String sp = "&nbsp;&nbsp;&nbsp;&nbsp;";
    public String a1 = "<a href=\"/1\">_</a>";
    public String a2 = "<a href=\"/2\">_</a>";
    public String a3 = "<a href=\"/3\">_</a>";
    public String a4 = "<a href=\"/4\">_</a>";
    public String a5 = "<a href=\"/5\">_</a>";
    public String a6 = "<a href=\"/6\">_</a>";
    public String a7 = "<a href=\"/7\">_</a>";
    public String a8 = "<a href=\"/8\">_</a>";
    public String a9 = "<a href=\"/9\">_</a>";


    public String toString(){
        return ""+space+"|"+space+"|     <br>" +
                ""+sp+a1+sp+"|"+sp+a2+sp+"|"+sp+a3+"  <br>" +
                "_____|_____|_____<br>" +
                ""+space+"|"+space+"|     <br>" +
                ""+sp+a4+sp+"|"+sp+a5+sp+"|"+sp+a6+"  <br>" +
                "_____|_____|_____<br>" +
                ""+space+"|"+space+"|     <br>" +
                ""+sp+a7+sp+"|"+sp+a8+sp+"|"+sp+a9+"  <br>" +
                ""+space+"|"+space+"|     ";
    }

}
